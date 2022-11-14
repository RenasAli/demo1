package com.example.demo.Controller;

import com.example.demo.Model.Images;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/image")

public class ImageController {

    int Count;
    List<Images> imagesList;


    public ImageController() {
       imagesList= new ArrayList<>();
    }

    @GetMapping()
   public  ResponseEntity<List<Images>> findAll(){
        System.out.println(imagesList);
        return ResponseEntity.ok().body(imagesList);
    }

    @PostMapping()
    public ResponseEntity<List<Images>> create(@RequestBody Images images){
        images.setId(Count ++);
        imagesList.add(images);
        return ResponseEntity.ok().body(imagesList);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Images> delete(@PathVariable("id") int id){
        Images images= imagesList.stream().filter(e -> e.getId().equals(id)).findFirst().get();
        imagesList.remove(images);
     return ResponseEntity.ok().body(images);
    }

}
