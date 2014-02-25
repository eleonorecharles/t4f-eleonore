package be.eleonore.wiheries;

public class Numbers {
    
    private Float mean;

    public Numbers(Integer[] nums)  {
        
       mean =0F ;
       Integer total = 0 ;
       for (Integer num : nums ) {
           total += num;
           
       }
       mean = (float) total / nums.length;
           
    }
    
    public Float mean(){
        return mean ;
    }
    
    

}
