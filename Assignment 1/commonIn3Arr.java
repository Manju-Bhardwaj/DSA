public class commonIn3Arr {
    public static boolean binarySearch(int arr[],int n,int t){
        int l=0;
        int h=n-1;
        while (l <= h) {
            int m = (l + h) / 2;
            if (arr[m] == t) {
                return true;
            } else if (arr[m] > t) {
                h = m - 1;

            } else {
                l = m + 1;
            }
        }

    return false;

    }

    public static void commom(int a1[], int a2[], int a3[],int n1,int n2,int n3){
        for (int i = 0; i < n1; i++) {
            if(binarySearch(a2,n2,a1[i]) && binarySearch(a3,n3,a1[i]) ){
                System.out.println(a1[i]);
            }
        }
    }
    public static void main(String[] args) {
        int a1[]={1,2,3,10};
        int a2[]={3,7,11,15};
        int a3[]={3,9,11,17};
        int n1= a1.length;
        int n2= a2.length;
        int n3= a3.length;
      commom(a1,a2,a3,n1,n2,n3);

    }
}
