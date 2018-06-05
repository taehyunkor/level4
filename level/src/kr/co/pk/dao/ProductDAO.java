package kr.co.pk.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.pk.domain.ProductVO;

@Repository
public class ProductDAO {
	@Autowired
	private SqlSession sqlSession;
	
	//데이터 삽입
	public void insert(ProductVO vo) {
		sqlSession.insert("product.insert", vo);
	}
	//데이터 조회
	public ProductVO search(String code) {
		return sqlSession.selectOne("product.search", code);
	}
	//데이터 수정
	public void update(ProductVO vo) {
		sqlSession.update("product.update", vo);
	}
	//데이터 삭제
	public void delete(String code) {
		sqlSession.insert("product.delete", code);
	}
	
	public List<Map> fast() {
		return sqlSession.selectList("product.fast");
	}
	
	
	
}




