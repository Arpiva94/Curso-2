package com.mx.mex.RepositoryImplement;


import java.math.BigDecimal;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.springframework.transaction.annotation.Transactional;

import com.mx.mex.Entities.CatEstados;
import com.mx.mex.Entities.empleados;
import com.mx.mex.Repository.empleadosDAO;

public class empleadosDAOImpl extends GenericDAO<empleados, Long> implements empleadosDAO {

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<empleados> obtieneEmpleados() {
		
		final Session session = sessionFactory.getCurrentSession();
		final Criteria criteria = session.createCriteria(CatEstados.class);
		
		return (List<empleados>) criteria.list();

}

	@Override
	public int obtenerSecuenciaEmpleados() {
		String sqlSequence = "SELECT SEQ_HISTORICO_CASOS.NEXTVAL AS SECUENCIAUSER FROM DUAL";
		Session session = sessionFactory.getCurrentSession();
		SQLQuery query = session.createSQLQuery(sqlSequence);
		List result = query.list();
		return ((BigDecimal) result.get(0)).intValue();
		
	}
}