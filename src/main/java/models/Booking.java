package models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;


@Getter
@Setter
@Entity
public class Booking extends BaseModel {

    private int amount;
    private Date bookingDate;
    private BookingStatus bookingStatus;
    //1:M mapping
    //One user can have multiple bookings
    //One booking can have only one user
    @OneToMany
    private User user;
    @OneToMany
    private List<ShowSeat> showSeats;
    @OneToMany
    private List<Payment> payment;
    @ManyToOne
    private Show show;

}
