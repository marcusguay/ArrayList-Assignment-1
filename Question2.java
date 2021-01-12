import java.util.ArrayList;

class Question2 {
    
    public static void removeSmallest(ArrayList<Integer> nums) {
        //ArrayList<Integer> nums = new ArrayList<Integer>();
      int smallest=Integer.MAX_VALUE;
      int smallestp=0;
     
      for (int i = 0; i < 10; i++) {
           if(nums.get(i) < smallest){
            smallestp=i;
            smallest=nums.get(i);}
        }
        nums.remove(smallestp);
    }
  
    public static void main (String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            nums.add( (int) (Math.random()*100) );
        }
        
        System.out.println("Our list before: " + nums);
        removeSmallest(nums); 
        System.out.println("Our list after:  " + nums);
    }
    
    
}
