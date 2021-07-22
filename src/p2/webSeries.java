package p2;

public class webSeries extends display {
	public int noOfEpisodes;
	public int noOfSeasons;
	public webSeries(String name,int ratings,double duration,String platform,String language,
			String genre,int yearOfRelease,int noOfEpisodes,int noOfSeasons){
		super(name,ratings,duration,platform,language,genre,yearOfRelease);
		this.noOfEpisodes=noOfEpisodes;
		this.noOfSeasons=noOfSeasons;
	}
	public void show() {
		System.out.println("web Series name ->"+name);
		System.out.println("web Series ratings ->"+ratings);
		System.out.println("web Series duration ->"+duration);
		System.out.println("web Series platform ->"+platform);
		System.out.println("web Series language ->"+language);
		System.out.println("web Series genre->"+genre);
		System.out.println("web Series year Of Release ->"+yearOfRelease);
		System.out.println("no Of Episodes ->"+noOfEpisodes);
		System.out.println("no Of Seasons ->"+noOfSeasons);
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
