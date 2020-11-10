package com.study.study;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
public class Demo {

    @Id @GeneratedValue
    private String name;

    @Temporal(value = TemporalType.TIMESTAMP)
    private Date createdAt;

    @Override
    public String toString() {
        return "Demo{" +
                "name='" + name + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}
