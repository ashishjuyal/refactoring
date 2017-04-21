namespace RefactoringWorkshop.OOAbusers.Switches
{
    public class Car : ICar
    {
        public const int SPORTS = 1;
        public const int FAMILY = 2;
        public const int SMALL = 3;
        public const int DEFAULT = 4;

        private int type;

        public int Type() {
            return type;
        }

        public Car(int type) {
            this.type = type;
        }

        public string FuelCapacity()
        {
            switch(type) {
                case SPORTS:
                    return "100 liters";
                case FAMILY:
                    return "40 liters";
                case SMALL:
                    return "20 liters";
                default:
                    return "50 liters";
            }
        }

        public string FuelAverage()
        {
            switch(type) {
                case SPORTS:
                    return "3 Km/Liter";
                case FAMILY:
                    return "10 Km/Liter";
                case SMALL:
                    return "15 Km/Liter";
                default:
                    return "12 Km/Liter";
            }
        }

        public string Features()
        {
            switch(type) {
                case SPORTS:
                    return "Sports car limited edition";
                case FAMILY:
                    return "Best family car in the segment";
                case SMALL:
                    return "Very small car";
                default:
                    return "default car";
            }
        }
    }
}