package guru.springframework.repositories;

import guru.springframework.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRegistry extends CrudRepository<Recipe, Long> {
}
