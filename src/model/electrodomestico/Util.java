package model.electrodomestico;

/**
 * Created by Laptop on 30/03/2017.
 */
public class Util {


    /**
     * Method to check if the value of our string is empty or not
     *
     * @param stringArg Value of String arg
     * @return String with  content of the string or  a empty string
     */

    static public String checkEmptyString(String stringArg) {


        String emptyString = "";
        String unknown = "Unknown";

        return stringArg.trim().equals(emptyString) ? unknown : stringArg;

    }

    /**
     * Method to check if the value of our double is valid
     * Valid Double >  0
     * Inval Double <= 0
     *
     * @param doubleArg Value of double arg
     * @return Double with the value of our doubleArg if is valid  or the value of a minimum double valid (0)
     */

    static public Double checkPositiveDouble(Double doubleArg) {

        Double invalidDouble = 0.0;

        return doubleArg < invalidDouble ? invalidDouble : doubleArg;

    }


    static public char checkEmptyChar(char charArg) {
        char charValidValor[] = {'a', 'A', 'b', 'B', 'c', 'C', 'd', 'D', 'e', 'E', 'f', 'F'};
        char notValidChar = 'X';


        for (int i = 0; i < charValidValor.length; i++) {
            if (charArg == charValidValor[i]) {
                return charArg;
            }
        }
    return notValidChar;}
}

