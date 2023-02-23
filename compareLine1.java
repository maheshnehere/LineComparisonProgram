class CompareLine1{
	
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
		
        
		                     System.out.println("Line 2 inputs :");
		
									System.out.println("Enter M1 Co-ordinate = ");
		
										double M1 = sc.nextDouble();
										
											System.out.println("Enter M2 Co-ordinate = ");
											
														double M2 = sc.nextDouble();
														
															System.out.println("Enter N1 Co-ordinate = ");
															
																double N1 = sc.nextDouble();
																
																		System.out.println("Enter N2 Co-ordinate = ");
																		
																			double N2 = sc.nextDouble();


        double L1 = Math.sqrt(Math.pow(A2 - A1, 2) + Math.pow(B2 - B1, 2));
        double L2 = Math.sqrt(Math.pow(M2 - M1, 2) + Math.pow(N2 - N1, 2));

        if (L1 == L2) {
            System.out.println("Two Lines are Equal.");
        } else if (L1 > L2) {
            System.out.println("Line 1 is greater than Line 2.");
        } else {
            System.out.println("Line 2 is greater than Line 1");
        }
    }
}