namespace CoffeeMachine
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Human Persona1 = new Human();

            Persona1.CookCoffee(new CapsuleMachine());
            Persona1.CookCoffee(new CarobCoffee());
        }
    }
}