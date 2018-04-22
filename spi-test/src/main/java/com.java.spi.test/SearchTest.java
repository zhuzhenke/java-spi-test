package com.java.spi.test;

import com.java.spi.common.Search;

import java.util.List;

/**
 * @author zhuzhenke
 * @date 2017/08/15
 */
public class SearchTest {

    public static void main(String[] args) {
        //通过消除或修改为pom.xml文件中的spi-demo-a或spi-demo-b即可见到效果
        Search search = SearchFactory.newSearch();
        if (search != null) {
            System.out.println(search.getClass());
            List result = search.search("sss");
            System.out.println(result.get(0));
        }
    }
}
