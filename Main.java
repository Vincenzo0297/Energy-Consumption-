import java.util.*;

public class Main {
	static double year2010[]={17760.7, 15165.4, 2143.3, 6647.5, 534.9};
	static double year2011[]={18059.1, 15716.4, 2278.6, 6494.1, 459.0};
	static double year2012[]={18578.0, 16136.4, 2391.0, 6641.0, 454.3};
	static double year2013[]={18830.1, 16605.6, 2370.0, 6766.4, 350.8};
	static double resident[]={3771, 3782, 3818, 3844};
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
        int exit = 0;

        do {
              System.out.println("");
              System.out.println("1) Total energy consumption of the selected year.");
	      System.out.println("2) Yearly energy consumption per person");
	      System.out.println("3) Display the highests energy consumption");
	      System.out.println("4) Quit"); 
	      System.out.printf("Enter Selection: ");
              int Input = scan.nextInt();
	      scan.nextLine();    //clear buffer
	        
	      switch(Input) {
	       case 1:
	       TotalEc();
	       break;
	            
	       case 2:
	       AverageEc();
	       break;
	            
	       case 3:
	       DisplayEc();
	       break;
	            
	       case 4:
	       System.out.println("Bye");
	       System.exit(0);
	       break;
	            
	       default: 
	       System.out.println("Incorrect valid input");
	     } 
	        
           }while(exit != 4); 
		
	}
	
	public static void TotalEc() {
	  Scanner scan = new Scanner(System.in);
          int exit = 0;
         double total = 0;
         do {
              System.out.println("");
              System.out.println("1) The year of 2010 total energy consumptions.");
	      System.out.println("2) The year of 2011 total energy consumptions.");
	      System.out.println("3) The year of 2012 total energy consumptions.");
	      System.out.println("4) The year of 2013 total energy consumptions."); 
	      System.out.printf("Enter Selection: ");
              int Input = scan.nextInt();
	      scan.nextLine();    //clear buffer
	      
	      if(Input == 1) {
                 for(int i = 0; i < 5 ; i++) {
                      total += year2010[i];
                  }
                  System.out.printf("The total energy for year 2010 is : %.1f\n", total);
	      }
	      else if(Input == 2) {
		  for(int i = 0; i < 5 ; i++) {
                       total += year2011[i];
                   }
                   System.out.printf("The total energy for year 2011 is : %.1f\n", total); 
	      }
	      else if(Input == 3) {
		  for(int i = 0; i < 5 ; i++) {
                       total += year2012[i];
                  }
                  System.out.printf("The total energy for year 2012 is : %.1f\n", total);  
	      }
	      else if(Input == 4) {
	          for(int i = 0; i < 5 ; i++) {
                       total += year2013[i];
                  }
                  System.out.printf("The total energy for year 2013 is : %.1f\n", total);   
	      }
	      else {
	          System.out.println("Input Invalid");
	      }
	      break;

            }while(exit != 4);

	}

	public static void AverageEc() {
	   Scanner scan = new Scanner(System.in);
	   double average = 0;
	   double total = 0;
	   int exit = 0;
	   System.out.println("");
	   System.out.println("1)Average of energy per person for year 2010.");
	   System.out.println("2)Average of energy per person for year 2011.");
	   System.out.println("3)Average of energy per person for year 2012.");
	   System.out.println("4)Average of energy per person for year 2013.");
	   System.out.printf("Enter Selection: ");
	   int Input = scan.nextInt();
	   scan.nextLine();    //clear buffer
	   do {
		if(Input == 1) {
	           for(int i = 0; i < 5 ; i++) {
                        total = total + year2010[i];
			average = total/resident[0];
                    }
                    System.out.printf("The total energy for year 2010 is : %.1f\n", average);
		 }
		 else if(Input == 2) {
		    for(int i = 0; i < 5 ; i++) {
                         total = total + year2011[i];
			 average = total/resident[1];
                    }
                    System.out.printf("The total energy for year 2011 is : %.1f\n", average);
		}
		else if(Input == 3) {
	           for(int i = 0; i < 5 ; i++) {
                        total = total + year2012[i];
			average = total/resident[2];
                   }
                   System.out.printf("The total energy for year 2012 is : %.1f\n", average);
		}
		else if(Input == 4) {
		   for(int i = 0; i < 5 ; i++) {
                        total = total + year2013[i];
		        average = total/resident[3];
                   }
                   System.out.printf("The total energy for year 2013 is : %.1f\n", average);
		}
	        else {
		   System.out.println("Input Invaild");
		}
		break;

	   }while(exit != 4);
		
	}

	public static void DisplayEc() {
	   Scanner scan = new Scanner(System.in);
	   int exit = 0;
	   System.out.println("");
	   System.out.println("1)Find the highest consumption for year 2010.");
	   System.out.println("2)Find the highest consumption for year 2011.");
	   System.out.println("3)Find the highest consumption for year 2012.");
	   System.out.println("4)Find the highest consumption for year 2013.");
	   System.out.printf("Enter Selection: ");
	   int Input = scan.nextInt();
	   scan.nextLine();    //clear buffer
	   do {
		   if(Input == 1) {
			  if(year2010[0]>year2010[1] && year2010[0]>year2010[2] && year2010[0]>year2010[3]) {
				  System.out.printf("The highest energy for year 2010 is %.2f\n",year2010[0]);
			   }
			   else if (year2010[1]<year2010[0] && year2010[2]<year2010[0] && year2010[3]<year2010[0]) {
				  System.out.printf("The highest energy for year 2010 is %.2f\n",year2010[0]);
			   }
			   else if (year2010[2]<year2010[0] && year2010[3]<year2010[0] && year2010[1]<year2010[0]) {
				  System.out.printf("The highest energy for year 2010 is %.2f\n",year2010[0]);
			   }
			   else if (year2010[3]<year2010[0] && year2010[1]<year2010[0] && year2010[2]<year2010[0]) {
				  System.out.printf("The highest energy for year 2010 is %.2f\n",year2010[0]);
			   }
			   else {
				  System.out.printf("The lowest is %.2f\n",year2010[0]);
			   }
		    }
		    else if (Input == 2) {
                            if(year2011[0]>year2011[1] && year2011[0]>year2011[2] && year2011[0]>year2011[3]) {
				    System.out.printf("The highest energy for year 2011 is %.2f\n",year2011[0]);
			    }
			    else if (year2011[1]<year2011[0] && year2011[2]<year2011[0] && year2011[3]<year2011[0]) {
				   System.out.printf("The highest energy for year 2011 is %.2f\n",year2011[0]);
			    }
			    else if (year2011[2]<year2011[0] && year2011[3]<year2011[0] && year2011[1]<year2011[0]) {
				   System.out.printf("The highest energy for year 2011 is %.2f\n",year2011[0]);
			    }
			    else if (year2011[3]<year2011[0] && year2011[1]<year2011[0] && year2011[2]<year2011[0]) {
				   System.out.printf("The highest energy for year 2011 is %.2f\n",year2011[0]);
			    }
			    else {
				   System.out.printf("The lowest is %.2f\n",year2011[0]);
			    }
		    }
		    else if (Input == 3) {
		            if(year2012[0]>year2012[1] && year2012[0]>year2012[2] && year2012[0]>year2012[3]) {
				    System.out.printf("The highest energy for year 2012 is %.2f\n",year2012[0]);
			    }
			    else if (year2012[1]<year2012[0] && year2012[2]<year2012[0] && year2012[3]<year2012[0]) {
				    System.out.printf("The highest energy for year 2012 is %.2f\n",year2012[0]);
			    }
			   else if (year2012[2]<year2012[0] && year2012[3]<year2012[0] && year2012[1]<year2012[0]) {
				   System.out.printf("The highest energy for year 2012 is %.2f\n",year2012[0]);
			    }
			   else if (year2012[3]<year2012[0] && year2012[1]<year2012[0] && year2012[2]<year2012[0]) {
				   System.out.printf("The highest energy for year 2012 is %.2f\n",year2012[0]);
			   }
			   else {
				   System.out.printf("The lowest is %.2f\n",year2012[0]);
			   }
		    }
		    else if (Input == 4) {
		            if(year2013[0]>year2013[1] && year2013[0]>year2013[2] && year2013[0]>year2013[3]) {
				   System.out.printf("The highest energy for year 2013 is %.2f\n",year2013[0]);
			    }
			    else if (year2013[1]<year2013[0] && year2013[2]<year2013[0] && year2013[3]<year2013[0]) {
				   System.out.printf("The highest energy for year 2013 is %.2f\n",year2010[0]);
			    }
			   else if (year2013[2]<year2013[0] && year2013[3]<year2013[0] && year2013[1]<year2013[0]) {
				   System.out.printf("The highest energy for year 2013 is %.2f\n",year2010[0]);
			    }
			   else if (year2013[3]<year2013[0] && year2013[1]<year2013[0] && year2013[2]<year2013[0]) {
				   System.out.printf("The highest energy for year 2013 is %.2f\n",year2013[0]);
			   }
			   else {
				  System.out.printf("The lowest is %.2f\n",year2013[0]);
			   }
		    }
		    else {
			   System.out.println("Invalid Input");
		    }
		    break;
		   
	    }while(exit != 4);
	}
}
	



