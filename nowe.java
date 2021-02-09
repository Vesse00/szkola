import java.util.Scanner;
import java.io.*;

class nowe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            File prostokat = new File("prostokat.txt");
            File kwadrat = new File("kwadrat.txt");
       
            System.out.println("Jaka figure chcesz wybrac(kwadrat prostokat): ");
            String figura = sc.next();

            switch(figura){
                case "prostokat":
                    System.out.print("Podaj dlugosc boku a: ");
                    int a = sc.nextInt();

                    System.out.print("Podaj dlugosc boku b: ");
                    int b = sc.nextInt();
                    
                    System.out.println("("+a+";"+b+")");


                    if(a == b){
                        System.out.println(a+"(a) jest takie samo jak "+b+"(b) to nie jest prostokat");

                    }else if(a == 0 || b == 0 || a<0 || b<0){
                        System.out.println("Nie mozna podawac wartosci rownych oraz mniejszych niz 0");
                        if(a<=0){
                            System.out.println("Bok a = "+a);
                        }else if(b<=0){
                            System.out.println("Bok b = "+b);
                        }else{
                            break;
                        }
                        
                    }else{
                        for(var i = 0;i < a;i++){
                            for(var j = 0;j < b;j++){
                                System.out.print("*");
                            }
                            System.out.print("\n");
                        }

                        double poleprost = a *b;
                        int obwodprost = (2*a)+(2*b);
                        System.out.println("Pole prostokata: "+poleprost);
                        System.out.println("Obwod prostokata: "+obwodprost);

                        
                        
                    }


                    break;

                case "kwadrat":
                    System.out.print("Podaj dlugosc kwadratu: ");
                    int kw = sc.nextInt();

                    System.out.println("("+kw+";"+kw+")");

                    if(kw <=0){
                        System.out.println("Dlugosc kwadratu nie moze byc rowne ani mniejsze niz 0 ");

                    }else{
                        for(var i = 0;i < kw;i++){
                            for(var j = 0;j < kw;j++){
                                System.out.print("*");
                            }
                            System.out.print("\n");
                        }

                        double polekw = kw*kw;
                        int obwkw = (4*kw);
                        System.out.println("Pole kwadratu: "+polekw);
                        System.out.println("Obwod kwadratu: "+obwkw);
                    }
                    
                    break;
                case "exit":
                    System.exit(0);
                    break;

                
            }

            
        }
    }
