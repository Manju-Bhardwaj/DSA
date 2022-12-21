public class commonInArrs {
    public static void main(String[] args) {
        int a1[]={1,2,3,10};
        int a2[]={3,7,11,15};
        int a3[]={3,9,11,17};
        int n1= a1.length;
        int n2= a2.length;
        int n3= a3.length;
        int i=0;
        int j=0;
        int k=0;
        while(i<n1 && (j<n2) && (k<n3)){
            if(a1[i]==a2[j] && a2[j]==a3[k]){
                System.out.println(a1[i]);
                i++;
                j++;
                k++;
            }
            else if(a1[i]<a2[j]){
                i++;
            }
            else if(a2[j]<a3[k]){
                j++;
            }

        }
    }
}
