/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wms.core.service.impl;

import com.wms.core.domain.Material;
import com.wms.core.service.MaterialService;
import com.wms.core.test.JUnit4ClassRunner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
@RunWith(JUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext-core.xml"})
//@ContextConfiguration(locations={"file:src/main/java/applicationContext-core.xml"})
@TransactionConfiguration(defaultRollback = false)
public class MaterialServiceImplTest {

    /**
     * 设置自动注入的属性
     */
    @Autowired
    private MaterialService materialService;

    public MaterialServiceImplTest() {
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
        List<Material> list = materialService.selectMaterials();
        System.out.println("*** " + list.size());
    }

    @Test
    public void testCreateMaterial() {
        Material material = new Material();
        material.setMaterialId("12345678-00");
        material.setMaterialDesc("物料描述");
        material.setImageUrl("/app/imag/123456-00.jpg");
        materialService.createMaterial(material);
    }

    //测试数据库连接
    @Test
    public void testSelectAll1() throws ClassNotFoundException, SQLException {
        //1.准备参数
        String driver = "oracle.jdbc.driver.OracleDriver";

        //2.构造驱动实例
        Class.forName(driver);

        //3.创建连接
        //连接字符串是固定的形式,oracle的形式:
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        //4.执行SQL语句
        try (Connection conn = DriverManager.getConnection(url, "wms_schema", "wms_schema")) {
            //4.执行SQL语句
            String sql = "select * from WMS_MATERIAL_BASIC";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);//执行sql语句
            while (rs.next()) {
                String name = rs.getString(1);
                System.out.println("welcome," + name);
            }
            rs.close();
            stmt.close();
        }
    }
}
