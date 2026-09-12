void main() {
    Scanner text = new Scanner(System.in);

    int coeficienteA;
    int coeficienteB;
    int coeficienteC;
    double delta;
    double raiz;
    double raiz2;

    System.out.print("Digite o Coeficiente A: ");
    coeficienteA = text.nextInt();
    System.out.print("Digite o Coeficiente B: ");
    coeficienteB = text.nextInt();
    System.out.print("Digite o Coeficiente C: ");
    coeficienteC = text.nextInt();

    if (coeficienteA == 0){
        System.out.print("A Equação não é de 2º Grau.");
    }
    else{
        delta = (coeficienteB * coeficienteB) - 4 * (coeficienteA * coeficienteC);
        if (delta < 0){
            System.out.println("Não há raízes reais.");
            System.out.print("O delta é: " + delta);
        }
        else if (delta > 0){
            raiz = (-coeficienteB + Math.sqrt(delta)) / (2.0 * coeficienteA);
            raiz2 = (-coeficienteB - Math.sqrt(delta)) / (2.0 * coeficienteA);
            System.out.println("Existem duas raízes reais diferentes.");
            System.out.println("O Delta é: " + delta);
            System.out.println("A Primeira Raíz é: " + raiz);
            System.out.print("A Segunda Raíz é: " + raiz2);
        }
        else{
            raiz = - coeficienteB / (2.0 * coeficienteA);
            System.out.println("Existem duas raízes reais iguais.");
            System.out.println("O Delta é: " + delta);
            System.out.print("A Raíz é: " + raiz);
        }
    }
}