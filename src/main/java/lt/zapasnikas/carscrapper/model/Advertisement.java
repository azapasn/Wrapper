package lt.zapasnikas.carscrapper.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Advertisement {
    @Id
    @Column
    private String Id;
    @Column
    private String link;
    @JsonIgnore
    @ManyToOne
    private Seller seller;
    private int price;

    @OneToMany(mappedBy = "advertisement", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<CarParam> carParams = new ArrayList<>();

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        this.Id = id;
    }


    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public List<CarParam> getCarParams() {
        return carParams;
    }

    public void setCarParams(List<CarParam> carParams) {
        this.carParams = carParams;
    }

    public String toString() {
        return getId();
    }
}
