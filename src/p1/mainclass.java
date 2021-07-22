	package p1;
	import java.util.*;
	import p2.*;
	public class mainclass {
		public static void main(String[] args) {
			movies mv[]=new movies[5];
			webSeries ws[]=new webSeries[5];
			UpComingMovies upm[]=new UpComingMovies[10];
			
			mv[0]=new movies("dangal",8,2.7,"netflix","Hindi","action/sport",2016);
			mv[1]=new movies("Master",9,3,"prime","Tamil","action/thriller",2021);
			mv[2]=new movies("Kaithi",10,2.5,"hotstar","Tamil","action/thriller",2019);
			mv[3]=new movies("Ala Vaikunthapurramuloo",7,2.75,"netflix","Telugu","Action/Drama",2020);
			mv[4]=new movies("K.G.F: Chapter 1",9,2.83,"voot","Kannada","action/thriller",2018);
			
			ws[0]=new webSeries("The Family Man",9,1,"prime","Hindi","action",2019,19,2);
			ws[1]=new webSeries("Breathe",7,0.8,"prime","Hindi","Thriller",2018,8,1);
			ws[2]=new webSeries("TVF Pitchers",9,0.5,"TVF play","Hindi","Comedy/drama",2015,5,1);
			ws[3]=new webSeries("La casa de papel",8,1,"netflix","spanish","Action/Drama",2017,31,4);
			ws[4]=new webSeries("Scam 1992",10,1,"sony liv","Hindi"," Drama",2020,10,1);
			
			upm[0]=new UpComingMovies("Radhe Shyam","Prabhas"," Radha Krishna Kumar","Telugu",2021);
			upm[1]=new UpComingMovies("K.G.F Chapter 2","Yash","Prashanth Neel","kannada",2021);
			upm[2]=new UpComingMovies("Laal Singh Chaddha","Aamir Khan","Advait Chandan","Hindi",2021);
			upm[3]=new UpComingMovies("Pushpa","Allu Arjun","Sukumar ","Telugu",2021);
			upm[4]=new UpComingMovies("Radhe Shyam","Prabhas"," Radha Krishna Kumar","Telugu",2021);
			upm[5]=new UpComingMovies("RRR","Ram Charan and Jr.N.T.R","S. S. Rajamouli","Telugu",2021);
			upm[6]=new UpComingMovies("Adipurush","Prabhas","Om Raut","Telugu",2022);
			upm[7]=new UpComingMovies("Sarkaru Vaari Paata","Mahesh Babu","Parasuram","Telugu",2022);
			upm[8]=new UpComingMovies("Jersey","Shahid Kapoor","Gowtam Tinnanuri","Hindi",2021);
			upm[9]=new UpComingMovies("Major","Adivi Sesh","Sashi Kiran Tikka","Telugu",2021);
			

			Scanner sc = new Scanner(System.in) ;
			int n1;
				do{   
					System.out.println("enter 1 to show movies");
					System.out.println("enter 2 to show web series");
					System.out.println("enter 3 to show upcomming movies");
					System.out.println("enter 4 to exit");
					n1=sc.nextInt();
					if(n1==1) {
						while(true) {  
							System.out.println("enter 1 to show results by rattings");
							System.out.println("enter 2 to show results by year of release ");
							int n2=sc.nextInt();
							if(n2==1) {
								movies.valuen(1);
								while(true) { 
									System.out.println("enter 1 for ascending order or 2 for descending order");
									int n3=sc.nextInt();
									if(n3==1) {
										Arrays.sort(mv);
										for(int i=0;i<5;i++) {
											System.out.println("movie "+(i+1));
											System.out.println();
											mv[i].show();
											System.out.println();
											System.out.println();
										}	
										break; 
									}
									else if(n3==2) {
										Arrays.sort(mv,Comparator.reverseOrder());
										for(int i=0;i<5;i++) {
											System.out.println("movie "+(i+1));
											System.out.println();
											mv[i].show();
											System.out.println();
											System.out.println();
										}
										break; 
									}
									else {
										System.out.println(n3+" is a wrong number!!");
										System.out.println("please enter 1 or 2");
										continue;  
									}
								}
								break; 
							}
							else if(n2==2){
								movies.valuen(2);
								while(true) {
									System.out.println("enter 1 for ascending order or 2 for descending order");
									int n3=sc.nextInt();	
									if(n3==1) {
										Arrays.sort(mv);
										for(int i=0;i<5;i++) {
											System.out.println("movie "+(i+1));
											System.out.println();
											mv[i].show();
											System.out.println();
											System.out.println();
										}
										break; 
									}
									else if(n3==2) {
										Arrays.sort(mv,Comparator.reverseOrder());
										for(int i=0;i<5;i++) {
											System.out.println("movie "+(i+1));
											System.out.println();
											mv[i].show();
											System.out.println();
											System.out.println();
										}	
										break;
									}
									else {
										System.out.println(n3+" is a wrong number!!");
										System.out.println("please enter 1 or 2");
										continue;
									}
								}
								break;
							}
							else {
								System.out.println(n2+" is a wrong number!!");
								System.out.println("please enter 1 or 2");
								continue; 
							}
						}
					}
					else if(n1==2){
						while(true) {
							System.out.println("enter 1 to show results by rattings");
							System.out.println("enter 2 to show results by year of release ");
							int n2=sc.nextInt();
							if(n2==1) {
								webSeries.valuen(1);
								while(true) {
									System.out.println("enter 1 for ascending order or 2 for descending order");
									int n3=sc.nextInt();
									if(n3==1) {
										Arrays.sort(ws);
										for(int i=0;i<5;i++) {
											System.out.println("movie "+(i+1));
											System.out.println();
											ws[i].show();
											System.out.println();
											System.out.println();
										}	
										break;
									}
									else if(n3==2) {
										Arrays.sort(ws,Comparator.reverseOrder());
										for(int i=0;i<5;i++) {
											System.out.println("movie "+(i+1));
											System.out.println();
											ws[i].show();
											System.out.println();
											System.out.println();
										}
										break;
									}
									else {
										System.out.println(n3+" is a wrong number!!");
										System.out.println("please enter 1 or 2");
										continue;
									}
								}
								break;
						 	}
							else if(n2==2){
								webSeries.valuen(2);
								while(true) {
									System.out.println("enter 1 for ascending order or 2 for descending order");
									int n3=sc.nextInt();	
									if(n3==1) {
										Arrays.sort(ws);
										for(int i=0;i<5;i++) {
											System.out.println("movie "+(i+1));
											System.out.println();
											ws[i].show();
											System.out.println();
											System.out.println();
										}
										break;
									}
									else if(n3==2) {
										Arrays.sort(ws,Comparator.reverseOrder());
										for(int i=0;i<5;i++) {
											System.out.println("movie "+(i+1));
											System.out.println();
											ws[i].show();
											System.out.println();
											System.out.println();
										}
										break;
									}
									else {
										System.out.println(n3+" is a wrong number!!");
										System.out.println("please enter 1 or 2");
										continue;
									}
								}
								break;
							}
							else {
								System.out.println(n2+" is a wrong number!!");
								System.out.println("please enter 1 or 2");
								continue;
							}
						}
					}
					else if(n1==3){
						try {
							System.out.println("Enter how many movies to show");
							int n2=sc.nextInt();
							for(int i=0;i<n2;i++) {
								System.out.println("movie "+(i+1));
								System.out.println();
								upm[i].show();
								System.out.println();
								System.out.println();
							}
						}
					    catch(ArrayIndexOutOfBoundsException e){
					    	System.out.println(e);
					    	System.out.println("Only 10 upcomming movies are available for now");
					    }
					}
					else if(n1!=4){
						System.out.println(n1+" is a wrong number!!");
						System.out.println("please enter 1 or 2 or 3 or 4");
					}
				}
				while(n1!=4);
				sc.close();
		}

		
	}
