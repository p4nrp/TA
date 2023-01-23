package Entity;

public class FilmEntity implements DataEntity
{
    private String title;
    private String code;
    private String author;
    private String publisher;

    public FilmEntity(String code, String title, String author, String publisher)
    {
        this.code = code;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }



    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public void setCode(String code) {
        this.code = code;
    }


    public String getTitle() {
        return this.title;
    }

    @Override
    public void setTitLe(String title) {
        this.title = title;
    }

    @Override
    public String getAuthor() {
        return this.author;
    }

    @Override
    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String getPublisher() {
        return this.publisher;
    }

    @Override
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

}
