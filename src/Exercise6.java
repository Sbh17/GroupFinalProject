public class Exercise6 {
    public static int[] intersectionOfTwoArrays(int [] arrayA ,int [] arrayB) {
        int [] temp= new int[arrayA.length];
        int i = 0 , j = 0;

        while (i< arrayA.length && j < arrayB.length){
            if(arrayA[i] == arrayB[j] ){
                temp[i] = arrayA[i];
                i = i + 1;
                j = j + 1;
            }else if(arrayA[i] < arrayB[j])
                ++i;
            else
                ++j;
        }
        return temp;
    }
    public static boolean arraysIntersection(int [] a , int [] b){
        boolean flag = true ;
        int [] temp = intersectionOfTwoArrays(a ,b);
        int i;
        for (i = 0; i< temp.length; i++)
            flag = temp[i] != 0;
       return flag;
    }
    public static void main(String[] args) {
        System.out.println(arraysIntersection(new int[]{3,4,5,7,8},new int[]{2,1,9,21,12}));
        System.out.println(arraysIntersection(new int[]{2,3,1,4,5,7,8},new int[]{2,1,3,8,9,21,12}));
        System.out.println(arraysIntersection(new int[]{0,2,3,4,6,8},new int[]{12,22,15,25,30,31}));
    }
}
