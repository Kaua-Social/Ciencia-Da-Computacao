//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner text = new Scanner(System.in);

    int num;

    System.out.print("Digite seu número: ");
    num = text.nextInt();
     if ( num % 2 == 0) {
         num *= num;
         System.out.print("Seu número é par e seu quadrado é: " + num);
     }
     else{
         num *= num * num;
         System.out.print("Seu número é impar e seu cubo é: " + num);
     }
}