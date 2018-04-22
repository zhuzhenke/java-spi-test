package com.java.spi.demo.a.impl;

import com.java.spi.common.Search;

import java.util.Collections;
import java.util.List;

/**
 * @author zhuzhenke
 * @date 2017/08/15
 */
public class DemoASearch implements Search {

    public List search(String keyword) {
        return Collections.singletonList("DemoASearch ---" + keyword);
    }
}
