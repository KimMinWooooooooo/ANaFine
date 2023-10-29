package com.ssafy.backend.domain.repository;

import com.ssafy.backend.domain.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category, String> {

    // 대분류 출력
    @Query(value = "select * from Category c where c.parentCategory is null")
    List<Category> findLargeCategory();

    // 중분류 이하 출력
    @Query(value = "select * from Category where parent_category_id = :parentCategoryId")
    List<Category> findCategoryByParentCategoryId(String parentCategoryId);

//    List<Category> findByCategoryId(String categoryId);

//    @Query(value = "SELECT c FROM Category c WHERE c.parentCategory is not null")
//    List<Category> findByParentCategoryId(String parentCategoryId);
}
