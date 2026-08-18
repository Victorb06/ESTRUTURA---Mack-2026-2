/**
 * Este programa usa de um contador para conseguir mostrar o numero de pessoas presentes em um local/evento
 * @author Victor Birello
 * @version 1.0
 */

public class Contador {
    //atributos
    private int valor;

    //construtor
    public Contador() {
        valor = 0;
    }

    //metodos
    public void incrementa(){
        valor++;
    }

    public void zera(){
        valor = 0;
    }

    public int getValor(){
        return valor;
    }
}