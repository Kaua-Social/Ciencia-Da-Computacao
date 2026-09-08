//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner text = new Scanner(System.in);
    double valor;
    System.out.print("Digite o valor do produto: ");
    valor = text.nextDouble();
    valor *= 0.90;
    System.out.print("Seu produto com 10% de desconto custa: " + valor);
}
