public class Mergin {
    public static void main(String[] args) {
        int[] first ={1, 2, 3, 4, 5};
        int[] second ={5, 6, 7};
        int[]mergin = new int[first.length+second.length];
        int count = 0;
        for(int i = 0; i<first.length; i++) {
            mergin[i] = first[i];
            count++;
        }
        for(int j = 0;j<second.length;j++) {
            mergin[count++] = second[j];
        }
        for(int i = 0;i<mergin.length;i++)
            System.out.print(mergin[i]+" ");

    }

}