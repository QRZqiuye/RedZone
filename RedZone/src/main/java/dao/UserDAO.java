package dao;

import model.UserDTO;
import java.sql.*;

public class UserDAO {

    private final String jdbcURL = "jdbc:mysql://localhost:3306/redzone_db?useSSL=false&serverTimezone=UTC";
    private final String jdbcUser = "qiuye99";        
    private final String jdbcPassword = "qiuye99~!";

    // 🔹 회원가입 (INSERT)
    public boolean insertUser(UserDTO dto) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(jdbcURL, jdbcUser, jdbcPassword);

        String sql = "INSERT INTO users (username, email, password) VALUES (?, ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, dto.getUsername());
        stmt.setString(2, dto.getEmail());
        stmt.setString(3, dto.getPassword());

        int result = stmt.executeUpdate();

        stmt.close();
        conn.close();

        return result > 0;
    }

    // 🔹 로그인용 사용자 정보 조회 (SELECT)
    public UserDTO getUserByUsername(String username) {
        UserDTO user = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(jdbcURL, jdbcUser, jdbcPassword);

            String sql = "SELECT * FROM users WHERE username = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, username);

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                String email = rs.getString("email");
                String password = rs.getString("password");

                user = new UserDTO(username, email, password);
            }

            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return user;
    }
}
