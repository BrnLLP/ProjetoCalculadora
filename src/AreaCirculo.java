public class AreaCirculo {
        Calculadora calculadora = new Calculadora();
        public double areaCirculo(double raio) {
            return calculadora.multiplicacao(raio, raio) * Math.PI;
        }
    }

