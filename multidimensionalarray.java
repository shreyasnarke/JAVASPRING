public class multidimensionalarray{
    public static void main(String args[]){
        int nums[][][]=new int[3][4][5]; //jagged array

        
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                nums[i][j]=(int)(Math.random()*10);
            }
        }
        for(int n[]:nums){
            for(int m:n)
            {
                System.out.println(m+"");
            }
            System.out.println();
        }
    }
}