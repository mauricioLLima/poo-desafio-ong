public class Voluntario extends MembroONG {

    private String setor;

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    @Override
    public void exibirResumo() {
        System.out.println("--- Voluntário ---");
        super.exibirResumo();
        System.out.println("Setor: " + setor);
    }
}
