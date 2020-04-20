package proj8;

public class Film {
    String name;
    private final String genre;
    String time;

    {
        System.out.println("Создается новый фильм:");
    }

    public Film(String name, String genre, String time) {
        this.name = name;
        this.genre = genre;
        this.time = time;
        System.out.println("Фильм " + name + " успешно создан");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Film{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", time='" + time + " мин." + '\'' +
                '}';
    }
}
