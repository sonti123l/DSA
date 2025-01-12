public class NinthPattern {
    public static void main(String[] args) {
        
        for(int i=0;i<5;i++){
            for(int k=0;k<=(5-i-1);k++){
                System.out.print(" ");
            }
            for(int j=0;j<(2*i+1);j++){
                System.out.print("*");;
            }
            for(int m=0;m<=(5-i-1);m++){
                System.out.print(" ");
            }
            if(i+1==5){
                System.out.println();
                for(int l=5;l>0;l--){
                    for(int k=0;k<(5-l);k++){
                        System.out.print(" ");
                    }
                    for(int j=0;j<(2*l-1);j++){
                        System.out.print("*");;
                    }
                    for(int m=0;m<(5-l);m++){
                        System.out.print(" ");
                    }
                 System.out.println();   
            }
        }
        System.out.println();
    }
}
}
