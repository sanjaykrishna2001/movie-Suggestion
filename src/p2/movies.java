package p2;



public class movies extends display {
	public movies(String name,int ratings,double duration,String platform,String language,String genre,int yearOfRelease){
		super(name,ratings,duration,platform,language,genre,yearOfRelease);
	}
	public void show() {
		System.out.println("movie name ->"+name);
		System.out.println("movie ratings ->"+ratings);
		System.out.println("movie duration ->"+duration);
		System.out.println("movie platform ->"+platform);
		System.out.println("movie language ->"+language);
		System.out.println("movie genre->"+genre);
		System.out.println("movie year Of Release ->"+yearOfRelease);
	}
	public static void valuen(int k) {
		n=k;
	}
	@Override
	public int compareTo(display o) {
		if(n==1) {
			return this.ratings-o.ratings;
		}
		else if(n==2) {
			return this.yearOfRelease-o.yearOfRelease;
		}
		else return 0;
	}

}
