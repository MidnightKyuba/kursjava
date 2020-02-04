package zadanie;

public class BreakContinue {
    public static void main(String[] args){
        for (int i = 1; i <= 10; i++){
            if (i % 2 == 0){
                continue;
            }
            if (i >= 5) {
                break;
            }
            System.out.println(i);
        }
    }
}

/*
//1
int[] array1 = new int[10];
//2
long[] array2 = new long[0];
//3
double array3[] = new double[2];
//4
int[] array4 = new int[]{1, 2, 3};
 */
