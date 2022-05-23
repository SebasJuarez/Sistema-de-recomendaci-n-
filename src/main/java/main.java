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
            Budget_Min = OP.MapRange(0, 100, 5000, 990000, Interfaz.getMinSlider_K()) + OP.MapRange(0, 100, 0, 10000, Interfaz.getMinSlider());
            Budget_Max = OP.MapRange(0, 100, 5000, 990000, Interfaz.getMaxSlider_K()) + OP.MapRange(0, 100, 0, 10000, Interfaz.getMaxSlider());
            if (Budget_Min + 5000 < Budget_Max){
                Interfaz.setMinValue(Budget_Min);
                Interfaz.setMaxValue(Budget_Max);
            }else{
                Interfaz.setMinValue(Budget_Max - 5100);
                Interfaz.setMaxValue(Budget_Max);
            }
        }
    }
}
