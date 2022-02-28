package bo;

import java.util.ArrayList;

public class Tâche {

    private String name;
    private String description;
    private String état;
    private int version;


    public Tâche(String name,String description,String état,int version){
        this.name= name;
        this.description = description;
        this.état = état;
        this.version = version;
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public String getÉtat(){
        return état;
    }
    public int getVersion(){
        return version;
    }
    public void setName(String newname){
        this.name = newname;
        version = version +1;
    }
    public void setDescription(String newdescription){
        this.description = newdescription;
        version = version +1;
    }
    public void setÉtat(String newétat){
        this.état = newétat;
        version = version +1;
    }

}
