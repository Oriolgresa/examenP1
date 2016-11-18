package edu.upc.eetac.dsa;

import org.apache.log4j.Logger;

import java.util.HashMap;

/**
 * Created by OriolGresa on 18/11/16.
 */
public class Singleton implements InterfaceJava {


    static final Logger logger = Logger.getLogger(Singleton.class);
    private static Singleton instance;
    private User user;
    private Etakemon etakemon;
    private HashMap<Integer,User> listaUsuarios;
    private Singleton(){listaUsuarios = new HashMap<Integer, User>();}
    public static Singleton getInstance() {
        if (instance == null) instance = new Singleton();
        return instance;
    }

    public void getAllUsersByName() {



    }

    /*public void addUser(String nombre,String direccion, int dni) {

        user = new User(nombre,direccion,dni);
        int i = 1;
        while (true) {
            listaUsuarios.put(i, user);
            i++;
            logger.info("usuario añadido");
            continue;
        }

    }*/

    public void updateUser() {

    }
    public void getUser(){

    }
    public void getEtakemons(){

    }
    public void addEtakemon() {

    }



}
