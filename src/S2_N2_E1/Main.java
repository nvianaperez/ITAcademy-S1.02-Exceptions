package S2_N2_E1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InputMismatchException{
        Scanner sc = new Scanner(System.in);


        Input.readByte("Entra un byte:", sc);
        Input.readInt("Entra un número enter", sc);
        Input.readFloat("Entra un número float", sc);
        Input.readDouble("Entra un número double", sc);
        Input.readChar("Entra un caràcter char", sc);
        Input.readString("Entra un String", sc);
        Input.readBoolean("Entra un booleà", sc);


    }
}
