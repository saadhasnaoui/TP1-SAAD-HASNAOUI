/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.util.*;
public class TestEtudiant {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        
        Etudiant etud2 = new Etudiant();
        Etudiant etud1 = new Etudiant();
        
        
        
        
        int lenght;
        float[] notes;
        System.out.println("entrez le nombre de notes que vous voulez mettre: ");
            lenght = scan.nextInt();
        notes = new float[lenght];
        System.out.println("entrez les notes");
        
        for (int i= 0 ; i<lenght ; i+1)
        {
            notes[i] =scan.nextInt();
            
        }
    
        System.out.println();
        
        String nom;
        String prenom;
        String id;
        
        System.out.println("entrez le nom de l'étudiant:");
        nom = scan.next();
        System.out.println("entrez le prenom de l'étudiant:");
        prenom = scan.nextLine();
        System.out.println("Entrez votre numero id :");
        id = scan.next();
        
        etud1.modifieur("id", "nom", "prenom", notes, lenght);
        System.out.println(et1.nom + et1.prenom );
        System.out.println("les notes que vous avez entrées sont:");
        etud1.affichertab();
        System.out.println("notes aléatoires : ");
        et1.ramtab();
        et1.affichertab();
        et1.moyenne();
        
      
        
  
        
    
}
