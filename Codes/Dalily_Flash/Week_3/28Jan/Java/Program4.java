class Pattern {

	public static void main(String[] args) {
	
		int temp=0;
		for(int row=1;row<=4;row++) {

			for(int no=1;no<=row;no++) {

				temp = temp + 1;
				System.out.print(temp*temp*temp+" ");
			}

			System.out.println();
		}
	}
}
