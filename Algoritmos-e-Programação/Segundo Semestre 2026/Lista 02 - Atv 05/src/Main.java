//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner text = new Scanner(System.in);

    double temperatura;
    int escolha;

    System.out.print("Digite o valor da temperatura: ");
    temperatura = text.nextDouble();

    System.out.print("Digite 1 para converter sua temperatura para Fahrenheit ou 2 para Kelvin: ");
    escolha = text.nextInt();
    if ( escolha == 1){
        temperatura *= 1.8 + 32;
        System.out.print("Sua temperatura convertida em Fahrenheit é: " + temperatura);
    }
    else if ( escolha == 2){
        temperatura += 273.15;
        System.out.print("Sua temperatura convertida em Kelvin é: " + temperatura);
    }
    else{
        System.out.print("Você digitou uma opção inválida");
    }
}