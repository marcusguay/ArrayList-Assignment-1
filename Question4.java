import java.util.ArrayList;

class Question4 {
    
    public static void filter(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        //   ArrayList<Integer> nnums = new ArrayList<Integer>();
        for(int i=0; i < list1.size(); i++)
        if(list2.contains(list1.get(i))){
        list2.remove(list2.indexOf(list1.get(i)));
        
        } else {list2.add(list1.get(i));    }
        
    }
    
    public static void main (String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list2.add(2);
        list2.add(4);
        System.out.println("The list before: " + list1);
        filter(list1,list2);
        System.out.println("The list after:  " + list2);
        //the list after should be [1,3]
    }
    
    
    
}
