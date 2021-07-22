package p2;

public class UpComingMovies {
	String name;
	String hero;
	String dirctor;
	String language;
	int yearOfRelease;
	public UpComingMovies(String name, String hero, String dirctor, String language, int yearOfRelease) {
		this.name = name;
		this.hero = hero;
		this.dirctor = dirctor;
		this.language = language;
		this.yearOfRelease = yearOfRelease;
	}
	public void show(){
		System.out.println("movie name ->"+name);
		System.out.println("hero name ->"+hero);
		System.out.println("dirctor name ->"+dirctor);
		System.out.println("movie language ->"+language);
		System.out.println("yearOfRelease->"+yearOfRelease);
	}

	
}
