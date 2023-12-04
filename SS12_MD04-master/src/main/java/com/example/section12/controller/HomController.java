package com.example.section12.controller;

import com.example.section12.model.Account;
import com.example.section12.model.Product;
import com.example.section12.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/home")
public class HomController {
    ProductService productService = new ProductService();

    @RequestMapping("")
    public String home(Model model) {

        List<Product> productList = productService.findAll();
        model.addAttribute("products", productList);
        return "home";
    }

    @RequestMapping("/add")
    public String showFormAdd(Model model) {
        Product product = new Product();
        model.addAttribute("product", product);
        return "add";
    }

    @RequestMapping("/create")
    public String create(@ModelAttribute("product") Product product) {
        productService.save(product);
        return "redirect:/home";
    }

    @RequestMapping("edit/{id}")
    public String edit(Model model, @PathVariable int id) {
        Product product = productService.edit(id);
        model.addAttribute("product", product);
        return "edit";
    }

    @RequestMapping( "/edit")
    public String updateProduct(@ModelAttribute("product") Product updatedProduct) {
        productService.update(updatedProduct, updatedProduct.getId());
        return "redirect:/home";
    }

    @RequestMapping("/update")
    public String update(Model model) {
        Product product = new Product();
        model.addAttribute("product", product);
        return "update";
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        productService.delete(id);
        return "redirect:/home";
    }
}




















