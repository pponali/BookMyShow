package models;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Movie extends BaseModel{

    private String title;
    private String description;
    private String language;
    private String genre;
    private String duration;
    private String releaseDate;
    private String director;
    private String cast;
    private String trailer;
    private String poster;
    private String status;
    private String rating;
    private String totalRating;
}
