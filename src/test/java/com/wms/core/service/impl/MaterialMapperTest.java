/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wms.core.service.impl;

import com.wms.core.mapper.MaterialMapper;
import com.wms.ma.bean.MaterialSrcBean;
import com.wms.util.test.WmsSpringJUnit4ClassRunner;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.transaction.TransactionConfiguration;

/**
 *
 * @author chengangxiong
 */
@RunWith(WmsSpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext-orm.xml"})
//@ContextConfiguration(locations={"file:src/main/java/applicationContext-core.xml"})
@TransactionConfiguration(defaultRollback = false)
public class MaterialMapperTest {

    /**
     * 设置自动注入的属性
     */
    @Autowired
    private MaterialMapper materialMapper;

    public MaterialMapperTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of selectAll method, of class MaterialServiceImpl.
     */
    @Test
    public void testSelectAll() {
        MaterialSrcBean m = new MaterialSrcBean();
        m.setMaterialCode("eer");
        m.setMaterialDesc("uuii");
        m.setMaterialSrc("09iu");
        long l = materialMapper.insetOne(m);
        System.out.println("*** " + l);
    }

}
