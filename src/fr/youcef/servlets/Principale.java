package fr.youcef.servlets;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.youcef.beans.Adresse;
import fr.youcef.beans.Personne;
import fr.youcef.beans.Repertoire;
import fr.youcef.utils.Groupe;
import fr.youcef.utils.Interface;

/**
 * Servlet implementation class Principale
 */

@WebServlet(
		name="Principale",
		description="servletPrincipale",
		value="/home",
		initParams = {@WebInitParam(name="bgcolor", value="rgb(38,38,38)")}
		)
public class Principale extends HttpServlet implements Interface {
	private static final long serialVersionUID = 1L;
	
	private static final String PAGE_HOME = "/WEB-INF/home.jsp";
       
    
    public Principale() {
        super();
      
    }
    
    
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		@SuppressWarnings("unchecked")
		List<Repertoire> reps = (List<Repertoire>) getServletContext().getAttribute("reps");
		
		if(null == reps) {
				reps = new ArrayList<Repertoire>();
				reps.add(new Repertoire("Répertoire principal"));
				reps.add(new Repertoire("Répertoire Secondaire"));
				
				System.out.println(response.getBufferSize());
				
				
				
//		PrintWriter out = response.getWriter();
//		out.append("salut");
//		response.resetBuffer();
//		out.append("tout le monde");
				
				Personne personne;
				
				List<Groupe> groupes = new ArrayList<Groupe>();
				groupes.add(Groupe.CONTACT);
				groupes.add(Groupe.AMIS);
				groupes.add(Groupe.FAMILLE);
				groupes.add(Groupe.COLLEGUE);
				
				request.setAttribute("groupes", groupes);
				
				
				int cpt = 0;
				for (String [][] contact : CONTACTS) {
					personne = new Personne(
							contact[1][0],
							contact[1][1],
							contact[1][2],
							new Adresse(
									contact[0][0],
									contact[0][1],
									contact[0][2]
									)					 
							);
					reps.get(cpt%2).addPersonne(personne);
					cpt++;
				};
				
		}
		
		 getServletContext().setAttribute("reps", reps);
		 getServletContext().setAttribute("groupes", Groupe.values());
		 String monParam = getServletConfig().getInitParameter("bgcolor");
		 request.setAttribute("bgcolor", monParam);	
		 boolean redirect = checkIfIsFavori(request, reps);
		
		if (!redirect) {
				 getServletContext().getRequestDispatcher(PAGE_HOME).forward(request, response);
		}else {
			response.sendRedirect(request.getContextPath()+"/home");
			 }
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		List <Repertoire> reps =(ArrayList<Repertoire>) getServletContext().getAttribute("reps");
		String uri = req.getRequestURI();
		String [] tab = uri.split("/");
		String nomPersonne = tab[tab.length-1];
		nomPersonne = URLDecoder.decode(nomPersonne, "UTF-8");
		String groupeStr= req.getParameter("choixGroupe");
		Groupe groupe = Groupe.valueOf(groupeStr.toUpperCase());
		for(Repertoire rep : reps) {
			for(Personne p : rep.getListePersonnes()) {
				if(nomPersonne.equals(p.getNom())) {
					p.setGroupe(groupe);
				}
			}
		}
		resp.sendRedirect(req.getContextPath()+"/home");
	}
	
	private boolean checkIfIsFavori(HttpServletRequest req, List <Repertoire> rs) 
		throws UnsupportedEncodingException{
		
		 String  Uri = req.getRequestURI(); 
		 boolean uriContainsFavori = Uri.contains("favori");
		 String [] tab = Uri.split("/");
		 String nomPersonne = uriContainsFavori ? tab[tab.length-2] : tab[tab.length-1];
		 nomPersonne = URLDecoder.decode(nomPersonne, "UTF-8");
		 
		for (Repertoire rep : rs) {
			 for (Personne p : rep.getListePersonnes()) {
				 if(nomPersonne.equals(p.getNom())) {
					 p.setFavori(uriContainsFavori);
					return true;
				 }
			 }	
		} 
		
		return false;
	}
	
}
