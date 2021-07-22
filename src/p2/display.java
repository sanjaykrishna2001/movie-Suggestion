package p2;

public abstract class display implements Comparable<display> {
	public String name;
	public int ratings;
	public double duration;
	public String platform;
	public String language;
	public String genre;
	public int yearOfRelease;
	protected static int n;
	public display() {
		this.name=" ";
		this.ratings= 0;
		this.duration= 0;
		this.platform= " ";
		this.language=" ";
		this.genre=" ";
		this.yearOfRelease=0;
	}
	public display(String name,int ratings,double duration,String platform,String language,String genre,int yearOfRelease){
		this.name= name;
		this.ratings= ratings;
		this.duration= duration;
		this.platform= platform;
		this.language=language;
		this.genre= genre;
		this.yearOfRelease=yearOfRelease;
	}
	abstract void show();
}
