class Code2{
    public static void main(String[] args) {
        int[] arr=new int[3];
        try{
            try{
                int d=10/0;
            }
            catch(Exception e){
                System.out.println("Second Catch !!");
            }
            int x=arr[1];
            System.out.println(x);
        }
        catch(Exception e){
            System.out.println("First Catch Block !!");
        }
    }
}