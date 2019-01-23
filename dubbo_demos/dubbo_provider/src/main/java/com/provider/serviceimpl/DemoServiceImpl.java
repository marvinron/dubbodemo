package com.provider.serviceimpl;

import com.dubbo.api.DemoService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author houlei
 * @DESC:服务的实现
 * @create 2019-01-22 16:29
 */
public class DemoServiceImpl implements DemoService {
    @Override
    public List<String> getPermeisons(Long id) {
        List<String> list = new ArrayList<>();
        list.add("123");
        list.add("124");
        list.add("125");
        list.add("126");
        return list;
    }
}
