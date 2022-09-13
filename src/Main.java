import javax.swing.*;
import java.util.Scanner;

public class Main {
    
    //String

    public static void main(String[] args) {

        String m = "Ahmed";
        System.out.println(m.toUpperCase());

        String s = new String("aHmed");
        System.out.println(s.toLowerCase());

        char a1[] = {'a','h','m','e','d'};
        System.out.println(a1);

        System.out.println(s.equalsIgnoreCase(m));


        String name = JOptionPane.showInputDialog( "Provide User Name:" );
        JOptionPane.showMessageDialog(null, name.substring(2,5));

        String mrrrr;
        Scanner sc = new Scanner(System.in);
        mrrrr= sc.next().trim();
        System.out.println(mrrrr);


        String mttttt = "Ahmed mohammed ebrahim";
        System.out.println(mttttt.replace('m','h'));


        String mdd = "Ahmed mohammed ebrahim";
        System.out.println(mdd.lastIndexOf("d"));

        String mdd2 = "Ahmed mohammed";
        mdd2 = mdd2.concat(" ebrahim");
        System.out.println(mdd2);


        String mr = "java / c / ruby / kotlin / php";


        String bb[] = mr.split("/");
        System.out.println(bb[2]);

        for (String h:bb) {
            System.out.print(h);
        }

    }





}