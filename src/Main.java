import database.DatabaseUtil;

public class Main {
    public static void main(String[] args) {
        DatabaseUtil util = new DatabaseUtil();
        util.saveData();
        util.loadData();
    }
}
