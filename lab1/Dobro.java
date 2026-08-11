/**
 * Isso é uma java docs:
 * Este programa calcula o dobro de um número
 * @author Victor Birello
 * @version 1.0
*/
//Passo para a leitura de dados via teclado
//Passo 1
import java.util.Scanner;

public class Dobro{
    public static void main(String[] args){
        //Passo 2
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe um número: ");
        //Passo 3
        int numero = entrada.nextInt();
        int dobro = numero * 2;
        System.out.printf("O dobro de %d é %d\n", numero, dobro);
    }
}