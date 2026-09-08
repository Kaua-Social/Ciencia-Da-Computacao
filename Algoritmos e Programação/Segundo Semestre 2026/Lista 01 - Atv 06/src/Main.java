//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner text = new Scanner(System.in);
    double salario;
    double porcentagem;

    System.out.print("Digite seu salário: ");
    salario = text.nextDouble();
    System.out.print("Digite a porcentagem de aumento: ");
    porcentagem = text.nextDouble();

    double aumento = salario * (porcentagem / 100);
    System.out.println("Valor em reais do aumento: " + aumento);

    salario += aumento;
    System.out.print("Valor do novo salário: " + salario);

}
