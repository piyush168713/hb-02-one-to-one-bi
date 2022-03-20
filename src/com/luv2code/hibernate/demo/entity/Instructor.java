package com.luv2code.hibernate.demo.entity;

import javax.persistence.*;

@Entity
@Table(name="instructor")
public class Instructor {

    // annotate the class as an entity and map to db table

    // define the fields

    // annotate the fields with db column names

    // *** setup mapping to InstructorDetail entity

    // create constructors

    // generate getter/setter methods

    // generate toString() methods

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="email")
    private String email;

    @OneToOne(cascade=CascadeType.ALL)                  // relationship b/w instructor class and instructorDetail class.
    @JoinColumn(name="instructor_detail_id")
    private InstructorDetail instructorDetail;

    // constructor defined
    public Instructor(){

    }

    public Instructor(String firstName, String lastName, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    // getter/setter methods
    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getlastName(){
        return lastName;
    }

    public void setlastName(String lastName){
        this.lastName = lastName;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public InstructorDetail getInstantorDetail(){
        return instructorDetail;
    }

    public void setInstantorDetail(InstructorDetail instructorDetail){
        this.instructorDetail = instructorDetail;
    }

    @Override
    public String toString(){
        return "Instructor [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName +
                ", email=" + email + ", instructorDetail=" + instructorDetail + "]";
    }


}
