package adapter.task3;


import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.Test
    void main() {
        Database db = new Database();
        Authorization authorization = new Authorization();
        if(authorization.authorize(db)){
            ReportBuilder br = new ReportBuilder(db);
        }

    }
}