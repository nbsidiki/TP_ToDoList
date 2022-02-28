package bo;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListeDesTâches {
    private String name;
    private int version;
    public ListeDesTâches(String name){
        this.name = name;
    }
    public void setName(String Name){
        this.name = Name;
    }
    public String getName(){
        return name;
    }


    ArrayList<Tâche> historiqueTâche = new ArrayList<Tâche>(); // liste pour l'historique à chaque modification ou suuppression;


    public ArrayList<Tâche> getHistoriqueTâche(){
        for (int i = 0; i < historiqueTâche.size(); i++) {
            System.out.println("Historiques");
            System.out.println("Nom :"+ historiqueTâche.get(i).getName()+"| Description :"+ historiqueTâche.get(i).getDescription() +"| Etat :"+  historiqueTâche.get(i).getÉtat() +"|"+"version :"+ historiqueTâche.get(i).getVersion());
        }
        return historiqueTâche;
    }

    LinkedList<Tâche> toDoList = new LinkedList<Tâche>();
    public LinkedList<Tâche> getToDoList(){
        for (int i = 0; i < toDoList.size(); i++) {
            System.out.println((i+1)+")"+"Description :"+ toDoList.get(i).getDescription()+" | "+ "Etat :"+toDoList.get(i).getÉtat());
        }
        return toDoList;
    }
    public void ajouter(Tâche newtâche){
        toDoList.add(newtâche);
        version++;
    }
    public void supprimer(int i){
        historiqueTâche.add(toDoList.get(i-1));
        toDoList.remove(i-1);
        version++;
    }
    public void modifierNom(int i ,String name){
        historiqueTâche.add(toDoList.get(i-1));
        toDoList.get(i-1).setName(name);

    }
    public void modifierDescription(int i ,String Description){
        historiqueTâche.add(toDoList.get(i-1));
        toDoList.get(i-1).setDescription(Description);
    }
    public void modifierEtat(int i ,String état){

        historiqueTâche.add(toDoList.get(i-1));
        toDoList.get(i-1).setÉtat(état);

    }
}
