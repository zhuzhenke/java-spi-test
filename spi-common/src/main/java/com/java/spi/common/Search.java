package com.java.spi.common;

import java.util.List;

/**
 * @author zhuzhenke
 * @date 2017/08/15
 */
public interface Search {
    String defaultSearchClass = "com.java.spi.common.impl.DefaultSearch";

    /**
     * 搜索关键字
     */
    List search(String keyword);
}
