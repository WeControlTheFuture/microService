package com.nemo.common.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.nemo.common.dao.BaseMongoRepository;

public class BaseMongoRespositoryImpl<T, ID extends Serializable> implements BaseMongoRepository<T, ID> {

	@Autowired
	private MongoTemplate mongoTemplate;

	public <S extends T> S save(S entity) {
		mongoTemplate.save(entity);
		// ThreadUtils.printstacktrace();
		return entity;
	}

	public <S extends T> List<S> save(Iterable<S> entites) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<T> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<T> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends T> S insert(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends T> List<S> insert(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends T> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends T> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	public Page<T> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	public T findOne(ID id) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean exists(ID id) {
		// TODO Auto-generated method stub
		return false;
	}

	public Iterable<T> findAll(Iterable<ID> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void delete(ID id) {
		// TODO Auto-generated method stub

	}

	public void delete(T entity) {
		// TODO Auto-generated method stub

	}

	public void delete(Iterable<? extends T> entities) {
		// TODO Auto-generated method stub

	}

	public void deleteAll() {
		// TODO Auto-generated method stub

	}

	public <S extends T> S findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends T> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends T> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	public <S extends T> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}
}
