package service.mapper;

public class techerassolutionsMapper {

    category    category

    public Category toCategory(CategoryDTO categoryDTO) {
        Category category = new Category();

        category.setId(categoryDTO.getId());
        category.setDescription(categoryDTO.getDescription());

        return category;
    }

    public CategoryDTO toCategoryDTO(Category category) {
        CategoryDTO categoryDTO = new CategoryDTO();

        categoryDTO.setId(category.getId());
        categoryDTO.setDescription(category.getDescription());

        return categoryDTO;

    }

}
