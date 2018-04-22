package com.java.spi.demo.b.impl;

import com.java.spi.common.Search;

import java.util.Collections;
import java.util.List;

/**
 * @author zhuzhenke
 * @date 2017/08/15
 */
public class DemoBSearch implements Search {

    public List search(String keyword) {
        return Collections.singletonList("DemoBSearch ---" + keyword);
    }
}
