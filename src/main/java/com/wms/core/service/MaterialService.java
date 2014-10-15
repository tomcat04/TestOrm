package com.wms.core.service;

//import com.wms.common.util.WmsException;
import com.wms.core.domain.Material;
import java.util.List;
import org.springframework.stereotype.Service;

public interface MaterialService {

    public List<Material> selectMaterials();

    public Material selectAll();

    public List<Material> selectListFromList(List<String> list);

    public void insert(Material material);

    public Material selectOne(String materialId);
    
//    public void createMaterial(Material material) throws WmsException;
}
