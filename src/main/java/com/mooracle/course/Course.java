package com.mooracle.course;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // this a model of an Object hence an Entity in JPA
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //<-auto generated by Spring JPA
    private final Long id; // since it is final it needs to be initialized-> use Constructor for that

    private String title;
    private String url;

    /*
    * The JPA requires a constructors that takes no parameter
    * Thus we will build it using a protected that only classes in this package can access it
    * */
    protected Course() {

        id = null;// <- at first id is set null since it will be auto generated by the Spring JPA
    }

    /*
    * We build also alternate constructor to be user friendly for setting the Course later
    * */

    public Course(String title, String url) {
        /*
        * At this point the dafault (protected) constructor already defined how the id should look like in
        * initialization thus we just called the default using this()
        * */
        this();

        this.title = title;
        this.url = url;
    }
    /*
    * Build Getter and Setters
    * */

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
