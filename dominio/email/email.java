package dominio.email;

public class email {
    private String gmail;
    private static String signal = "@gmail.com";

    public email(String gmail){
        this.gmail = gmail;
    }

    private void dados(){
        if(gmail.isEmpty()){
            System.out.println("Dados Incorretos, Tente Novamente!!!");
            return;
        }

        
    }

    public String getGmail(){
        return this.gmail;
    }
}
