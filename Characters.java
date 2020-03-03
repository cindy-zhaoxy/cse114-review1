public class Characters {
    public static void main (String [] args) {
        
        // what will these items print?
        // because it maps to ASCII
        System.out.println('j');
        System.out.println('j' + 1); 
        System.out.print('j' + "\t" + 'a' + 'v' + 'a' + "\n");
        System.out.println((char)65);
        
        // (ch >= 'A' && ch <= 'Z');
        char ch = ((char)('a' + Math.random() * ('z' - 'a' + 1)));
        
        System.out.println("It" + '\'' + 's' + " sunny outside");
        System.out.println("\\n");
        System.out.println(2/10);
        System.out.println(5.0/10);
        System.out.println((char)97.8);
    }
}
