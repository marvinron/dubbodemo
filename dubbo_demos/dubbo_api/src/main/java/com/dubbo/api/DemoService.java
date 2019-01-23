package com.dubbo.api;

import java.util.List;

/**
 * @author houlei
 * @DESC:对外的接口
 * @create 2019-01-22 16:26
 */
public interface DemoService {

    List<String> getPermeisons(Long id);
}
