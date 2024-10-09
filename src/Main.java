public class Main {
    public static void main(String[] args) {

        int primeiroNumero = 10;
        int segundoNumero = 20;

        int soma = primeiroNumero + segundoNumero;
        int subtracao = primeiroNumero - segundoNumero;
        int multiplicacao = primeiroNumero * segundoNumero;
        int divisao = primeiroNumero / segundoNumero;

        int somaViafuncao = somarValores(primeiroNumero, segundoNumero);
        System.out.println("Valor soma " + somaViafuncao);

        int subtrairFuncao = subtrairValores(-50, -30);
        System.out.println("Valor da subtracao " + subtrairFuncao);

        int dividirFuncao = dividirValores(10, 5);
        System.out.println("Valor da divisao " + dividirFuncao);

        int multiplicarFuncao = multiplicarValores(primeiroNumero, segundoNumero);
        System.out.println("valor da multplicacao " + multiplicarFuncao);
    }

    public static int somarValores(int numA, int numB) {

        return numA + numB;
    }
    public static int subtrairValores(int numA, int numB){

        if(numA < 0){
            numA = numA * -1;
        }
            numB = numB * -1;


        return numA-numB;
    }
    public static int dividirValores(int numA, int numB) {

        return numA / numB;
    }
    public static int multiplicarValores(int numA, int numB){
        return numA * numB;
    }

}