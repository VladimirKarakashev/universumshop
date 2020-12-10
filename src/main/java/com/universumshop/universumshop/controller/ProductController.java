package com.universumshop.universumshop.controller;

import com.universumshop.universumshop.model.Product;
import com.universumshop.universumshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping("/products")
    public String getProducts(Model model) {
        List<Product> productList = service.listAll();
        model.addAttribute("productList", productList);
        model.addAttribute("activePage", "products");
        return "products";
    }

    @GetMapping("/itemslist")
    public String viewProductList(Model model) {
        List<Product> productList = service.listAll();
        model.addAttribute("productList", productList);
        model.addAttribute("activePage", "itemslist");

        return "itemslist";
    }

    @RequestMapping("/newProduct")
    public String newProduct(Model model) {
        Product product = new Product();
        model.addAttribute("product", product);
        return "new_product";
    }

    @RequestMapping(value = "/addProduct", method = RequestMethod.POST)
    public String addNewItem(@ModelAttribute("product") Product product) {
        service.save(product);
        return "redirect:/itemslist";
    }

    @RequestMapping("/editProduct")
    public String getEditProduct(Model model) {
        model.addAttribute("activePage", "edit_product");
        return "edit_product";
    }

    @RequestMapping("/editProduct/{id}")
    public ModelAndView editProductForm(@PathVariable(name = "id") Long id) {
        ModelAndView mav = new ModelAndView("edit_product");
        Product product = service.get(id);
        mav.addObject("product", product);
        return mav;
    }

    @RequestMapping("/deleteProduct/{id}")
    public String deleteProduct(@PathVariable (name = "id") Long id) {
        service.delete(id);
        return "redirect:/itemslist";
    }




}
