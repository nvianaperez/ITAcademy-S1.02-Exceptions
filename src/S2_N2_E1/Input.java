package S2_N2_E1;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    public static byte readByte(String s, Scanner sc) {
        boolean checked = false;
        byte input = 0;
        while (!checked) {
            try {
                System.out.println(s);
                input = sc.nextByte();
                System.out.println("El valor de l'input és: " + input);
                checked = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: introdueix un número entre -128 i 127");
                sc.next();
            }
        }
        return input;
    }

    public static int readInt(String s, Scanner sc) {
        boolean checked = false;
        int input = 0;
        while (!checked) {
            try {
                System.out.println(s);
                input = sc.nextInt();
                System.out.println("El valor de l'input és: " + input);
                checked = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: introdueix un número enter");
                sc.next();
            }
        }
        return input;
    }


    public static float readFloat(String s, Scanner sc) {
        boolean checked = false;
        float input = 0.0f;
        while(!checked) {
            try{
                System.out.println(s);
                input = sc.nextFloat();
                System.out.println("El valor de l'input és: "+input);
                checked=true;
            }catch(InputMismatchException e){
                System.out.println("Error: introdueix un número float (amb coma i decimals)");
                sc.next();
            }
        }
        return input;
    }

    public static double readDouble(String s, Scanner sc) {
        boolean checked = false;
        double input = 0.00;
        while (!checked) {
            try{
                System.out.println(s);
                input = sc.nextDouble();
                System.out.println("El valor de l'input és: "+input);
                checked = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: introdueix un número double (amb coma i decimals");
                sc.next();
            }
        }
        return input;
    }

    public static char readChar(String s, Scanner sc) {
        boolean checked = false;
        String input=null;
        char inputChar=0;
        while (!checked) {
            try {
                System.out.println(s);
                input = sc.nextLine();
                if(input.length() > 1) throw new InputMismatchException();
                if(input.isEmpty()) throw new Exception();
                inputChar = input.charAt(0);
                System.out.println("El valor de l'input és: "+inputChar);
                checked=true;
            } catch (InputMismatchException e) {
                System.out.println("Error: introdueix només un caràcter (char)");
            } catch (Exception e) {
                System.out.println("Error: no ha introduit cap carácter");
            }
        }
        return inputChar;
    }

    public static String readString(String s, Scanner sc) {
        boolean checked = false;
        String input="";
        while (!checked) {
            try{
                System.out.println(s);
                input = sc.nextLine();
                if(input.length()==1) throw new InputMismatchException();
                if(input.isEmpty()) throw new Exception();
                System.out.println("El valor de l'input és: "+input);
                checked = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: l'input almenys ha de tenir dues lletres");
            } catch (Exception e) {
                System.out.println("Error: el valor de l'input està buit");
            }
        }
        return input;
    }

    public static boolean readBoolean(String s, Scanner sc) {
        boolean checked = false;
        String input;
        boolean bol = false;
        while(!checked) {
            try{
                System.out.println(s);
                input = sc.next();
                if(input.equalsIgnoreCase("S")) {
                    bol = true;
                    checked = true;
                } else if(input.equalsIgnoreCase("N")) {
                    bol = true;
                    checked = true;
                } else {
                    throw new Exception();
                }
                System.out.println("El valor de l'input és: "+input);
            } catch (Exception e) {
                System.out.println("Error: el valor de l'input ha de ser S o N");
            }
        }
        return bol;
    }
}