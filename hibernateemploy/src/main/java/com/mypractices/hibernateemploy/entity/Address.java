package com.mypractices.hibernateemploy.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_eaddress")
    private Integer idAddress;

    private String address;
    private String locality;
    private String state;
    private String country;

    @OneToOne(mappedBy = "address", fetch = FetchType.LAZY)
    private Employ employ;

    @Override
    public String toString() {
        return "Address{" +
                "idAddress=" + idAddress +
                ", address='" + address + '\'' +
                ", locality='" + locality + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", employ=" + employ.getIdEmploy() +
                '}';
    }
}
