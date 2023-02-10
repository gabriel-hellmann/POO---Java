public class principal{
    public static void main(String[] args) {        
        
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();

        cc.depositar(100.00);
        cc.transferir(50, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}