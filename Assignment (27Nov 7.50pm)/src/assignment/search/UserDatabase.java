/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.search;

/**
 *
 * @author OEM
 */
public class UserDatabase {
    private String position;
    private String name;
    private String username;
    private String password;
    
    
    public UserDatabase(){
        
    }
    
    public UserDatabase(String position, String name, String username, String password){
        this.position = position;
        this.name = name;
        this.username = username;
        this.password = password;
        
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void addCustomer(){
        
    }
}
