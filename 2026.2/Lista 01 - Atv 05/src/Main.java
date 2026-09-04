void main() {
    Scanner text = new Scanner(System.in);

    double altura;
    double peso;
    
    System.out.print("Digite sua altura: ");
    altura = text.nextDouble();
    System.out.print("Digite seu peso: ");
    peso = text.nextDouble();

    peso /= (altura * altura);

    System.out.print("Seu IMC é: " + peso);
}
