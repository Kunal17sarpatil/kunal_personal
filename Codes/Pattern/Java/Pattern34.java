class Pattern34 { 
    public static void main(String[] args) {
        for(int i=0;i<5;i++) {
            for(int j=0;j<9;j++) {

                if((i+j)<=3||(j-i)>=5) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}