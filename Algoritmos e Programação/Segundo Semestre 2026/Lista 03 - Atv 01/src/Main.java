void main() {
    Scanner text = new Scanner(System.in);

    int valor;

    System.out.print("Digite seu número: f");
    valor = text.nextInt();

    if (valor <= 1){
        System.out.print("A função(x) é: 1");
    }
    else if(valor > 1 && valor <= 2){
        System.out.print("A função(x) é: 2");
    }
    else if (valor > 2 && valor <= 3){
        valor *= valor;
        System.out.print("A função(x) é: " + valor);
    }
    else if (valor > 3){
        valor *= valor * valor;
        System.out.print("A função(x) é: " + valor);
    }
}