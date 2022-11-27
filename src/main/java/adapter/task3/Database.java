package adapter.task3;

public class Database extends БазаДаних {
    public String obtainUserData(){
        return super.отриматиДаніКористувача();
    }
    public String obtainStaticData(){
        return super.отриматиСтатистичніДані();
    }
}
