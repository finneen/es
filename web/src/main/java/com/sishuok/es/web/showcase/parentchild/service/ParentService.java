/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.sishuok.es.web.showcase.parentchild.service;

import com.sishuok.es.common.service.BaseService;
import com.sishuok.es.web.showcase.parentchild.entity.Child;
import com.sishuok.es.web.showcase.parentchild.entity.Parent;
import com.sishuok.es.web.showcase.parentchild.repository.ParentRepository;
import org.apache.commons.lang3.ArrayUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Arrays;

/**
 * <p>User: Zhang Kaitao
 * <p>Date: 13-2-4 下午3:01
 * <p>Version: 1.0
 */
@Service
public class ParentService extends BaseService<Parent, Long> {

    private ParentRepository parentRepository;

    @Autowired
    public void setParentRepository(ParentRepository parentRepository) {
        this.parentRepository = parentRepository;
        setBaseRepository(parentRepository);
    }


    public void delete(Long[] ids) {
        if(ArrayUtils.isEmpty(ids)) {
            return;
        }
        parentRepository.deleteByIds(Arrays.asList(ids));
    }
}
