package com.example.lab1;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloControl {
    @RequestMapping(value = "/hallo",method = RequestMethod.GET)
    public String say(){
        return "hello!";
    }

    @RequestMapping(value = "/hallo/{id}",method = RequestMethod.GET)
    public testEntity sayq(@RequestParam(value = "qid",required = true)String qid, @PathVariable("id")String id){
        testEntity t = new testEntity(id,qid);
        return t;
    }

}
