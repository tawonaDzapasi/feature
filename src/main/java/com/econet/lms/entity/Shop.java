
package com.econet.lms.entity;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import javax.persistence.*;

@Entity
@Data
@Table(name = "shop")
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String name;
    @ManyToOne
    @JsonBackReference
    private Area area;
    @PrePersist
    public void updateName(){
        this.name=this.name.toUpperCase();
    }
}
