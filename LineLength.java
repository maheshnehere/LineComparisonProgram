class LineLength{
	
	//compare length of line
	
	public static void main(String[] args) 
	 
	 {
        Scanner sc = new Scanner(System.in);
		
        System.out.println("Line 1 inputs :");
		
        System.out.println("Enter A1 Co-ordinate = ");
		
        double A1 = sc.nextDouble();
		
        System.out.println("Enter A2 Co-ordinate = ");
		
        double A2 = sc.nextDouble();
		
        System.out.println("Enter B1 Co-ordinate = ");
		
        double B1 = sc.nextDouble();
		
        System.out.println("Enter B2 Co-ordinate = ");
		
        double B2 = sc.nextDouble();
		
		double L1 = Math.sqrt(Math.pow(A2 - A1, 2) + Math.pow(B2 - B1, 2));

        System.out.println("Length of a Line = " + L1);
}