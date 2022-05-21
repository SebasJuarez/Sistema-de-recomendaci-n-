import java.io.*;
import java.util.*;


public class main {
    public static void main(String[] args) {
        GUI Interfaz= new GUI();
        Interfaz.show();
        ArrayList<String> Manufacturer = new ArrayList<>();
        
        // Agregar Marcas a GUI
        try{
            Scanner LCMDB  = new Scanner(new File("LCMDB.txt"));
            while (LCMDB.hasNextLine()){
                Manufacturer.add(LCMDB.nextLine()) ;
            }
        }catch(FileNotFoundException e){
            System.out.println("ERROR");
        }
        Interfaz.setManufacturers(Manufacturer);
    }
}
