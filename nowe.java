import java.util.Scanner;
import java.io.*;

class nowe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*File kwadrat = new File("kawdrat.txt");
        File prostokat = new File("prostokat.txt");
        

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
            }*/
            System.out.println("Jaka figure chcesz wybrac(1-kwadrat 2-prostokat): ");
            String figura = sc.next();

            switch(figura){
                case "prostokat":
                    System.out.println("Podaj dlugosc boku a: ");
                    int a = sc.nextInt();

                    System.out.println("Podaj dlugosc boku b: ");
                    int b = sc.nextInt();
                    
                    //System.out.println(a+";"+b);


                    if(a == b){
                        System.out.println(a+" jest takie samo jak "+b+" to nie jest prostokat");
                    }else{
                        for(var i = 0;i < a;i++){
                            for(var j = 0;j < b;j++){
                                System.out.print("*");
                            }
                            System.out.print("\n");
                        }
                    }


                    

            }

            
        }
    }
