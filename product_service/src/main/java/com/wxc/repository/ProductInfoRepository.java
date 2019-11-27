package com.wxc.repository;

import com.wxc.pojo.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductInfoRepository extends JpaRepository<ProductInfo,String>{


//   List<ProductInfo> findAllByCategory_type();

    List<ProductInfo> findAllByProductStatusAndCategoryType(Integer status, Integer type);



}
