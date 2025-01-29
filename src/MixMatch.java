public class MixMatch{
    public static void main(String[] args){
        String x = "Hello World!";
        int v = 2;
        char a = 'A';
        short age = 23;
        long num = 123456L;
        float dec = 1.32f;
        double p = 3.14159;
        boolean y = true;
        char space = ' ';
        System.out.println(x + " <- strings hold more than a character and can be words or a sentence");
        System.out.println(v + " <- int stores 4 bytes of memory");
        System.out.println(a + " <- char holds a character using two apostrophes");
        System.out.println(age + " <- short holds 2 bytes of memory");
        System.out.println(num + " <- long holds 8 bytes of memory which is longer than int and short, placing an 'L' or 'l' shows it's a long data type");
        System.out.println(dec + " <- float holds 4 bytes of memory but is able to show decimal placements. Using an 'f' or 'F' shows its a float value");
        System.out.println(p + " <- double holds 8 bytes of memory and is able to show many more decimal values.");
        System.out.println(y + " <- boolean values are only able to be outputted as \"True\" or \"False\""); 
        System.out.println(x + space + v + space + a + space + age + space + num + space + dec + space + p + space + y);
    }
}