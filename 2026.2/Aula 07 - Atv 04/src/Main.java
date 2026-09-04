//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner text = new Scanner(System.in);

    double valor;

    System.out.print("Digite o valor da sua compra: ");
    valor = text.nextDouble();

    if (valor >= 100){
        valor *= 0.90;
        System.out.print("O valor da sua compra com desconto é: " + valor);
    }
    else{
        System.out.print("O valor da sua compra continuou sendo: " + valor);
    }
}