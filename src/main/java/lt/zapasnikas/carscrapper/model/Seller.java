package lt.zapasnikas.carscrapper.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Seller {
    @Id
    @Column
    private String phoneNumber;
    @Column
    private String sellerLocation;
    @OneToMany(mappedBy = "seller", cascade = CascadeType.ALL)
    private List<Advertisement> advertisements = new ArrayList<>();

    public Seller() {
    }
    public Seller(String phoneNumber, String sellerLocation) {
        this.phoneNumber = phoneNumber;
        this.sellerLocation = sellerLocation;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSellerLocation() {
        return sellerLocation;
    }

    public void setSellerLocation(String sellerLocation) {
        this.sellerLocation = sellerLocation;
    }

    public List<Advertisement> getAdvertisements() {
        return advertisements;
    }

    public void setAdvertisements(List<Advertisement> advertisements) {
        this.advertisements = advertisements;
    }
}