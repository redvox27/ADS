import java.util.ArrayList;

/**
 * Created by Gebruiker on 16-2-2017.
 */
public class RecursionOne {
    ArrayList<Integer> array = new ArrayList<>();


     public float getResult(float number) {
        float i = 0f;
        float result = 0f;

        while (number > 1) {
            result +=  number / (2 * number + 1);
            number--;

        }
        return result + 1/3;
    }

    public float getRecResult(float number){
        float result = 0f;

        if(number <= 1){
            return 1/3;
        }
        else{
            result =  number / (2 * number +1) + getRecResult(number-1);
            return result;
        }
    }

    public int getLargestNumber(){
        array.add(5);
        array.add(4);
        array.add(7);
        array.add(1);

        int current =0;
        int max = 0;
        int i =0;

        while (i <array.size()){
            current = array.get(i);
            if (current > max){
                max = current;
                i++;
            }
            else{
                i++;
            }

        }
        return max;
    }

}
