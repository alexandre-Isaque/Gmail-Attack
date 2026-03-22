package dominio.user;

public class user {
    protected String name;

    public user(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}