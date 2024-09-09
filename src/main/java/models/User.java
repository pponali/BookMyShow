package models;


import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name = "bms_user")
public class User extends BaseModel{


    private String email;
    private String name;

    private List<Show> shows;

}
