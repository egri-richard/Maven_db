package hu.petrik.dbdemo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Adatbazis {
    private static final String url = "jdbc:mysql://localhost:3306/dolgozok";
    private static final String username = "root";
    private static final String password = "";
    private Connection conn;

    public Adatbazis() throws SQLException {
        conn = DriverManager.getConnection(url, username, password);
    }

    public List<Dolgozo> list() throws SQLException {
        List<Dolgozo> dolgozoList = new ArrayList<>();

        String sql ="SELECT * FROM dolgozok";
        Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while(resultSet.next()) {
            int id = resultSet.getInt("id");
            int kor = resultSet.getInt("kor");
            int fizetes = resultSet.getInt("fizetes");
            String nev = resultSet.getString("nev");
            String nem = resultSet.getString("nem");
            Dolgozo d = new Dolgozo(id, nev, nem, kor, fizetes);
            dolgozoList.add(d);
        }
        return dolgozoList;
    }
}
