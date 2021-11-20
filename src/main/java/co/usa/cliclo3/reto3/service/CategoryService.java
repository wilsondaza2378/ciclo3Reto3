/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.cliclo3.reto3.service;

import co.usa.cliclo3.reto3.model.Category;
import co.usa.cliclo3.reto3.repository.CategoryRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author asus
 */
@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAll(){
        return categoryRepository.getAll();
    }

    public Optional<Category> getCategory(int id){
        return categoryRepository.getCategory(id);
    }

    public Category save(Category category){
        if(category.getId()==null){
            return categoryRepository.save(category);
        }else {
            Optional<Category> categoriaAux=categoryRepository.getCategory(category.getId());
            if(categoriaAux.isEmpty()){
                return categoryRepository.save(category);
            }else{
                return category;
            }
        }
    }

}
