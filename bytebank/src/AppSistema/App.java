package AppSistema;
import AppConta.ContaCorrente;
import AppConta.ContaPoupanca;

public class App {
    public static void main(String[] args) throws Exception {

        Funcionario funcionario = new Gerente("Gabriel", "10314248498", 4000);

        // funcionario.setNome();
        // funcionario.setCpf("10314248498");
        // funcionario.setSalario(4000);

        System.out.println(funcionario.getNome() + " Bonus: " + funcionario.getBonificacao());

        Gerente g1 = new Gerente("Ligia", "07165534490", 6000);
        // g1.setNome("Ligia");
        // g1.setCpf("071655734490");
        // g1.setSalario(6000);
        g1.setSenha(1008);

        System.out.println(g1.getNome() + " Bonus: " + g1.getBonificacao());
        System.out.println(g1.autentica(1234));

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(funcionario);
        controle.registra(g1);

        System.out.println(controle.getTotalBonus());

        ContaCorrente cc = new ContaCorrente(1233, 5563);
        cc.deposita(100);

        ContaPoupanca cp = new ContaPoupanca(1233, 4566);
        cp.deposita(300);

        System.out.println(cc.getSaldo());
        System.out.println(cp.getSaldo());

        cc.transfere(50, cp);
        System.out.println(cc.getSaldo());
        System.out.println(cp.getSaldo());
    }
}
