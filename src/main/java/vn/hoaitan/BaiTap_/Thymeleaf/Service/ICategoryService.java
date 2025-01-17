package vn.hoaitan.BaiTap_.Thymeleaf.Service;

import org.springframework.data.domain.Sort;
import vn.hoaitan.BaiTap_.Thymeleaf.Entity.Category;


import java.util.List;
import java.util.Optional;

public interface ICategoryService {
    List<Category> findAll();

    <S extends Category> S save(S entity);

    Optional<Category> findById(Long aLong);

    long count();

    void deleteById(Long aLong);

    List<Category> findAll(Sort sort);

    Optional<Category> findCategoriesByCategoryname(String categoryname);
}