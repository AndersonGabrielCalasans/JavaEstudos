package AppConta;

public class App {
    public static void main(String[] args) {

        // ContaCorrente cc = new ContaCorrente(2505, 1008);
        // cc.deposita(500);
        
        // try {
        //     cc.saca(1000);
        // } catch (SaldoInsuficienteException e) {
        //     System.out.println(e.getMessage());
        // }

        // System.out.println(cc.getSaldo());

        // SeguroDeVida sv = new SeguroDeVida();

        // CalculadorImposto ci = new CalculadorImposto();

        // ci.registra(cc);
        // ci.registra(sv);
        // System.out.println(ci.getTotalImposto());
        
        // System.out.println(Prioridade.MAX.getPrioridade());


        String s1 = new String("Ola"); 
        String s2 = new String("Ola");
        String s3 = s1;
        System.out.println(s1 == s2); //PRIMEIRA COMPARAÇÃO
        System.out.println(s1.equals(s2)); //SEGUNDA COMPARAÇÃO




        System.out.println(s1 == s3); //TERCEIRA COMPARAÇÃO
    }
}