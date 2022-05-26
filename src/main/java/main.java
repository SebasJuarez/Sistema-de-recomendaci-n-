import java.io.*;
import java.util.*;

public class main {
    public static void main(String[] args) {
        GUI Interfaz= new GUI();
        operations OP = new operations();
        database_parser DBP = new database_parser();
        local_database DB = new local_database();
        Interfaz.show();

        Interfaz.setManufacturers(DB.getCarManufacturers());
    }
}
