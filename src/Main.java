public class Main {
    public static void main(String[] args) {

        String guardado = "Banco";
        String nome = "romulo";




        System.out.println("esse ano " + nome + " quer guardar dinheiro dentro do " + guardado);
        System.out.println("Dentro do " + guardado + " ele tem 1800 ");
        //System.out.println("Ele tambem tem 600 reais no ticket que usa em suas compras");


        double saldobanco = 1800;

        //contas fixas
        //==================================
        //==================================

        double contaluz = 350.00;
        double contaagua = 40.00;
        double containternet = 80.00;

        saldobanco = saldobanco - contaluz - contaagua - containternet;

        System.out.println("Saldo da conta: " + saldobanco);


        // a ideia do projeto é que seja meio que um simulador de vida eu adiciono algumas coisas
        // e elas se somam e subtraem na minha cabeça é para ajudar

    } // Fecha o main
} // Fecha a classe

// v 1.0.0