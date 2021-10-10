# Company - Boss - Employee

This program is composed by three different classes: Company,Boss and Employee <br>
Each class has its own atributes and methods that can be accessed by the others <br>

## Company

**_This class is defined by the following attributes:_**

- Name
- Address
- Phone
- Website
- Description
- Boss <br>
  **_This class has the following methods:_**
- Setters and Getters
- <code>getCompanyInfo()</code> Displays all asigned atributtes of the class
- <code>getEmployeesInfo()</code> Displays all info about the employees that the company has
- <code>getBossInfo()</code> Displays all info about the boss of the company
- <code>addEmployee()</code> Allows to "hire" new employees for the company
- <code>removeEmployee()</code> Allows to "fire" a individual employee of the company
  This methods can only be executed by the boss

## Boss

**_This class defines the boss of the company is composed by the following atributes:_**

- Name
- Age
- jobTitle
- Company
- Salary
- workingState <br>
  **_The class has the following methods:_**
- Setters and Getters
- <code>getBossInfo()</code> Displays all asigned atributes of the class
- <code>setWokingState()</code> Defines is the boss is doing something
- <code>hireEmployee()</code> Allows to add a new employee to the company
- <code>fireEmployee()</code> Allows to remove a employee of the company
- <code>riseSalary()</code> Allows boss to increment his own salary
- <code>riseEmployeeSalary()</code> Allows boss to increment a individual employee salary

## Employee

**_This class defines the employee of the company and it has the following attributes:_**

- Name
- Address
- Number (id)
- Company
- Department
- Salary
- jobTitle
- hireDate
- workingState <br>
  **_The class has the following metohds:_**
- Getters and Setters
- <code>setWorkingState()</code>
