public class Composta {
    public static void main(String[] args) {
        double saldo = 5.0;
        double valorSolicitado = 22.0;

        if(valorSolicitado < saldo){
            saldo= saldo - valorSolicitado;
            System.out.println("novo saldo é " + saldo);
        }else
        System.out.println("Saldo insulficiente");
    }
}
