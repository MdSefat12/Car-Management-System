package interfaces;
import java.lang.*;

import classes.*;
public interface IDriver 
{
    Driver availableDrivers();
    boolean insertDriver(Driver driver);
    boolean removeDriver(Driver driver);
    void showAllDrivers();
}
