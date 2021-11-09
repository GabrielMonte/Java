import java.util.Scanner; //sera para entrada de teclado


public class calc {
  
     static public void main(String[] args){
        Scanner scan=new Scanner(System.in);

        num n1=new num();
        num n2=new num();
        num n3=new num();
        num n4=new num();
        num res=new num();
        String opc="S";


        while(opc.equals("s") || opc=="S"){
        System.out.printf("%nDigite o valor 1: ");
            n1.setValor(scan.nextInt());

        System.out.printf("%nDigite o valor 2: ");
            n2.setValor(scan.nextInt());

        System.out.printf("%nDigite o valor 3: ");
            n3.setValor(scan.nextInt());

        System.out.printf("%nDigite o valor 4: ");
            n4.setValor(scan.nextInt());

            res.setValor(n1.getValor() + n2.getValor());
            res.setValor(n3.getValor() * n4.getValor());

        System.out.printf("%nA soma de %d e igual a %d" ,n1.getValor(),n2.getValor(),res.getValor());
        System.out.printf("%nA soma de %d e igual a %d" ,n3.getValor(),n4.getValor(),res.getValor());

        System.out.printf("%nDeseja somar outro valor?");
        opc=scan.next();
        System.out.printf("%n%n%n");

        
    
            }

        }
    }
