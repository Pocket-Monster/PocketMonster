package databaseCon;

import java.sql.*;

public class Connect {
    private Connection conn;
    private static final String url = "jdbc:mysql://localhost:3306/db_pocketmon";
    private static final String userName = "root";
    private static final String password = "1234";

    public Connect() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, userName, password);
        } catch (ClassNotFoundException e) {
            System.out.println("드라이버 클래스 오류");
        }

        String sql = "INSERT INTO playerId(data_name) VALUES(?)";

        PreparedStatement pstmt = null;
        pstmt = conn.prepareStatement(sql);
        try{
            pstmt.setString(1, "TEST");
            int result = pstmt.executeUpdate();
            if(result == 1){
                System.out.println("데이터 삽입 성공");
                //pstmt.close();
            }
        } catch (Exception e) {
            System.out.println("Board데이터 삽입 실패!");
            //pstmt.close();
        }
    }
}
