// Second approach
public class SecondAppoarchOfThirdPattern {
    public static void main(String[] args) {
        for(int i =1;i<=5;i++){
            for(int j=i;j<=i;j++){
                if(j==1){
                    System.out.print(j);
                }
                else{
                    for(int k=1;k<=j;k++){
                        System.err.print(k);
                    }
                }
            }
            System.out.println();
        }
    }
}
