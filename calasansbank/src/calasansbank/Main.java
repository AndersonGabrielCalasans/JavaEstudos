package calasansbank;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Gabriel", "10314248498");
        cliente.setProfissao("Dev Cloud");

        System.out.println(cliente.getNome());

        Conta conta = new Conta(7977, 15449, cliente);

        conta.deposita(500);

        System.out.println(conta.getSaldo());
        System.out.println(Conta.getTotal());
        
    }
}
