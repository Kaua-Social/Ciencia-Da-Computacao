//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner text = new Scanner(System.in);

    double valor;
    double saldo = 1000;

    System.out.print("Digite o valor que você deseja sacar: ");
    valor = text.nextDouble();

    if (valor <= saldo){
        System.out.print("Valor sacado com sucesso.");
    }
    else{
        System.out.print("Você não possui saldo suficiente!");
    }
}