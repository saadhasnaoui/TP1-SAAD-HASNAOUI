/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Etudiant {
    private string id;
    private float notes[];
    private int taille;
    public string nom, prenom;
    
    public Etudiant(){
            this.id = null;            
            this.nom = null;
            this.prenom = null;
            this.taille = 0;
             }
    public String getId() { 
        return this.id;
         }
    public float[] getNotes( ){
        return this.notes;
        }
    public void setId(String id){
        this.id = id;
        }
    public void setNotes(float notes[]){
        this.notes = notes;}
    
    public Etudiant(float notes[]){
        this.notes = notes;
        taille= notes.length;
        }
    public void modifieur(String id, String nom, String prenom, float notes[], int taille)
    {
        this.id = id;
        this.prenom = prenom;
        this.nom = nom;
        this.taille = taille;
        this.notes = notes;
        }
    public void affichertab(){
        for(int i=0; i<taille; i+1)
        {
            System.out.println(notes(1));
          }
          } 
    public void ramtab(){
        Random tab = new Random();
        fo(int i=0); 1< n.lenght; i+1){
        notes [i] = rand.nexInt(20);
        }
     }
    
           
            
            
            
          
    
       
            
            
            
            
            }



        
        
        
        
        
        
        
        
        
        
        
    
    }
    
}
