package database;

import java.sql.*;

public class DatabaseUtil {
    private Connection conn;
    private PreparedStatement pstmt = null; // sql 구문을 실행하는 클래스
    private ResultSet rs = null;
    private static final String url = "jdbc:mysql://localhost:3306/db_pocketmon"; // DB 주소
    private static final String userName = "root";
    private static final String password = "1234";

    public DatabaseUtil() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // 드라이버 사용 선언
            conn = DriverManager.getConnection(url, userName, password); // Conn과 DB 연결
        } catch (ClassNotFoundException e) {
            System.out.println("Driver Class 읽기/불러오기 실패");
        } catch (SQLException e){
            System.out.println("Database 접속 정보가 유효하지 않습니다.");
        }
    }

    public void saveData(){
        try{
            String sql = "INSERT INTO playerId(data_name) VALUES(?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "TEST");
            int result = pstmt.executeUpdate();
            if(result == 1){
                System.out.println("데이터 삽입 성공");
            }
        } catch (Exception e) {
            System.out.println("데이터 삽입 실패");
        }
    }

    public void loadData(){
        try {
            String sql = "SELECT * FROM playerId";
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while(rs.next()){
                String dataNo = rs.getString("data_no");
                String dataName = rs.getString(2);
                System.out.println(dataNo + " 및 " + dataName);
            }
        } catch (SQLException e) {
            System.out.println("Database 저장 실패");
        }
    }
}