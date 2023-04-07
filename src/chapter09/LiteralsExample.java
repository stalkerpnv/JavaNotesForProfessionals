package chapter09;

import java.security.spec.RSAOtherPrimeInfo;

public class LiteralsExample {
    public static void main(String[] args) {
       /* Since Java 7 it has been possible to use one or more underscores (_) for separating groups of digits in a primitive
        number literal to improve their readability.
        For instance, these two declarations are equivalent:*/
        int iOne = 123456;
        int iTwo = 123_456;
        System.out.println(iOne==iTwo);
        byte color = 1_2_3;
        short yearsAnnoDomini= 2_016;
        int socialSecurtyNumber = 999_99_9999;
        long creditCardNumber = 1234_5678_9012_3456L;
        float piFourDecimals = 3.14_15F;
        double piTenDecimals = 3.14_15_92_65_35;

        /*This also works using prefixes for binary, octal and hexadecimal bases:*/
        short binary= 0b0_1_0_1;
        int octal = 07_7_7_7_7_7_7_7_0;
        long hexBytes = 0xFF_EC_DE_5E;

        int dec = 110; // no prefix --> decimal literal
        int bin = 0b1101110; // '0b' prefix --> binary literal
        int oct = 0156; // '0' prefix --> octal
        int hex = 0x6E; // '0x' prefix --> hexadecimal literal

        System.out.println(0x100);
        /*Boolean literals are the simplest of the literals in the Java programming language. The two possible boolean values
        are represented by the literals true and false. These are case-sensitive. For example:*/
        boolean flag = true; // using the 'true' literal
        flag = false; // using the 'false' literal

        /*String literals provide the most convenient way to represent string values in Java source code. A String literal
        consists of:
        An opening double-quote (") character.
                Zero or more other characters that are neither a double-quote or a line-break character. (A backslash (\)
        character alters the meaning of subsequent characters; see Escape sequences in literals.)
        A closing double-quote character.*/
        String s = "Hello world"; // A literal denoting an 11 character String
        String e = ""; // A literal denoting an empty (zero length) String
        String sTwo ="\""; // A literal denoting a String consisting of one
// double quote character
        String sThree = "1\t2\t3\n"; // Another literal with escape sequences
        System.out.println(sThree);
        /*If you need a string that is too long to fit on a line, the conventional way to express it is to split it into multiple
        literals and use the concatenation operator (+) to join the pieces. For example*/
        String typingPractice = "The quick brown fox " +
                "jumped over " +
                "the lazy dog";
       /* The Null literal (written as null) represents the one and only value of the null type. Here are some examples*/
    }
}
