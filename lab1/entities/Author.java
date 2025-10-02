public class Author {
    private Integer authorId;
    private String name;
    private String surname;
    private String country;

    public Author(Integer authorId, String name, String surname, String country) {
        this.authorId = authorId;
        this.name = name;
        this.surname = surname;
        this.country = country;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
