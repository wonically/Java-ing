import java.lang.reflect.Field;
import java.util.ArrayList;

public class Wrapper {
    public static void main(String[] args) {
        //Use primitive data types as Objects.

        /*
        byte	Byte
        short	Short
        int     Integer
        long	Long
        float	Float
        double	Double
        boolean	Boolean
        char	Character
         */

        //To take value, use .<type>Value() method.
        Integer i = 2;
        //i = i.intValue(); converts it to int.
        //int n = i; this also does the trick.
        System.out.println(i);

    }
}
