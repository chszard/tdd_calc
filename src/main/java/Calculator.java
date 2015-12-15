/**
 * Created by chszard on 2015. 12. 16..
 */
public class Calculator {

    int input1;
    int input2;

    public Calculator(){

    }
    public Calculator(int input1, int input2) {
        this.input1 = input1;
        this.input2 = input2;
    }

    public int add(int input1, int input2){

        return input1 + input2;
    }

    public int substract(int input1, int input2){

        return input1 - input2;
    }

    public float divide(int input1, int input2){

        if (input1 != 0 && input2 != 0)
            return input1 / input2;
        else
            return 0;
    }

    public long multiply(int input1, int input2){

        return input1 - input2;
    }
}
