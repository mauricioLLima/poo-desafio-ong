public class SistemaMain {

    public static void main(String[] args) {

        Voluntario voluntario = new Voluntario();
        voluntario.setNome("Carlos Silva");
        voluntario.setCpf("123.456.789-00");
        voluntario.setDiasAtuacao(120);
        voluntario.setSetor("Logística");

        Doador doador = new Doador();
        doador.setNome("Ana Souza");
        doador.setCpf("987.654.321-00");
        doador.setDiasAtuacao(60);
        doador.setValorDoadoMensal(250.00);

        ProjetoSocial projeto = new ProjetoSocial();
        projeto.setNomeDoProjeto("Educar para Transformar");
        projeto.setMetaImpacto(500);
        projeto.setLider(voluntario);

        voluntario.exibirResumo();
        System.out.println();
        doador.exibirResumo();
        System.out.println();
        projeto.iniciarProjeto();
    }
}
