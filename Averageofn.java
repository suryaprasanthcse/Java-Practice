public class Averageofn {
    public static void main(String[] args) {
        System.out.println(average(5,7,8,9,0,10,100));

    }

    static float average (int...a){
        float avg = 0;
        for (int i = 0; i<a.length; i++){
            avg += a[i];

        }
        avg = avg /a.length;
        return avg;

    }
}
