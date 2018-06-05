package kr.co.pk.service;

import java.util.List;
import java.util.Map;

import kr.co.pk.domain.ProductVO;

public interface ProductService {
	//데이터를 삽입하는 메소드
	public void insert(ProductVO vo);
	//데이터를 조회하는 메소드
	public ProductVO search(String code);
	//데이터를 수정하는 메소드
	public void update(ProductVO vo);
	//데이터를 삭제하는 메소드
	public void delete(String code);
	
	public List<Map> fast();
}
