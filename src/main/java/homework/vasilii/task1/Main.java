package homework.vasilii.task1;

public class Main {

    public static void main(String[] args) {
        System.out.println(ColorShade.GREEN);


                int[] myArr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
                int maxSum = maxSubArraySum(myArr);
                System.out.println("Наибольшая сумма подряд идущих элементов: " + maxSum);
            }

            public static int maxSubArraySum(int[] arr) {
                int maxEndingHere = arr[0];
                int maxSoFar = arr[0];

                for (int i = 1; i < arr.length; i++) {
                    maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
                    maxSoFar = Math.max(maxSoFar, maxEndingHere);
                }

                return maxSoFar;
            }
        }


