package vn.hoaitan.BaiTap_.Thymeleaf.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.hoaitan.BaiTap_.Thymeleaf.Entity.Category;


import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    Optional<Category> findCategoriesByCategoryname(String categoryname);
}
