package com.company;

import bo.ListeDesTâches;
import bo.Tâche;

import java.util.Scanner;

public class Main {

    private static String toDoListName;


    public static void main(String[] args) {
        ListeDesTâches toDoList = new ListeDesTâches(toDoListName); // créatrion de la liste de base;
        while (true){
            int numAction; // une variable pour le numéro des actions réalisables

            System.out.println("Entrez ce que vous voulez faire : \n" +
                    "1) Créez une toDoList\n" +
                    "2) Ajouter une toDo à votre liste \n" +
                    "3) Supprimer un toDo de votre liste\n" +
                    "4) modifider un toDo dans votre liste\n" +
                    "5) Afficher l'historique");

            Scanner action = new Scanner(System.in);
            numAction = action.nextInt();
            if(numAction==1){
                System.out.println(("Entrez le nom"));
                Scanner actionIn = new Scanner(System.in); // ActionIn pour modifier le nom de la toDoList;
                toDoListName = actionIn.nextLine();
                toDoList.setName(toDoListName);
            }
            else if (numAction == 2){
                String name; // variable pour le nom de la tâche;
                String descriiption; // la description de la tache
                String état; // son état (fini ou pas)
                Tâche tache;
                int version;
                System.out.println(("Entrez le nom"));
                Scanner actionName = new Scanner(System.in);
                name = actionName.nextLine();
                System.out.println(("Entrez la description"));        /*vous
                                                                       verez qu'il y'a des scanner pour chaque variable*/
                Scanner actionDesc = new Scanner(System.in);
                descriiption = actionDesc.nextLine();
                System.out.println(("Entrez l'état"));
                Scanner actionEtat = new Scanner(System.in);
                état = actionEtat.nextLine();
                System.out.println(("Entrez la version"));
                Scanner actionV = new Scanner(System.in);
                version = actionV.nextInt();
                tache = new Tâche(name,descriiption,état,version);
                toDoList.ajouter(tache);
                toDoList.getToDoList();
            }
            else if (numAction == 3){
                int supprNum; // numéro de la tache à supprimer
                System.out.println(("Entrez le numéro"));
                Scanner actionSuppr = new Scanner(System.in);
                supprNum = actionSuppr.nextInt();    // actionSuppr = action supprimer;
                toDoList.supprimer(supprNum);
                toDoList.getToDoList();
            }
            else if (numAction == 4){
                int numAction2; // variable pour la deuxième serie d'action
                int numToDo; // numéro de la tache à faire à modifier (pour tous les attributs)
                String nom;
                String description;
                String état;
                Scanner action2 = new Scanner(System.in);
                System.out.println(("Entrez le numéro du toDo que vous voulez modifier:"));
                numToDo = action2.nextInt();
                System.out.println(("Entrez le numéro de l'attribut que vous voulez modifier:\n" +
                        "1) le nom;\n" +
                        "2) la description;\n" +
                        "3) l'état;"));
                Scanner actionModif1 = new Scanner(System.in);
                numAction2 = actionModif1.nextInt();
                if(numAction2 ==1 ){
                    System.out.println(("Entrez le nom"));
                    Scanner actionModif1_1 = new Scanner(System.in);
                    nom = actionModif1_1.nextLine();
                    toDoList.modifierNom(numToDo,nom);
                }
                else  if(numAction2 ==2 ){
                    System.out.println(("Entrez le nom"));
                    Scanner actionModif1_2 = new Scanner(System.in);
                    description = actionModif1_2.nextLine();
                    toDoList.modifierDescription(numToDo,description);
                }
                else  if(numAction2 ==3 ){
                    System.out.println(("Entrez le nom"));
                    Scanner actionModif1_3 = new Scanner(System.in);
                    état = actionModif1_3.nextLine();
                    toDoList.modifierEtat(numToDo,état);
                }
            }
            else if(numAction == 5){
                toDoList.getHistoriqueTâche();
            }
        }

    }
}
