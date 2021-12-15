package hu.petrik.dbdemo;

import java.sql.SQLException;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        try {
            Adatbazis db = new Adatbazis();
            List<Dolgozo> lista = db.list();
            for (Dolgozo d: lista) {
                System.out.println(d);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
