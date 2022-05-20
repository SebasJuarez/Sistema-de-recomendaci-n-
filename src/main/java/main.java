import java.io.BufferedReader;
import java.io.FileReader;

public class main {
    public static void main(String[] args) {
        GUI Interfaz= new GUI();
        Interfaz.show();
        BufferedReader in  = new BufferedReader(new FileReader("LCMDB.txt"));

        String[] Manufacturer = {""};
        Interfaz.setManufacturers(Manufacturer);
    }
}
