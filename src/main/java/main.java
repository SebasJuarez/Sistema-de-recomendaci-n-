import java.io.*;
import java.util.*;


public class main {
    public static void main(String[] args) {
        GUI Interfaz= new GUI();
        operations OP = new operations();
        local_database DB = new local_database();
        Interfaz.show();

        Interfaz.setManufacturers(DB.getCarManufacturers());
        while (true){
            Interfaz.setMaxValue(OP.MapRange(0, 100, 5000, 5000000, Interfaz.getMaxSlider()));
            Interfaz.setMinValue(OP.MapRange(0, 100, 5000, 5000000, Interfaz.getMinSlider()));
        }
    }
    
}
