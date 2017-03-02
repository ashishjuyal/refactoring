using NUnit.Framework;
using RefactoringWorkshop.Bloaters.Primitive;

namespace Test.Bloaters.Primitive
{
    [TestFixture]
    public class ProductServiceTest
    {
        private ProductService _service;
        private Product _product;
        [SetUp]
        public void Initialize()
        {
            _service = new ProductService();
            _product = new Product();
        }

        [Test]
        public void should_add_product_to_cart_when_product_id_starts_with_PP() {
            _product.ProductId = "PD123";
            Assert.True(_service.AddProductToCart(_product));
        }

        [Test]
        public void should_NOT_add_product_to_cart_when_product_id_does_not_starts_with_PP() {
            _product.ProductId = "AA123";
            Assert.False(_service.AddProductToCart(_product));
        }
    }
}