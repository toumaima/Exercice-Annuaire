
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Annuaire {

    private ConcurrentHashMap<String, Fiche> table = new ConcurrentHashMap<String, Fiche>();



    /**************Chercher par nom ou sous chaine de nom ou par son numéro***************/

    public boolean Rechercher(String str) {
       Iterator<Fiche> iter = table.values().iterator();
       while (iter.hasNext()) {
       	Fiche fiche=iter.next();
           if((fiche.nom).startsWith(str)){
                fiche.afficher();
                return true;}
           else  if((fiche.numero).equals(str)){
        	   fiche.afficher();
        	   return true;}

        }
       return false;
       }



    /************************Modifier une fiche*****/
    public void modifier(String str){
    	Iterator<Fiche> iter = table.values().iterator();
        while (iter.hasNext()) {
        	Fiche fiche=iter.next();
            if(fiche.nom.equals(str)||fiche.nom.equals(str))
              {
            	fiche.remplacer(str);
            	table.replace(fiche.numero,fiche);
               }
            else if((fiche.numero).equals(str)){
            	fiche.remplacer(str);
            	table.putIfAbsent(str,fiche);
               }

               }
    	}

/*************supprimer une fiche************************/
    public void supprimer(String numero){
        if (table.containsKey(numero))
                table.remove(numero);
     }


    /*************************inserer une fiche**************/
    public void inserer(Fiche fiche) {
        if(fiche.empty()){
        	fiche.saisir();
        table.put(fiche.numero,fiche);}
        else
       table.put(fiche.numero,fiche);
        }



    /***********************************Lister tout les fichiers*******************/
    public void ListerTout() {
        Iterator<Fiche> iter = table.values().iterator();
        while (iter.hasNext()) {
            System.out.println("---------------------------------------");
            iter.next().afficher();
        }
        System.out.println("---------------------------------------");
    }




    /*****************************Size**********************/
   public int size(){
	   return table.size();
   }

   }
