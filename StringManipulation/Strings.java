package StringManipulation;

public class Strings {
    public static void main(String[] args) {

        String s = "Quovantis";                                                 //Creating string by java string literal
        String s1 = " is a good organization";

        char[] ch = {'J', 'a', 'v', 'a'};                                       //Creating string through char array
        String str = new String(ch);
        System.out.println("1. Created this string through Char Array: " + str);


        String s2 = "Quovantis";
        String s3 = new String("Quovantis");                                //Creating Java string by new Keyword, constructor
        if (s == s2) {
            System.out.println("2. Yes s(Quovantis) and s2(Quovantis) are referring the same object from string pool");
        } else {
            System.out.println("2. No s and s2 are not referring the same object");
        }

        System.out.println("3. Concatenated two string s(Quovantis) and s1(is a good Organization):" + s.concat(s1));
        System.out.println("4. Length of s(Quovantis): " + s.length());
        System.out.println("5. Is content of s(Quovantis) and s3(Quovantis) are same: " + s.equals(s3));

        //compareTo - Compares ASCII value of characters of String until it find any difference
        //else it will return the difference of number of character
        String str7 = "Hello";
        String str8 = "Mello";
        String str9 = "Help";
        String str10 = "Hello";
        String str11 = "Fellow";
        String str12 = "Hel";
        String str13 = "H";
        System.out.println("6.1. Comparing str7(Hello) and s8(Mello): " + str7.compareTo(str8));    //str7 < str8 | H(8)-M(13)=-5
        System.out.println("6.2. Comparing str7(Hello) and s9(Help): " + str7.compareTo(str9));     //str7 > str9 | l(12)-p(16)=4
        System.out.println("6.3. Comparing str7(Hello) and s10(Hello): " + str7.compareTo(str10));  //str7==str10
        System.out.println("6.4. Comparing str7(Hello) and s11(Fellow): " + str7.compareTo(str11)); //str7 > str9 | H(8)-F(6)=2
        System.out.println("6.5. Comparing str7(Hello) and s12(Hel): " + str7.compareTo(str12));    //str7 > str9 | 5-3=2(no of Char)
        System.out.println("6.6. Comparing str7(Hello) and s13(H): " + str7.compareTo(str13));      //str7 > str9 | 5-1=4(no of Char)


        //Intern
        String str3 = "Quovantis";
        String str4 = new String("Quovantis").intern();
        if(str4 == str3){
            System.out.println("7. Intern: str3 and str4 have same address");
        }else {
            System.out.println("7. Intern: str3 and str4 have not same address");
        }


        //Split
        String str5 = "HomeLight HomeLight HomeLight HomeLight HomeLight";
        String[] z = str5.split("e", 4);                                //i is specifying the number of substrings
        System.out.print("8. Splitting String HomeLight by the Letter 'e':");
        for (String a : z)
            System.out.print("         "+a);

        //replace
        String str6 = "Run";
        System.out.println("\n9.  Replace 'a good' with 'an Awesome' in s1(is a good organization): " + s1.replaceAll("a good", "an awesome"));
        System.out.println("10. Replace a character 's' with 'f' in str6(Run): " + str6.replace('R', 'f'));

        //Substring of the String by index
        System.out.println("11. Substring of string(Quovantis) from 2nd char to 5th: " + s.substring(2, 5));

        //contains
        String str20 = "How are you";
        System.out.print("12. Does str6(How are you) contains 'you': " + str20.contains("you"));
        System.out.println(str7.matches("How are you"));
    }
}