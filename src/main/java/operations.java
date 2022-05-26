public class operations {
    public int Int_MapRange(float from_A, float from_B, float to_A, float to_B, float X){
        int Value = (int) (to_A + ((X - from_A)*(to_B - to_A))/(from_B - from_A));
        return Value;
    }
    public int Int_Clamp(int val, int min, int max) {
    return Math.max(min, Math.min(max, val));
}
}
