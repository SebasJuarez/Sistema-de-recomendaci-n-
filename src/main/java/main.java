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
            int Budget_Min, Budget_Max;
            Budget_Min = OP.MapRange(0, 100, 5000, 5000000, Interfaz.getMinSlider());
            Budget_Max = OP.MapRange(0, 100, 5000, 5000000, Interfaz.getMaxSlider());
            if (Budget_Min + 4900 < Budget_Max){
                Interfaz.setMinValue(OP.MapRange(0, 100, 5000, 5000000, Interfaz.getMinSlider()));
                Interfaz.setMaxValue(OP.MapRange(0, 100, 5000, 5000000, Interfaz.getMaxSlider()));
            }else{
                Interfaz.setMinValue(Budget_Max - 5000);
                Interfaz.setMaxValue(Budget_Max);
            }
        }
    }
}
