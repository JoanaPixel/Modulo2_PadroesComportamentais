package grupo2_strategy;

//Interface do Strategy
interface PlanoStrategy {
 double calcularPreco();
}

class PlanoBasico implements PlanoStrategy {
 @Override
 public double calcularPreco() {
     return 19.90;
 }
}

class PlanoPadrao implements PlanoStrategy {
 @Override
 public double calcularPreco() {
     return 29.90;
 }
}

class PlanoPremium implements PlanoStrategy {
 @Override
 public double calcularPreco() {
     return 39.90;
 }
}

class Assinatura {
 private PlanoStrategy plano;

 public Assinatura(PlanoStrategy plano) {
     this.plano = plano;
 }

 public void mostrarPreco() {
     System.out.printf("Valor da assinatura: R$ %.2f%n", plano.calcularPreco());
 }
}
