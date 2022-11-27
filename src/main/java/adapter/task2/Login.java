package adapter.task2;

import java.time.LocalDate;

public class Login {
    public Client login(String loginMethod){
        if(loginMethod.equals("twitter")){
            return new TwitterClient(new TwitterUser("dobosevch@ucu.edu.ua", "Ukraine", "2022-11-20"));
        }else if(loginMethod.equals("facebook")){
            return new FacebookClient(new FacebookUser("dobosevych@ucu.edu.ua", Country.Ukraine, LocalDate.of(2022, 11, 20)));
        }
        return null;
    }
}

