package rc;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@Document (collection= "Hotel")
public class Hotel {

    @Indexed(name = "meta_ppn_index_unique", direction = IndexDirection.ASCENDING)
    private int pricePerNight;
    @Id
    private String id;
    public int getPricePerNight() {
        return pricePerNight;
    }
    private String name;
    private Address address;
    private List<Review> reviews;
    protected Hotel() {
        this.reviews= new ArrayList<>();
    }
    public Hotel(String name, int pricePerNight, Address address, List<Review> reviews) {
        this.name = name;
        this.pricePerNight = pricePerNight;
        this.address=address;
        this.reviews=reviews;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public List<Review> getReviews() {
        return reviews;
    }


    public void setPricePerNight(int pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }
}


