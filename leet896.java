public class leet896 {
    
        public static boolean isMonotonic(int nums[]) {
            boolean increaseFlag=true;
            boolean decreaseFlag=true;
            for(int i=0;i<nums.length-1;i++){
                    if(nums[i]<nums[i+1]){
                        decreaseFlag=false;
                        
                    }
                    if (nums[i]>nums[i+1]){
                        increaseFlag=false;
                    }
                    
                    
                }
                return increaseFlag || decreaseFlag;
        }
              
            
        
        public static void main(String[] args){
            int nums[]={1,2,2,3};
         System.out.println(isMonotonic(nums)); 
    
    
        }
        
    }
    
    

