import java.util.Scanner;
import java.io.*;

class nowe {
    public static void main(String[] args) {
        File kwadrat = new File("kawdrat.txt");
        File prostokat = new File("prostokat.txt");
        Scanner sc = new Scanner(System.in);

        System.out.println("Wybierz fgure(kwadrat lub prostokat): ");
        String figura = sc.next();

        if (figura == "kwadrat") {
            try {
                FileWriter fw = new FileWriter(kwadrat);
                fw.write(figura);
                fw.close();
            } catch (IOException e) {
                System.out.println("BLAD: "+e.toString());
            }

            }else if(figura == "prostokat"){
                try {
                    FileWriter fw = new FileWriter(prostokat);
                    fw.write(figura);
                    fw.close();
                } catch (IOException e) {
                    System.out.println("BLAD: "+e.toString());
                }
            }

            
        }
    }
