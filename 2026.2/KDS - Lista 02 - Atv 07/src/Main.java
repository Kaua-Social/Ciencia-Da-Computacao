//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner text = new Scanner(System.in);

    double renda;
    double prestacao;
    double limite;

    System.out.print("Digite o valor da sua renda: ");
    renda = text.nextDouble();
    System.out.print("Digite o valor da sua prestação: ");
    prestacao = text.nextDouble();

    limite = renda * (30.0 / 100);

    if (renda < 10000 && prestacao > 3000) {
        System.out.print("Financiamento negado por alta prestação.");
    }
    else if (limite < prestacao) {
        System.out.print("Financiamento negado por baixa renda.");
    }
    else {
        System.out.print("Financiamento aprovado!");
    }
}