import java.io.*;
import java.util.HashMap;

public class Main {
    private static HashMap<String, User> userMap = new HashMap<>();

    public static void main(String[] args) {

        // Agregando nuevos usuarios
        addUser("Hensei", 984473260);
        addUser("Ariana", 938472039);
        addUser("Ibrahim", 983849234);


        // Guargando los usuarios en userList.txt
        try {
            PrintStream userList = new PrintStream("user_list.txt");
            saveUser(userList, userMap);
        } catch(IOException e) {
            System.out.println("Ha ocurrido un error");
        }


        // Imprimiendo usuarios
        try {
            FileInputStream readUserList = new FileInputStream("user_list.txt");
            System.out.println(readUser(readUserList));

        } catch(FileNotFoundException e) {
            System.out.println("No se ha encontrado el archivo");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void addUser(String name, int phoneNumber) {
        userMap.put(name, new User(name, phoneNumber));
    }

    public static void saveUser(PrintStream userList, HashMap<String, User> userMap){
        for(User user: userMap.values()) {
            String line =  user.getName() + ", " + user.getPhoneNumber();
            userList.println(line);
        }
    }

    public static String readUser(FileInputStream readUserList) throws FileNotFoundException, IOException {

        String line = null;

        try {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = readUserList.read(buffer)) != -1) {
                line = new String(buffer, 0, bytesRead);
            }

        } catch(FileNotFoundException e) {
            throw new IOException();
        }

        return line;
    }
}

class User {
    private String name;
    private int phoneNumber;

    public User(String name, int phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", phone_number=" + phoneNumber +
                '}';
    }
}