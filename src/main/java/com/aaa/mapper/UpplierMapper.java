package com.aaa.mapper;

import com.aaa.entity.Upplier;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UpplierMapper {
    List<Upplier> findAllUpplier(Upplier upplier);
    int deleteUpplier(Integer supplierId);
    int addUpplier(Upplier upplier);
    int editUpplier(Upplier upplier);
    int count(Upplier upplier);
}
