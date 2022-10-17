public class Third {

    public static void main(String[] args) {
        int[] values = {1, 0, 2, 5, 6, 4, 10, 3};
        int minN = values[0];
        int maxN = values[0];
        int minIndex = 0;
        int maxIndex = 0;
        int sum = 0;
        for (int i = 0; i < values.length; i++)
        {
            if (values[i] < minN)
            {
                minN = values[i];
                minIndex = i;

            }
            if (values[i] > maxN)
            {
                maxN = values[i];
                maxIndex = i;
            }
        }
        for (int i = minIndex+1; i <= maxIndex-1; i++)
        {
            sum = sum + values[i];
        }
        System.out.println("min index = " + minIndex);
        System.out.println("max index = " + maxIndex);
        System.out.println (sum);
    }

}