/** find a number in  sorted array **/
public class SumofNumbers {

    int []numbers = {1,3,4,5,6,7,9};
    int num1 =3;
    int sum =8;
    // wanted number is sum minus 3
    int wantedNumber = 8-3;



    public static void main(String[] args) {

        int []numbers = {1,3,4,5,6,7,9};
        int num1 =3;
        int sum =8;
        // wanted number is sum minus 3
        int wantedNumber = 8-3;


        System.out.println(doSearch(numbers, wantedNumber, 0, numbers.length));

    }

    static  boolean doSearch(int []numbers , int wantedNumber, int start, int end) {

        int mid = start+(end-1)/2;
        if(wantedNumber == numbers[mid])
            return  true;
        if( wantedNumber> numbers[mid])
            return doSearch(numbers,wantedNumber,mid+1,end);
        else if(wantedNumber< numbers[mid])
            return doSearch(numbers,wantedNumber,start,mid-1);
        else return false;
    }
}
