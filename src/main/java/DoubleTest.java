public class DoubleTest {
    public static void main(String[] args){
        double dNum = 1;
        float fNum = 3.14f;

        for(int i=0; i<10000; i++) {
            dNum = dNum + 0.1;
        }
        System.out.println(dNum);

        System.out.println(fNum);
    }
}
