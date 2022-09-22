import java.util.ArrayList;
import java.util.List;

public class Fizzbuzz {
    public Object[] createFizzbuzzArray() {
        List<Object> fizzbuzzList = new ArrayList<>();
        for (int i = 1; i<=100; i++){
            if(i%3==0 && i%5==0){
                fizzbuzzList.add("FizzBuzz");
            } else if (i%3==0){
                fizzbuzzList.add("Fizz");
            } else if (i%5==0) {
                fizzbuzzList.add("Buzz");
            } else {
                fizzbuzzList.add(i);
            }
        }

        return fizzbuzzList.toArray();
    }
}
