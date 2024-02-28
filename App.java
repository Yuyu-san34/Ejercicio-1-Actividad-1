import java.util.Scanner;

public class App {
    public static void main(String[] args){
        int edjuan,edalber,edmama,edana;
        Scanner entrada= new Scanner(System.in);
        edjuan= entrada.nextInt();
        edalber=2*(edjuan/(3));
        edana=4*(edjuan/3);
        edmama=edjuan+edalber+edana;
        System.out.println("LAS EDADES SON: ALBERTO="+edalber+"JUAN="+edjuan+"ANA="+edana+"MAMA="+edmama);
        entrada.close();
        }
    }



