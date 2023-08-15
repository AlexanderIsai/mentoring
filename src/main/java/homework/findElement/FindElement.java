package homework.findElement;

public class FindElement {
    public static void main(String[] args) {

        int[]  arr = {6,1,2,8,3,4,5};

        System.out.println(findMissingElement(arr));
    }
    public static int findMissingElement(int[] array){
        int maxNumber = array.length + 1;
        int expectSumElements = (maxNumber * (maxNumber + 1)) / 2;
        int realSumElements = 0;
        for (int element: array) {
            realSumElements += element;
        }
        return expectSumElements - realSumElements;
    }
}
