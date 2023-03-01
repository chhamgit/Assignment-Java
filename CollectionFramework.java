import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionFramework {
    public static void main(String[] args) {
        System.out.println("Collection Framework Practice");
        System.out.println("1.To create a new array list, add some colors (string) and print out the collection");
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("White");
        colors.add("Black");
        System.out.println(colors);
        System.out.println("2.To iterate through all elements in a array list.");
        for (String col : colors) {
            System.out.println(col);
        }
        System.out.println("3.To compare two array lists");
        ArrayList<String> compareColor = new ArrayList<String>();
        compareColor.add("Red");
        compareColor.add("Green");
        compareColor.add("Orange");
        compareColor.add("White");
        compareColor.add("Black");

        boolean  compare_color  = colors.equals(compareColor);
        System.out.println(compare_color);
        LinkedList<String> LinkedList;

        System.out.println("4.Iterate through all elements in a linked list starting at the specified position");
        LinkedList<String> linkedListEle = new LinkedList<String>();
        linkedListEle.add("Red");
        linkedListEle.add("Green");
        linkedListEle.add("Orange");
        linkedListEle.add("White");
        linkedListEle.add("Black");

        Iterator c = linkedListEle.listIterator(2);
        while(c.hasNext()){
            System.out.println(c.next());
        }

    }
}
