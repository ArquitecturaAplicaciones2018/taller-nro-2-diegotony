import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static  void main(String[] args){
        var rationals = List.of(
                new Rational(1, 4),
                new Rational(1, 8),
                new Rational(3, 4),
                new Rational(7, 8));


        var unMedio = new Rational(1,2);
        for(Rational r : rationals){
            if(r.isLessThan(unMedio)){
                System.out.println(r);
            };
        }

        rationals.stream()
                .filter(rational -> rational.isLessThan(unMedio))
                .forEach(rational -> System.out.print("\n"+rational));

        System.out.println("\n");
        var r = new Rational(0,1);
        var uno = new Rational(1,1);

        // 2.- Sumar todos los racional
        System.out.println("Sumar todos los racional");
        System.out.println(rationals.stream().reduce(Rational::plus).get());

        // 3.- Obtener el número racional mayor
        System.out.println("Obtener el número racional mayor");
        System.out.println(rationals.stream().max(Comparator.comparing(Rational::toString)).get());

        // 4.- Sumar todos numeradores y obtener los siguientes datos: número de elementos,
        // la suma de los numeradores, el numerador menor, el mayor y el promedio

        // Suma de los numeradores
        System.out.println("Suma de los numeradores");
        System.out.println(rationals.stream().reduce(Rational::plus).get().getNumerator());
        //Numero de elementos
        System.out.println("Numero de elementos");
        System.out.println(rationals.stream().count());
        //La Numerador menor
        System.out.println("Numerador Menor");
        System.out.println(rationals.stream().min(Comparator.comparing(Rational::toString)).get().getNumerator());
        //La Numerador mayor
        System.out.println("Numerador mayor");
        System.out.println(rationals.stream().max(Comparator.comparing(Rational::toString)).get().getNumerator());
        // El promedio
        System.out.println("Promedio");
        System.out.println(rationals.stream().mapToDouble(Rational::getNumerator).average().getAsDouble());


    }

}
