package com.wym.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wym.dao.BlogMapper;
import com.wym.entity.Blog;
import com.wym.service.BlogService;
@Service
public class BlogServiceImpl implements BlogService {

	@Autowired BlogMapper blogMapper;
	public List<Blog> queryAll() {
		return blogMapper.queryAll();
	}

}
