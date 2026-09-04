//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner text = new Scanner(System.in);

    int num;

    System.out.print("Digite seu número: ");
    num = text.nextInt();

    if (num % 3 == 0 && num % 7 == 0) {
        System.out.print("Sim, ele é divisível por 3 e 7.");
    }
    else{
        System.out.print("Não, ele não é divisível.");
    }
}