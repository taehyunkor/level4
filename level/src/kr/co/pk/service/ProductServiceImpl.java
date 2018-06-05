package kr.co.pk.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.pk.dao.ProductDAO;
import kr.co.pk.domain.ProductVO;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductDAO productDAO;

	@Override
	public void insert(ProductVO vo) {
		productDAO.insert(vo);
	}

	@Override
	public ProductVO search(String code) {
		return productDAO.search(code);
	}

	@Override
	public void update(ProductVO vo) {
		productDAO.update(vo);
		
	}

	@Override
	public void delete(String code) {
		productDAO.delete(code);
		
	}

	@Override
	public List<Map> fast() {
		// TODO Auto-generated method stub
		return productDAO.fast();
	}
}




