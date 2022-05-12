package hu.progmatic;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Listazas {

    public static void main(String[] args) {
        /*String[] namesToAdd = {"Ajna", "Arlen", "Buzád", "Csinszka", "Dorián", "Dusán", "Hágár", "Hümér",
                "Katapán", "Kocsárd", "Manó", "Muriel", "Oberon", "Patony", "Samu", "Soma", "Szidónia", "Tádé", "Zerind"};*/

        List<String> names = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();

        //boolean contains = text.contains("isc");

        names.add("Dezideráta");
        names.add("Jukundusz");
        names.add("Pompónia");
        names.add("Szemirámisz");
        names.add("Zseraldina");

        addNames(names,"Ajna", "Arlen", "Buzád", "Csinszka", "Dorián", "Dusán", "Hágár", "Hümér",
                "Katapán", "Kocsárd", "Manó", "Muriel", "Oberon", "Patony", "Samu", "Soma", "Szidónia", "Tádé", "Zerind");

        System.out.println(findIndexOfName(names,"Dezideráta"));

        System.out.println(findNamesContain(names,"Sz"));

        addNumbers(numbers,1,100);
        System.out.println(numbers);
        //names.addAll(Arrays.asList(namesToAdd));
        //Collections.addAll(names, namesToAdd);

        /*for (String nameToAdd: namesToAdd){
            names.add(nameToAdd);
        }*/


        /*for (String nameToAdd: namesToAdd){
            addOneName(names,namesToAdd);
        }
        System.out.println(names);*/


       /* //VARARGS
        int sum1 = sum();
        int sum2 = sum(1);
        int sum3 = sum(1,2,3);
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);*/
    }

    /*//VARARGS
    public static int sum(int... numbers){
        int sum = 0;
        for (int elem : numbers){
            sum+=elem;
        }
        return sum;
    }*/

    public static void addOneName(List<String> names,String newName) {
        if (!names.contains(newName)){
            names.add(newName);
        }


    }
    public static void addNames(List<String> names,String... newNames) {
        for (String newName : newNames){
            if (!names.contains(newName)){
                names.add(newName);
            }
        }

    }
    public static int findIndexOfName (List<String> names,String name){
        return names.indexOf(name);
    }
    public static List<String> findNamesContain( List<String> names, String searchFor ){
        List<String> sorted = new ArrayList<>();
        for (String name:names){
            if (name.toLowerCase().contains(searchFor.toLowerCase())){
                sorted.add(name);
            }
        }
        return sorted;
    }

    public static void addNumbers( List<Integer> numbers, int from, int to ){
        for (int i = from; i <= to; i++) {
            numbers.add(i);
        }
    }
}
