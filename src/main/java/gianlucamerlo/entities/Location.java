package gianlucamerlo.entities;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table ( name="location")
public class Location {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY )
    private long id;
    @Column
    private String name;
    @Column
    private String city;


    public Location(){}
     public Location(String name, String city)
     {this.name=name;
     this.city=city;
     }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    @Override
    public String toString() {
        return "Location{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
