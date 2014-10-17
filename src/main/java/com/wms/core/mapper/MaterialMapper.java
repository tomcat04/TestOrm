package com.wms.core.mapper;

import java.util.List;

import com.wms.ma.bean.MaterialSrcBean;

public interface MaterialMapper {

    public MaterialSrcBean selectList();

    public List<MaterialSrcBean> selectAll();

    public List<MaterialSrcBean> selectListFromList(List<String> list);

//    public void insertMaterial(Material material);

    public MaterialSrcBean selectOne(String materialId);
    
    public void insertMaterial(MaterialSrcBean material);
}
