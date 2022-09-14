package classes;
import java.lang.*;


import interfaces.*;

public class Authority implements ICustomer,IDriver,ICar
 {

    private Customer customers[]=new Customer[500];
    private Driver drivers[]=new Driver[50];
    private Car cars[]=new Car[40];
    private Ride rides[]=new Ride[1000];

    public Car availableCar() 
	{
        for(int i=0;i<cars.length;i++)
        {
            if(cars[i]!=null && cars[i].isFree())
			{
                return cars[i];
            }
            else
			{
                System.out.println("Car are not Available right now");
            }
        }
        return null;
    }

    

    public Driver availableDrivers() {
        for(int i=0;i<drivers.length;i++)
        {
            if(drivers[i] != null && drivers[i].isFree())
            {
                return drivers[i];
            }
            else {
                System.out.println("Driver are not available right now");
            }
        }
        return null;
    }


    public boolean insertCustomer(Customer customer)
    {
        boolean flag = false;
        for(int i=0; i<customers.length; i++)
        {
            if(customers[i] == null)
            {
                customers[i] = customer;
                flag = true;
                break;
            }
        }
        return flag;
    }

    public boolean removeCustomer(Customer customer)
    {
        boolean flag = false;
        for(int i=0; i<customers.length; i++)
        {
            if(customers[i] == customer)
            {
                customers[i] = null;
                flag = true;
                break;
            }
        }
        return flag;
    }
    public Customer searchCustomer(String customerId)
    {
       Customer customer = null;

        for(int i=0; i<customers.length; i++)
        {
            if(customers[i] != null)
            {
                if(customers[i].getCustomerId().equals(customerId))
                {
                    customer = customers[i];
                    break;
                }
            }
        }
        return customer;
    }


    public void showAllCustomers()
    {
        for(int i=0; i<customers.length; i++)
        {
            if(customers[i] != null)
            {
                customers[i].showDetails();
            }
        }
    }
    public boolean insertDriver(Driver driver)
    {
        boolean flag = false;
        for(int i=0; i<drivers.length; i++)
        {
            if(drivers[i] == null)
            {
                drivers[i] = driver;
                flag = true;
                break;
            }
        }
        return flag;
    }

    public boolean removeDriver(Driver driver)
    {
        boolean flag = false;
        for(int i=0; i<drivers.length; i++)
        {
            if(drivers[i] == driver)
            {
                drivers[i] = null;
                flag = true;
                break;
            }
        }
        return flag;
    }


    public void showAllDrivers()
    {
        for(int i=0; i<drivers.length; i++)
        {
            if(drivers[i] != null)
            {
                drivers[i].showDetails();
            }
        }
    }
    public Driver searchDriver(String driverId)
    {
        Driver driver = null;

        for(int i=0; i<drivers.length; i++)
        {
            if(drivers[i] != null)
            {
                if(drivers[i].getDriverId().equals(driverId))
                {
                    driver = drivers[i];
                    break;
                }
            }
        }
        return driver;
    }
    public boolean insertCar(Car car)
    {
        boolean flag = false;
        for(int i=0; i<cars.length; i++)
        {
            if(cars[i] == null)
            {
                cars[i] = car;
                flag = true;
                break;
            }
        }
        return flag;
    }

    public boolean removeCar(Car car)
    {
        boolean flag = false;
        for(int i=0; i<cars.length; i++)
        {
            if(cars[i] == car)
            {
               cars[i] = null;
               flag = true;
               break;
            }
        }
        return flag;
    }

    public Car searchCar(String carNo)
    {
       Car car = null;

        for(int i=0; i<cars.length; i++)
        {
            if(cars[i] != null)
            {
                if(cars[i].getCarNo().equals(carNo))
                {
                    car= cars[i];
                    break;
                }
            }
        }
        return car;
    }

    public void showAllCars()
    {
        for(int i=0; i<cars.length; i++)
        {
            if(cars[i] != null)
            {
                cars[i].showDetails();
            }
        }
    }
 public Driver[] getDrivers()
 {
        return drivers;
    }

    public Car[] getCars() 
	{
        return cars;
    }
}
 