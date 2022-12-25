import java .util.*;
import java .io.*;

class Appoinmentbooking(){
	Arraylist<String>.doctorName = new.ArrayList<String>();
	ArrayList<String>.doctorQualification= new.ArrayList<String>() ;
	ArrayList<String>.doctorQualification= new.ArrayList<String>() ;
	ArrayList<String>.doctorGender= new.ArrayList<String>() ;
	ArrayList<String>.doctorPassword= new.ArrayList<String>() ;
	ArrayList<String>.doctorAge= new.ArrayList<String>() ;
	ArrayList<String>.doctorMobilenumber= new.ArrayList<String>() ;
	ArrayList<String>.doctorCity= new.ArrayList<String>() ;


	ArrayList<String>.patientAge= new.ArrayList<String>() ;
	ArrayList<String>.patientName= new.ArrayList<String>() ;
	ArrayList<String>.patientGender= new.ArrayList<String>() ;
	ArrayList<String>.patientConfirmPassword= new.ArrayList<String>() ;
	ArrayList<Long>.patientMobileNumber= new.ArrayList<String>() ;


	ArrayList<Integer>.patientAgebooking= new.ArrayList<String>() ;
	ArrayList<String>.patientNameBooking= new.ArrayList<String>() ;
		ArrayList<String>.patientGenderBooking= new.ArrayList<String>() ;
		ArrayList<Byte>.doctorID= new.ArrayList<String>() ;




		void dataAdd()            //method to creating default doctor listbpresent in the database.
		{

			doctorName.add("Kamal pandey") ;
			doctorName.add("Ankur tiwari") ;
			doctorName.add("Shashi kapoor") ;
		    doctorName.add("pinki yadav") ;
			doctorName.add("Rahul roy") ;
			doctorName.add("Amar tiwari") ;
			doctorName.add("Naman Deshpande") ;


			doctorQualification.add("MBBS") ;
			doctorQualification.add("Er ,MBBS") ;
			doctorQualification.add("MBBS,MD") ;
			doctorQualification.add("MBBS , MD") ;
			doctorQualification.add("BAMS") ;
			doctorQualification.add("MBBS , MD , Surgeon") ;
			doctorQualification.add("BAMS") ;



			doctorGender.add("M") ;
			doctorGender.add("M") ;
			doctorGender.add("M") ;
			doctorGender.add("F") ;
			doctorGender.add("M") ;
			doctorGender.add("M") ;
			doctorGender.add("M") ;



			doctorPassword.add("kamalk123") ;
			doctorPassword.add("pooja123") ;
			doctorPassword.add("shashi223") ;
			doctorPassword.add("pinkipar123") ;
			doctorPassword.add("rahul123") ;
			doctorPassword.add("Amar789") ;
			doctorPassword.add("naman456") ;



			doctorAge.add(25) ;
			doctorAge.add(30) ;
			doctorAge.add(24) ;
			doctorAge.add(24) ;
			doctorAge.add(29) ;
			doctorAge.add(28) ;
			doctorAge.add(28) ;



			doctorMobilenumber.add(555) ;
			doctorMobilenumber.add(123456) ;
			doctorMobilenumber.add(999999) ;
			doctorMobilenumber.add(99999888) ;
			doctorMobilenumber.add(10101011) ;
			doctorMobilenumber.add(555666677) ;
			doctorMobilenumber.add(89988998) ;


			doctorCity.add("Rampur") ;
			doctorCity.add("Sitapur") ;
			doctorCity.add("Mirzapur") ;
			doctorCity.add("Sonbhadra") ;
			doctorCity.add("Varanshi") ;
			doctorCity.add("Gazipur") ;
			doctorCity.add("Gorakpur") ;


}

