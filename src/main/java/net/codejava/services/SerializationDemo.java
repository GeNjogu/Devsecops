package net.codejava.services;

import java.io.*;

public class SerializationDemo {

    public static void main(String[] args) {
        try {
            // Deserialize object from file
            FileInputStream fileIn = new FileInputStream("user.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            User user = (User) in.readObject();
            in.close();
            fileIn.close();

            // Print user details
            System.out.println("Username: " + user.getUsername());
            System.out.println("Email: " + user.getEmail());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class User implements Serializable {
    private String username;
    private String email;

    // Getters and setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
