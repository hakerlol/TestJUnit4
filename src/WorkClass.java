public class WorkClass {
    public static void someFunction(int i){
        if(i == 0){
            throw new NullPointerException("zero");
        }else if(i < 0){
            throw new IllegalArgumentException("negative");
        }
        else {
            throw new IndexOutOfBoundsException("positive");
        }
    }

    public static String getString(String string){
        return string;
    }
}
