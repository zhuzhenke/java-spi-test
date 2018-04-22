package com.java.spi.test;

import com.java.spi.common.Search;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @author zhuzhenke
 * @date 2017/08/15
 */
public class SearchFactory {
    private SearchFactory() {
    }

    public static Search newSearch() {
        Search search = null;
        ServiceLoader<Search> serviceLoader = ServiceLoader.load(Search.class);
        Iterator<Search> searchs = serviceLoader.iterator();
        if (searchs.hasNext()) {
            search = searchs.next();
        }
        if (search == null) {//如果没有spi实现,就是用默认的类对象实现
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            try {
                search = (Search) classLoader.loadClass(Search.defaultSearchClass).newInstance();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return search;
    }
}
