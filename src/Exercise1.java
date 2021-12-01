public class Exercise1 {
    public static boolean foundFirstInSecond(String firstString , String secondString){
        for ( int i = 0; i < secondString.length() ; ++i) {
            if (secondString.charAt(i) == firstString.charAt(0))
            {
                boolean result = true;
                for (int j = 0; j < firstString.length(); ++j) {
                    if (firstString.charAt(j) == secondString.charAt((i + j))) {
                        continue;
                    }
                    result = false;
                }
                if (result) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(foundFirstInSecond("Not","i like eating apple"));
        System.out.println(foundFirstInSecond("Are","Are you in the moon ?"));
    }
}
