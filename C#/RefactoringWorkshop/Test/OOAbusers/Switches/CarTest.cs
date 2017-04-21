using NUnit.Framework;
using RefactoringWorkshop.OOAbusers.Switches;

namespace Test.OOAbusers.Switches
{
    public class CarTest
    {
        private ICar _sportsCar;
        private ICar _familyCar;
        private ICar _smallCar;
        private ICar _defaultCar;

        [SetUp]
        public void Setup() {
            _sportsCar = new Car(Car.SPORTS);
            _familyCar = new Car(Car.FAMILY);
            _smallCar = new Car(Car.SMALL);
            _defaultCar = new Car(Car.DEFAULT);
        }

        [Test]
        public void should_return_the_fuel_capacity_of_the_sports_car() {
            Assert.AreEqual("100 liters", _sportsCar.FuelCapacity());
        }

        [Test]
        public void should_return_the_fuel_capacity_of_the_family_car() {
            Assert.AreEqual("40 liters", _familyCar.FuelCapacity());
        }

        [Test]
        public void should_return_the_fuel_capacity_of_the_small_car() {
            Assert.AreEqual("20 liters", _smallCar.FuelCapacity());
        }

        [Test]
        public void should_return_the_fuel_capacity_of_the_default_car() {
            Assert.AreEqual("50 liters", _defaultCar.FuelCapacity());
        }

        [Test]
        public void should_return_the_fuel_average_of_the_sports_car() {
            Assert.AreEqual("3 Km/Liter", _sportsCar.FuelAverage());
        }

        [Test]
        public void should_return_the_fuel_average_of_the_family_car() {
            Assert.AreEqual("10 Km/Liter", _familyCar.FuelAverage());
        }

        [Test]
        public void should_return_the_fuel_average_of_the_small_car() {
            Assert.AreEqual("15 Km/Liter", _smallCar.FuelAverage());
        }

        [Test]
        public void should_return_the_fuel_average_of_the_default_car() {
            Assert.AreEqual("12 Km/Liter", _defaultCar.FuelAverage());
        }

        [Test]
        public void should_return_the_features_of_the_sports_car() {
            Assert.AreEqual("Sports car limited edition", _sportsCar.Features());
        }

        [Test]
        public void should_return_the_features_of_the_family_car() {
            Assert.AreEqual("Best family car in the segment", _familyCar.Features());
        }

        [Test]
        public void should_return_the_features_of_the_small_car() {
            Assert.AreEqual("Very small car", _smallCar.Features());
        }

        [Test]
        public void should_return_the_features_of_the_default_car() {
            Assert.AreEqual("default car", _defaultCar.Features());
        }
    }
}