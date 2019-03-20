/**
 * @author Artemy Markovsky
 *
 * @version 1.2
 */

package by.belstu.it.markovsky.basejava;

import java.util.Random;
import static java.lang.Math.*;



public class JavaTest {

    // TASK B =======================================================================================

        /**
         * @value 5
         * @see private
         */
        final int fi = 5;


        static int sint;
        public final int pfi = 5;
        public static final int psfi = 5;

/**
 * @return nothing
 * @thorws no
 * @param args
*/
public static void main(String[] args) {
    // TASK A =======================================================================================

        char ch = 'c';
        int i = 123;
        short sh = 11;
        byte b = 7;
        long l = 123456789L;
        boolean bool = true;
        System.out.println("int" + i);
        System.out.println("char" + ch);
        System.out.println("double" + 123.456);
        b += i;
        System.out.println("byte = byte + int: " + b);  // 123-127, -128, -127, -126
        int res = (int) (123.456 + l);
        System.out.println("int = double+long: " + res);
        long lon = i + 2147483647L;
        System.out.println("long = int + 2147483647: " + lon);
        System.out.println("sint = " + sint);       // в классе 0, в методе не иниц нулем
        boolean con = bool && bool;
        System.out.println("bool && bool = " + con);
        boolean xor = bool ^ bool;
        System.out.println("bool ^ bool = " + xor);
        //boolean plus = bool + bool;
        long lnum = 9223372036854775807L;
        long lnum2 = 0x7fff_ffff_fffL;
        char chA = 'a', chU = '\u0061', chN = 97;
        System.out.println("sum of char: " + chA + ", " + chU + ", " + chN + "= " + chA + chU + chN);
        System.out.println("3.45 % 2.4 = " + (3.45 % 2.4));
        System.out.println("1.0/0.0 = " + (1.0 / 0.0));
        System.out.println("0.0/0.0 = " + (0.0 / 0.0));
        System.out.println("log(-345) = " + log(-345));
        System.out.println("Float.intBitsToFloat(0x7F800000) = " + Float.intBitsToFloat(0x7F800000));
        System.out.println("Float.intBitsToFloat(0xFF800000) = " + Float.intBitsToFloat(0xFF800000));


    // TASK D =======================================================================================

        System.out.println(PI);
        System.out.println(E);
        System.out.println(Math.round(PI));
        System.out.println(min(PI, E));

        int min = 0;
        int max = 1;
        int diff = max - min;
        Random random = new Random();
        int in = random.nextInt(diff + 1);
        in += min;

    // TASK E =======================================================================================

        Boolean booll = false;
        Character character = 'a';
        Integer integer = 1234;
        Byte byyte = 12;
        Short shrt = 123;
        Long llong = 123456789L;
        Double doub = 123.123456789;

        System.out.println(integer + ">>>2 = " + (integer >>> 2));  // сдвиг вправо без учета знака
        System.out.println(shrt + ">>4 = " + (shrt >> 4));
        System.out.println("~" + llong + " = " + (~llong));
        System.out.println(character + " + b = " + (character + 'b'));
        System.out.println(bool + " & true = " + (bool & true));

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);

        int unboxInt = integer;
        byte unboxByte = byyte;

        System.out.println(Integer.parseInt("0123"));
        System.out.println(Integer.toHexString(123));
        System.out.println(Integer.compare(12, 45));
        System.out.println(Integer.toString(72, 2));
        System.out.println(Integer.bitCount(76));

    // TASK F =======================================================================================

        String s34 = "2345";
        Integer intg = new Integer(s34);
        Integer integer2 = Integer.valueOf(s34);
        Integer integer3 = Integer.parseInt(s34);
        System.out.println(integer + ", " + integer2 + ", " + integer3);

        byte[] bytesFromString = s34.getBytes();
        String stringFromBytes = new String(bytesFromString);
        System.out.println(bytesFromString + ", " + stringFromBytes);

        Boolean boolFromString1 = Boolean.getBoolean(s34);
        Boolean boolFromString2 = Boolean.valueOf(s34);
        System.out.println(boolFromString1 + ", " + boolFromString2);

        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("== " + (str1 == str2)); // по ссылке
        System.out.println("equals " + (str1.equals(str2)));    // по значению
        System.out.println("compareTo " + (str1.compareTo(str2)));
        str2 = null;
        System.out.println("== " + (str1 == str2));
        System.out.println("equals " + (str1.equals(str2)));
        //System.out.println("compareTo "+(str1.compareTo(str2)));

        String newstr = "hello world!";
        for (String s : newstr.split(" ")) {
            System.out.println(s);
        }
        System.out.println("contains 'o' = " + newstr.contains("o"));
        System.out.println("hashCode = " + newstr.hashCode());
        System.out.println("indexOf 'w' = " + newstr.indexOf('w'));
        System.out.println("length = " + newstr.length());
        System.out.println("replace = " + newstr.replace('l', 'L'));

    // TASK G =======================================================================================

        char[][] c1;
        char[] c2[];
        char c3[][];
        int[] aaa = new int[0];

        int i0[] = new int[0];            // можно определить массив нулевой длины
        //System.out.println(i0[3]);      // ArrayIndexOutOfBoundsException

        c1 = new char[3][];
        for (int p = 0; p < c1.length; p++)
            c1[p] = new char[p];
        System.out.println("c1.length = " + c1.length + ", c1[0].length = " + c1[0].length + ", c1[1].length = " +
                            c1[1].length + ", c1[2].length = " + c1[2].length);

        c2 = new char[][]{{'a', 'b', 'c'}, {'a', 'b', 'c'}, {'a', 'b', 'c'}};
        c3 = new char[][]{{'d', 'e', 'f'}, {'d', 'e', 'f'}, {'d', 'e', 'f'}};
        boolean comRez = c2 == c3;
        c2 = c3;
        System.out.println(comRez);
        for (char[] chr : c2) {
            for (char c : chr) {
                System.out.print(c + " ");
            }
        }
    }
}
