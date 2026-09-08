//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner text = new Scanner(System.in);

    int kwh;

    System.out.print("Digite o valor da sua conta de energia: ");
    kwh = text.nextInt();

    if (kwh <= 100){
        kwh = (int) (kwh * 0.50);
        System.out.print("O valor da sua conta de energia é: " + kwh);
    }
    else if (kwh <= 200){
        kwh = (int) (kwh * 0.70);
        System.out.print("O valor da sua conta de energia é: " + kwh);
    }
    else{
        kwh = (int) (kwh * 0.90);
        System.out.print("O valor da sua conta de energia é: " + kwh);
    }
}