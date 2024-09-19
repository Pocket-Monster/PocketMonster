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

    // 데이터 저장
    public void saveData(){
        try{
            String saveSql = "INSERT INTO playerId(data_name) VALUES(?)";
            pstmt = conn.prepareStatement(saveSql);
            pstmt.setString(1, "TEST");
            int result = pstmt.executeUpdate();
            if(result == 1){
                System.out.println("데이터 삽입 성공");
            }
        } catch (Exception e) {
            System.out.println("데이터 삽입 실패");
        }
    }

    // 데이터 불러오기
    public void loadData(){
        try {
            String loadSql = "SELECT * FROM playerId";
            pstmt = conn.prepareStatement(loadSql);
            rs = pstmt.executeQuery();
            while(rs.next()){
                String dataNo = rs.getString("data_no");
                String dataName = rs.getString(2);
                System.out.println(dataNo + " 및 " + dataName);
            }
        } catch (SQLException e) {
            System.out.println("데이터 불러오기 실패");
        }
    }

    // 데이터 삭제하기
    public void deleteData(){
        try{
            String deleteSql = "DELETE FROM playerId WHERE data_no = ?";
            pstmt = conn.prepareStatement(deleteSql);
            pstmt.setString(1, "12");
            int result = pstmt.executeUpdate();
            if(result == 1){
                System.out.println("데이터 삭제 성공");
            }
        } catch (Exception e) {
            System.out.println("데이터 삭제 실패");
        }
    }
}