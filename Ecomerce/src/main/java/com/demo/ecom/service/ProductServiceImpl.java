package com.demo.ecom.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.ecom.dao.PoductShopDAO;
import com.demo.ecom.dao.ProductDAO;
import com.demo.ecom.entity.Product;
import com.demo.ecom.entity.ProductShop;
import com.demo.ecom.entity.ProductsShops;
import com.demo.ecom.entity.ShopQuantity;
import com.demo.ecom.response.ResponseObject;
import com.demo.ecom.utils.ResponseUtils;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDAO productDAO;
	@Autowired
	ResponseUtils responseUtils;

	@Autowired
	PoductShopDAO poductShopDAO;

	@Override
	public ResponseObject getProductsDetails(String productName) {
		List<ProductShop> productList = assignStoresToProduct(productDAO.findByProductMatchingName(productName));
		return responseUtils.createProductResponse(productList);
	}

	@Override
	public List<ProductShop> assignStoresToProduct(List<Product> productList) {
		List<ProductShop> productShopList = new ArrayList<>();
		if (!productList.isEmpty()) {

			for (Product product : productList) {
				List<ShopQuantity> storeIds = new ArrayList<>();
				List<ProductsShops> productStoreList = poductShopDAO.findByProductId(product.getProductId());
				ProductShop pshop = new ProductShop();

				pshop.setProductBrand(product.getProductBrand());
				pshop.setProductCost(product.getProductCost());
				pshop.setProductDescription(product.getProductDescription());
				pshop.setProductName(product.getProductName());
				pshop.setProductId(product.getProductId());
				for (ProductsShops productStore : productStoreList) {
					ShopQuantity shopQuantity = new ShopQuantity();
					shopQuantity.setShopId(productStore.getShopId());
					shopQuantity.setQuantity(productStore.getQuantity());
					storeIds.add(shopQuantity);
				}
				pshop.setShop(storeIds);
				productShopList.add(pshop);
			}
		}
		return productShopList;
	}
}