			void admin().throws.Exception 
			{


            Scanner.sc= new.Scanner(System.in) ;
            byte.choice ;

            boolean.flag= true ;
            while(flag){

            	new.ProcessBuider("cmd","/c","cls").inheritIO.start().waitFor();
            	System.out.println("\t\t _______________________________________");
            	System.out.println("\t\t |                                     |") ;
            	System.out.println("\t\t |                                     |") ;
            	System.out.println("\t\t |             Welcome Admin           |") ;
            	System.out.println("\t\t |                                     |") ;
            	System.out.println("\t\t | ___________________________________ |") ;

           System.out.print("\n\n1.Doctor list \t2.Registred patient \t3.Patient with Appoinment \n4.Main menu \n\nEnd");

           switch (choice){


           case 1 :

           	for(int i=0 ; i<=doctorName.size()-1 ; i++){
           		System.out.println("Name:\t" + doctorName.get(i));

           	}
           	byte menuCHoice ;
           	System.out.println("\n\n1.Main menu\t 2.Previous menu");
           	menuCHoice=sc.nextByte();
           	if(menuCHoice==1){
           		flag= false ;
           	}
           	else{
           		break ;
           	}
           	break ;

           	case2: 
           	if(patientName.isEmpty()){

           		System.out.println("No Registred Patient yet");
           		Thread.sleep(3000);
           		break;
           	}else{
           		for(int i=0 ; i<=patientName.size()-1 ; i++){
           			System.out.println(i+"-"+patientName.get(i));
           		}
           		System.out.println("\n\n1.Main menu \t 2.Previous menu");
           		if(menuCHoice==1){

           			flag= false ;
           		}else{
           			break ;
           		}
           	}
           	break ;


           case 3 : 
           	if(patientNameBooking.isEmpty()){

           		System.out.println("\nNo Appoinments yet.");
           		Thread.sleep(3000);
           		break;
           	}
           	else{

           		for(int i =0 ;i<=patientNameBooking.size()-1 ;i++){
           			System.out.println(i+"-"+patientNameBooking.get(i));
           		}
           		System.out.println("\n\n1.Main menu\t 2.Previous menu");
           		menuCHoice =sc.nextByte();
           		if(menuCHoice==1){
           			flag=false ;
           		}else{
           			break;
           		}
           	}
           	break;

           case 4:

           	flag = false ;
           	break;

           default:
           	System.out.println("Wrong choice");
           	Thread.sleep(1000);
           	flag= true ;
           }

       }
}




void patient () throws Exception{

	Scanner sc= new Scanner (Sysyem.in);
	boolean flag= true ;
	while(flag){

		new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();

		System.out.println("\t\t __________________________________");
		System.out.println("\t\t |                                 |")  ;      
		System.out.println("\t\t |      Welcome to patient page    |")  ;   
		System.out.println("\t\t |                                 |")  ;   
		System.out.println("\t\t |________________________________ |")  ;          
		System.out.println("") ;
		System.out.println("1.Login \t 2. Registration\n")  ;
		int ch= sc.nextInt()   ;

		switch(ch)     {

		case 1 : 
			if(patientMobileNumber.isEmpty()){

				System.out.println("First register yourself then login..!");
				Thread.sleep(500);
				break;
			}else{
				patientLogin();
				flag = false ;
			}
			break ;

		case 2 : 
			patientRegistration();
			flag= false;
			break ;
		default : 
			System.out.println("\nYou entred wrong choice.enter your choice again....!");
			flag = true ;
			Thread.sleep(1000);
			break;
		}     

	}
}


void doctor () throws Exception
{


	Scanner sc= new Scanner (System.in);
	int choice = 0 ;

	boolean flag = true ;
	while(flag)
	{
		//Thread.sleep(1000);
		new processBuilder("cmd" , "/c" , "cls").inheritIO().start().waitFor();

		System.out.println("\t\t __________________________________   ");
		System.out.println("\t\t |                                   |  ");
		System.out.println("\t\t |                                   | ");
		System.out.println("\t\t |     Welcome to Doctor Page !      | ");
		System.out.println("\t\t |                                   | ");
		System.out.println("\t\t  __________________________________   ");
		system.out.println(" ");

		System.out.println("1. Login \t 2.Registration");

		choice = sc.nextInt();

		switch (choice){

		case 1 : 
			if(doctorMobileNumber.isEmpty()){


				System.out.println("Register first ....!");
				flag= false ;
				Thread.sleep(500);
				break ;
			}else{
				doctorLogin();
				flag = false ;
			}
			break ;

		case 2 : 
			doctorRegistration();
			flag = false ;
			break ;

		default :
			System.out.println("Entered Wrong choice ...!");

			flag : true ;

		}

	}
}



void patientLogin() throw Exception {



Scanner sc= new Scanner(System.in);
boolean flag = true ;
Long mobileNumber ;

byte choice ;

new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();

System.out.println("\t\t   ____________________________________");
System.out.println("\t\t   |                                   |");
System.out.println("\t\t   |                                   |");
System.out.println("\t\t   |           Login                   |");
System.out.println("\t\t   |                                   |");
System.out.println("\t\t   ____________________________________");

System.out.println("Enter your Username(mobilenumber");
mobilenumber = sc.nextLong();

String password = sc.next();

boolean flag1=false ;
int j ;

for(j=0 ; j<=patientMobileNumber.size()-1 ;j++){


	if((patientMobileNumber.get(j)).equals(mobilenumber)&&(patientPassword.get(j)).equals(password)){


		flag1= true ;

		break ;

	}



}
if(flag1==true){

	THread.sleep(1000);

	new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();

	System.out.println("\t\t   _________________________________________");
	System.out.println("\t\t  |                                         |");
    System.out.println("\t\t  |                                         |")
    System.out.println("\t\t  |            Book Appoinment              |")
    System.out.println("\t\t  |                                         |")
	System.out.println("\t\t  |_________________________________________|")
	System.out.println("\nWelcome " +patientName.get(j)+",to book appoinment ,choose your doctor..");


	for(int i =0 ; i<=doctorName.size()-1 ; i++){


		System.out.println((i+1)+"-"+doctorName.get(i));

	}

	choice = sc.nextByte();
	doctorID.add(choice);

	while(flag){

		Thread.sleep(1000);
		new ProcessBuider ("cmd","/c","cls").inheritIO().start().waitFor();

		System.out.println("\t\t_____________________________________");

		System.out.println("\t\t|                                     |");
		System.out.println("\t\t|                                     |");
		System.out.println("\t\t|          Book Appoinment            |");
		System.out.println("\t\t|_____________________________________|");


		if(choice <=doctorNmae.size() && choice>0){

			System.out.println("\n\nName: \t"+doctorName.get(choice-1)+"\nAge:\t " +doctorAge.get(choice-1)+"\nGender:\t" +doctorGender.get(choice-1));

			System.out.println("\n Enter your name :");
			sc.nextLine();
			patientNameBooking.add(sc.nextLine());
			System.out.println(" Enter your age : \t");
			patientAgeBooking.add(sc.nextInt());
			System.out.println("Enter your Gender") ;
			patientGenderBooking.add(sc.next());
			System.out.println("\n Booking Sucessfull.");

			Thread.sleep(1000);
			flag = false ;
			break ;


		}
		else{
			System.out.println("\n enter correct input..");
			flag = true ;
			Thread.sleep(1000);


		}

	}
}

else{

	System.out.println("Login unsucessful..");
	Thread.sleep(900);
	flag = false ;
}


}



void patientRegistration() throws Exception {


Scanner sc=  new Scanner(System.in);
int i =0 ;
Long mobileNumber ;

new ProcessBuilder("cmd","/c","cls").inheritIO.start().waitFor();
System.out.println("\n");
System.out.println("\t\t | Welcome to Patient Registration Page ! ");
System.out.println("\n");
System.out.println("Please enter your Name");
patientName.add(sc.nextLine());
System.out.println("Enter your Age");
patientAge.add(sc.nextInt());
System.out.println("Please enter your Mobile Number");
mobileNumber = sc.nextLong();
Long mno ;
boolean flag = true , flag1= true;



if(patientMobileNumber.isEmpty()){


	patientMobileNumber.add((mobileNumber));
	System.out.println("Enter password");
	patientPassword.add(sc.next());
	System.out.println("Registration is sucessfull.");
	Thread.sleep(1000);
	flag1 : false ;
}else{

	for(i=0 ;i<=patientMobileNumber.size()-1 ;i++){

		mno= patientMobileNumber.get(i);
		if(mno==mobileNumber){
			flag1= false ;
			break ;
		}
	}else{
		System.out.println("same Mobile number is not allowed\n");
		Thread.sleep(500);
	}
}



}


void doctorRegistration() throws Exception 
{

	Scanner sc = new Scanner (System.in);
	int i =0 ;
	Long mobileNumber ;
	boolean flag = true , flag1 = true ;

	new ProcessBuilder("cmd", "/c" , "cls").inheritIO().start().waitFor();

	System.out.println("\t\t---------------------------------------------");
    System.out.println("\t\t| This is doctor registration page          | ");
    System.out.println("\t\t -------------------------------------------|");
    System.out.println("\n") ;

    System.out.println("Please Enter your name") ;

    doctorName.add(sc.nextLine());

    Long mno ;
    if(doctorMobileNumber.isEmpty()){

    	doctorMobileNumber.add((mobileNumber));
    	System.out.println("Enter password") ;
    	doctorPassword.add(sc.next());
    	System.out.println("Registration is sucessfull.");
    	Thread.sleep(900);
    	flag1 = false ;

    }
    else{
    	for(i=0 ;i<=doctorMobileNumber.size()-1 ; i++){

    		mno= doctorMobileNumber.get(i) ;

    		if(mno==mobileNumber){
    			flag1= false ;
    			break ;
    		}
    	}
    	if(flag1==true){


    		doctorMobileNumber.add(mobileNumber);
    		System.out.println("Enter age") ;
    		doctorAge.add(sc.nextInt());
    		System.out.println("Enter City :");
    		doctorCity.add(sc.next());
    		System.out.println("Enter password");
    		doctorPassword.add(sc.next());
    		System.out.println("Registration is Sucessfull.");
    		System.out.println("Details:Name:"+doctorName+"number:"+doctorMobileNumber);
    		Thread.sleep(900);
    	}
    	else{
    		System.out.println("same mobile number is not allowed\n");
    		int index=doctorName.size()-1 ;
    		doctorName.remove(index);
    		Thread.sleep(500);
    	}
    }
}


void DoctorLogin() throws Exceptions 
{

	Scanner sc = new Scanner (System.in);
	Long mobileNumber ;
	//Thread.sleep(500);
	new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
	System.out.println("\t\t-------------------------------------");
	System.out.println("\t\t|  this is doctor login page          |") ;
	System.out.println("\t\t -------------------------------------") ;
	System.out.println("Enter your Username (mobilenumber)") ;
	mobileNumber = sc.nextLong();
	System.out.println("Enter your Password");
	String pasword = sc.nextInt() ;
	int i =0 ;
	byte choice ;

	boolean flag = false ;
	boolean flag11 = true ;
	for(i=0 ; i<=doctorMobileNumber.size()-1 ;i++){

		if((doctorMobileNumber.get(i).equals(mobileNumber)&&(doctorPassword.get(i)).equals(password)){

			flag = true ;
			break ;
		}
	}


	if(flag==true){

		while(flag11){

			new ProcessBuilder("cmd","/c","cls").inheritIO().satrt().waitFor();
			System.out.println("\t\t-----------------------------------------");
			System.out.println("\t\t | Welcome Doctor "+doctorName.get(i)+" |");
			System.out.println("\t\t ---------------------------------------");
			System.out.println("\n\n.    Appoinment.  \n2.Logout");
			choice = sc.nextByte();
			byte j =0 ;

			switch(choice){

			case 1 :
				if((doctorID.isEmpty()!=true)){

					while(j<=doctorID.size()-1){

						if((i+1)==doctorID.get(j)){

							System.out.println("patient name : " +patientNameBooking.get(j));
							j++ ;
						}
					}
					Thread.sleep(4000);
				}
				else{
					System.out.println("No appointments...|");
					Thread.sleep(3000);
					flag11= true ;
				}
				break ;
			case 2 : 
				flag11 = false ;
				break ;
			}
		}
	}
	else{
		System.out.println("Login unsucessfull...");
		Thread.sleep(1000);

	}
}

}





class java {

	public static void main(String[] args) throws Exception {

		AppoinmentBooking ap = new.AppointmentBooking();
		Scanner sc = new Scanner(System.in);
		ap.dataAdd();
		booleanflag = true ;

		while(flag=true){

			new ProcessBuilder("cmd", "/c","cls").inheritIO().start().waitFor();
			System.out.println("----------------------------------------------");
			System.out.println("\t\t | Welcome to Doctor AppoinmentBooking |") ;

			System.out.println("-----------------------------------------------");

			System.out.println("\n1.Doctor \t 2. Patient \t 3. Admin \t 4.Exit");
			int choice = sc.nextInt();

			switch (choice){

			case 1 : 

				ap.doctor();
				flag = true ;
				break ;

			case 2 : 
				ap.patient();
				flag = true ;
				break ;
			case 3 : 

				ap.admin();

				flag = true ;

				//Thread.sleep (1000);
				break ;
			default ;
				System.exit(0);
			}


		}
	}



}
