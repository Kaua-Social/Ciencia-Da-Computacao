//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner text = new Scanner(System.in);

    int num1;
    int num2;

    System.out.print("Digite o número A: ");
    num1 = text.nextInt();
    System.out.print("Digite o número B: ");
    num2 = text.nextInt();
    if (num1 % num2 == 0){
        System.out.print("Sim, o " + num1 + " é divisível por " + num2);
    }
    else{
        System.out.print("Não, o " + num1 + " não é divisível por " + num2);
    }
}