package com.wms.core.mapper;

import java.util.List;

import com.wms.core.domain.Material;

public interface MaterialMapper {

    public Material selectList();

    public List<Material> selectAll();

    public List<Material> selectListFromList(List<String> list);

//    public void insertMaterial(Material material);

    public Material selectOne(String materialId);
    
    public void insertMaterial(Material material);
}
