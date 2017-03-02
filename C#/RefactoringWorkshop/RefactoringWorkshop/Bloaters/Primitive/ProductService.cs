using System;
using System.Collections.Generic;

namespace RefactoringWorkshop.Bloaters.Primitive
{
    public class ProductService
    {
        private readonly List<Product> _cart = new List<Product>();

        public bool AddProductToCart(Product product) {
            var productId = product.ProductId;

            if(isValid(productId)) {
                _cart.Add(product);
                return true;
            }
            return false;
        }

        private bool isValid(string productId) {
            return productId.StartsWith("PD");
        }
    }
}