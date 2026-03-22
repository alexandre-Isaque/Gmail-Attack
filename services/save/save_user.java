package services.save;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import dominio.user.user;

public class save_user {
    public void save(user usuario){
        try{
            String element = " '' ";
            String path = "user.json";

            FileWriter writer = new FileWriter(path);

            

        } catch (IOException error){
            error.printStackTrace();
        }
    }
}
