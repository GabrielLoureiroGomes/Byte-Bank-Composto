public class TestaBanco {

    public static void main(String[] args) {
        Cliente gabriel = new Cliente();
        gabriel.nome = "Gabriel Loureiro";
        gabriel.cpf = "111.111.111-11";
        gabriel.profissao = "Desenvolvedor";

        Conta contadoGabriel = new Conta();
        contadoGabriel.depositar(200);
        System.out.println(contadoGabriel.getSaldo());
    }

}
