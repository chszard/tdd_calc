
/**
 * Created by chszard on 2015. 12. 16..
 */
public class main {

    public main() {
    }

    public static void main(String[] args) {

        //add
        Calculator calc = new Calculator();
        System.out.println(calc.add(10, 3));

        //substact
        System.out.println(calc.substract(4, 5));

        //multiply
        System.out.println(calc.multiply(10, 3));


        //divide
        System.out.println(calc.divide(10, 2));

    }

}
