package edu.truongvx.demo_DB.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class Customer {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "name") // Bạn có thể sửa lại đúng tên cột trong DB
    private String name;

    @Column(name = "address") // Thêm ví dụ các thuộc tính khác
    private String address;

    // Constructors
    public Customer() {}

    public Customer(Long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    // Getters & Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getaddress() {
        return address;
    }

    public void setaddress(String address) {
        this.address = address;
    }
}
