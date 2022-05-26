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
            Budget_Min = OP.Int_MapRange(0, 100, 5000, 5000000, Interfaz.getMinSlider());
            Budget_Max = OP.Int_MapRange(0, 100, 10000, 5000000, Interfaz.getMaxSlider());
            if (Interfaz.getButtonState() == true){
                if (Budget_Min + 5000 < Budget_Max){
                    Interfaz.setMinValue(OP.Int_MapRange(0, 100, 5000, 5000000, Interfaz.getMinSlider()));
                    Interfaz.setMaxValue(OP.Int_MapRange(0, 100, 10000, 5000000, Interfaz.getMaxSlider()));
                }else{
                    Interfaz.setMinValue(Budget_Max - 5000);
                    Interfaz.setMaxValue(Budget_Max);
                }
            }else{
                if (Budget_Min + 5000 < Budget_Max){
                    Interfaz.setMinValue(OP.Int_Clamp(Interfaz.getMinValueText(), 5000, 5000000));
                    Interfaz.setMaxValue(OP.Int_Clamp(Interfaz.getMaxValueText(), 10000, 5000000));
                }else{
                    Interfaz.setMinValue(OP.Int_Clamp(Interfaz.getMaxValueText()-5000, 5000, 5000000));
                    Interfaz.setMaxValue(OP.Int_Clamp(Interfaz.getMaxValueText(), 10000, 5000000));
                }
            }
        }
    }
}
