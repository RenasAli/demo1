package com.example.demo.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@Data
public class Images {
    Integer id;
    Long Size;
    String user;
    String name;
    String title;

    String desc;
    String image;
    String created;

}
