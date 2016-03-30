import java.util.Scanner;
public class Fiche {
    String nom;
    String numero;
    String adresse;

    public Fiche() {

        nom = "";
        numero = "";
        adresse = "";
    }


    public void setup (String nom,String num,String addresse ) {

    	this.numero=num;
        this.nom = nom;
        this.adresse=addresse;
        }



    public void afficher() {
        System.out.println("nom:     " + nom);
        System.out.println("numero:  " + numero);
        System.out.println("adresse: " + adresse);
    }

    public void saisir() {

        nom     = get("nom     ", nom);
    	numero  = get("numero  ", numero);
    	adresse = get("adresse ", adresse);
    	}
    public void remplacer(String str){
    	if(nom==str)
    		nom=get("nom     ", nom);
    	if(numero==str)
    		numero=get("numero  ", numero);
    	if(adresse==str)
    		adresse = get("adresse ", adresse);

    }

    private static String get(String str1, String str2) {
        System.out.print(str1+ ":"+str2  );
	    Scanner scanner = new Scanner(System.in);
        String reponse = scanner.nextLine();
        if (reponse.length() > 0){

        	return reponse;

        }
        else
        {
            return str2;}

    }



    public boolean empty(){
    return (nom==""&&numero==""&&adresse=="");
    }
}
