import java.text.Normalizer;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();

        list.add(new String("a"));
        list.add(new String("b"));
        list.add(new String("c"));
        list.add(new String("d"));
        list.add(new String("e"));
        list.add(new String("f"));
        list.add(new String("g"));
        list.add(new String("h"));
        list.add(new String("i"));
        list.add(new String("j"));
        list.add(new String("k"));
        list.add(new String("l"));
        list.add(new String("m"));
        list.add(new String("n"));
        list.add(new String("o"));
        list.add(new String("p"));
        list.add(new String("q"));
        list.add(new String("r"));
        list.add(new String("s"));
        list.add(new String("t"));
        list.add(new String("u"));
        list.add(new String("v"));
        list.add(new String("w"));
        list.add(new String("x"));
        list.add(new String("y"));
        list.add(new String("z"));

        String line = removerAcentos("áaaaáã");
        int cont= 0;
        
        String[] digits = line.toLowerCase().split("");
     

      for (String string : digits) {
              System.out.println(string);  
        }

        for (int i = 0; i < digits.length; i++) {
            

            for (int j = 1; j <= list.size(); j++) {
                if( digits[i].equals(list.get(j-1))) {
                    cont += j;
                }    
            }
        }
        System.out.println(cont);
        
    
          
    }
    //remover caracter especial
    public static String removerAcentos(String str) {
        return Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
    }
}
