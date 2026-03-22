package services.list;

import java.util.ArrayList;
import java.util.List;

import dominio.user.user;

public class list_user {
    // lista
    List<user> usuario = new ArrayList<>();

    // adiciona um novo usuario
    public void add(user User){
        usuario.add(User);
    }

    // remove o usuario com base no index
    public void removeUser(int number){

        if(usuario.isEmpty()){
            System.out.println("Lista está vazia, adicione um usuario...");
            return;
        }

        for(user u: usuario){
            if(usuario.get(number) != null){
                System.out.println("Usuario Encontrado");
                System.out.println("Removendo...");
                System.out.println("Usuario Removido com Sucesso.");
            }
        }
    }

    public void listUser(){
        if(usuario.isEmpty()){
            System.out.println("Lista está vazia, adicione um usuario...");
            return;
        }

        for(user list: usuario){
            System.out.println("Usuarios: " + list.getName());
        }
    }
    
}
