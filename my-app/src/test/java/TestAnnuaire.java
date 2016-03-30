import static org.junit.Assert.*;

import org.junit.Test;
public class TestAnnuaire  {

	 Annuaire annuaire = new Annuaire();
	 	@Test
	public void testRechercher() {
		Fiche fiche1=new Fiche();
		 Fiche fiche3=new Fiche();
		 fiche1.setup("ouma","0754588918","valbonne");
		 fiche3.setup("ouma","0754588916","Monaco");
		 System.out.println("--------------Rechercher un contact par son nom ou numero-----------");
		annuaire.inserer(fiche1); 
		annuaire.inserer(fiche3);
		System.out.println("----------------le/les voilà--------------");
		assertTrue(annuaire.Rechercher("ou"));
		assertTrue(annuaire.Rechercher("0754588916"));
		assertFalse(annuaire.Rechercher("0"));
		assertFalse(annuaire.Rechercher("david"));
	}


	@Test
	public void testSupprimer() {
	
	     Fiche fiche2=new Fiche();
		 Fiche fiche1=new Fiche();
		 fiche1.setup("ouma","0754588918","valbonne");
		 fiche2.setup("ouma","0754588918","valbonne");
		 annuaire.inserer(fiche1);
		 annuaire.inserer(fiche2);
		 assertEquals(annuaire.size(),1);
		 annuaire.supprimer("0754588918");
		 assertEquals(annuaire.size(),0);
		System.out.println("----------------supprimer and inserer works perfectly-------------- \n");
	}
	
	@Test
	public void testModifier() {
		Fiche fiche1=new Fiche();
		Fiche fiche3=new Fiche();
		fiche1.setup("ouma","0754588918","valbonne");
		fiche3.setup("ouma","0754588916","Monaco");
		annuaire.inserer(fiche1);
		annuaire.inserer(fiche3);
		annuaire.modifier("0754588916");
		
		assertFalse(annuaire.Rechercher("0754588916"));
		System.out.println("----------------The phone-number has been modified-------------- \n");
		assertTrue(annuaire.Rechercher("11"));
		System.out.println("---------------- modification done-------------- \n");
                            }


	@Test
	public void testListerTout() {
		 /**Saisir à la main les fiches**/ 
		 Fiche fiche1=new Fiche();
		 Fiche fiche2=new Fiche();
	    annuaire.inserer(fiche1);	
		annuaire.inserer(fiche2);
		System.out.println("-----------------Lister tout les contacts------------");
	    annuaire.ListerTout();
		
	}

}

