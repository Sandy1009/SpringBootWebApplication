package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductsController {

    @RequestMapping("products")
    public String product() {
        System.out.println("Called Products page......");
        return "pages/products";
    }

}
