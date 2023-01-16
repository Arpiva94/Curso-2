package com.mx.mex.RepositoryImplement;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mx.mex.Entities.CatEstados;
import com.mx.mex.Repository.CatEstadosDAO;

@Repository
public class CatEstadosDAOImpl extends GenericDAO<CatEstados, Long> implements CatEstadosDAO {
     
	
	
	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<CatEstados> obtieneEstados() {
		
		final Session session = sessionFactory.getCurrentSession();
		final Criteria criteria = session.createCriteria(CatEstados.class);
		
		return (List<CatEstados>) criteria.list();
}
}