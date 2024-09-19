import database.DatabaseUtil;

public class Main {
    public static void main(String[] args) {
        DatabaseUtil util = new DatabaseUtil();
        util.deleteData();
        util.loadData();
    }
}
