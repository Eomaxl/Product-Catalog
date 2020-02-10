# E Commerce - product-cataloge
Spring Boot Rest 
Spring Data JPA 
H2 in-memory database
Maven

Urls:
All products: GET: http://localhost:8080/products/
Search by type: GET:- http://localhost:8080/product/?productType=footwear
Add product: POST:- http://localhost:8080/product

JSON Sample:
 {
     "productName":"Levis",
     "productDesc":"some description",
     "productSeller":"abcd2",
     "productType":"cosmetics",
     "productPerUnit":10,
     "productPrice":100,
     "productStock":200
  }
