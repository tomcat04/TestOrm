package com.wms.core.mapper;

import java.util.List;

import com.wms.ma.bean.MaterialSrcBean;

public interface MaterialMapper {


    public List<MaterialSrcBean> selectAll();
    
    public long insetOne(MaterialSrcBean msb);
    
    public MaterialSrcBean selectOne(String materialCode);

}
