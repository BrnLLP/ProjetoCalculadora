public class AreaCirculo {
    public class Area {
        Calculadora calculadora = new Calculadora();
        public double areaCirculo(double raio) {
            return calculadora.multiplicacao(raio, raio) * Math.PI;
        }
    }
}
