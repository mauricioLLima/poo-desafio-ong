public class Doador extends MembroONG {

    private double valorDoadoMensal;

    public double getValorDoadoMensal() {
        return valorDoadoMensal;
    }

    public void setValorDoadoMensal(double valor) {
        this.valorDoadoMensal = valor;
    }

    @Override
    public void exibirResumo() {
        System.out.println("--- Doador ---");
        super.exibirResumo();
        System.out.println("Status: Doador Ativo | Valor Mensal: R$ " + valorDoadoMensal);
    }
}
