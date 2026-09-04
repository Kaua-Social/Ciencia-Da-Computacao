void main() {
    Scanner text = new Scanner (System.in);

    double gasolina;
    double etanol;

    System.out.print("Digite o valor da gasolina: R$ ");
    gasolina = text.nextDouble();
    System.out.print("Digite o valor do etanol:  R$ ");
    etanol = text.nextDouble();

    double proporcao = (etanol / gasolina) * 100;

    System.out.print("A proporção do etanol em relação à gasolina é de: " + proporcao);
}