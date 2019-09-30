
public class Movie<T extends Comparable<? super T>> implements Comparable<Movie<T>> {

	private T name, year;

	public Movie(T name, T year) {
		this.name = name;
		this.year = year;
	}

	public T getName() {
		return name;
	}

	public void setName(T name) {
		this.name = name;
	}

	public T getYear() {
		return year;
	}

	public void setYear(T year) {
		this.year = year;
	}
	
	@Override
	public String toString() {
		return "[" + name.toString() + ", " + year.toString() + "]";
	}

	@Override
	public int compareTo(Movie<T> newMovie) {

		if(this.year.compareTo(newMovie.year) > 0) {
			return 1;
		} else if (this.year.compareTo(newMovie.year) < 0) {
			return -1;
		} else {
			if (this.name.compareTo(newMovie.name) > 0) {
				return 1;
			} else if (this.name.compareTo(newMovie.name) < 0) {
				return -1;
			} else {
				return 0;
			}
		}
	}
	
}
