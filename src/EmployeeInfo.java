/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author donshua
 */
public class EmployeeInfo    //EmployeeInfo class, that contains the employee info
{   //attributes

    protected int empNumber;
    protected String firstName;
    protected String lastName;
    protected int sex;             //0-Male, 1-Female, 2-Other
    protected int workLocation;    //0-Mississauga, 1-Ottawa, 2-Chicago
    protected double deductionsRate;     //fixed deductions rate, protected since other
    //subclasses have to access it    
    //CONSTRUCTOR for EmployeeInfo class, to assign passed values to the attributes

    public EmployeeInfo(int ID, String fName, String lName, int gender, int location, double dedRate)
    {                             //set the variables
        empNumber = ID;
        firstName = fName;
        lastName = lName;
        sex = gender;
        workLocation = location;
        deductionsRate = dedRate;
    }

    //getter method for getting employee number
    public int getEmpNum()
    {
        return (empNumber);
    }

    //getter method for getting first name
    public String getFirstName()
    {
        return firstName;
    }

    //getter method for getting last name
    public String getLastName()
    {
        return lastName;
    }

    //getter method for getting gender
    public int getSex()
    {
        return sex;
    }

    //getter method for getting working location
    public int getWorkLocation()
    {
        return workLocation;
    }

    //getter method for getting deduction rate
    public double getDeductionsRate()
    {
        return deductionsRate;
    }

    //setter method for empNumber attribute
    public void setEmpNum(int empNo)
    {
        if (empNo < 0)
        {
            return;
        } else
        {
            empNumber = empNo;
        }
    }
}				//end of EmployeeInfo class
