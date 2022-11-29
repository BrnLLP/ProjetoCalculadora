public class App {
    public static void main(String[] args) throws Exception {
        AreaTriangulo areaTriangulo = new AreaTriangulo();
        System.out.println(areaTriangulo.areaTriangulo(5,8));

        ValorCompra valorCompra = new ValorCompra();
        System.out.println(valorCompra.valorCompra(25.5, 4));

        AreaTrapezio areaTrapezio = new AreaTrapezio();
        System.out.println(areaTrapezio.areaTrapezio(5, 15, 8));

        AreaCirculo areaCirculo = new AreaCirculo();
        System.out.println(areaCirculo.areaCirculo(10));

        
    }
}
