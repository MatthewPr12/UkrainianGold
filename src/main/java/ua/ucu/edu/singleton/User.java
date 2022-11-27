package ua.ucu.edu.singleton;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor @NoArgsConstructor
public class User {
    public String name;
    private String email;
    private int age;

    public void save(){
        Connection connection = Connection.getInstance();
        connection.executeQuery("insert into user (email, name, age) values ('ya.prytula@ucu.edu.ua', 'Yaroslav', 21);");
    }


}
