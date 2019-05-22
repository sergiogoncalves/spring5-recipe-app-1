package guru.springframework.service;

import guru.springframework.domain.Recipe;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by jt on 6/13/17.
 */
@Service
public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long id) throws Exception;
}