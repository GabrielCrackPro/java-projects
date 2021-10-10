# Company - Boss - Employee

This program is composed by three different classes: Company,Boss and Employee <br>
Each class has its own atributes and methods that can be accessed by the others <br>

## Company

This class is defined by the following attributes:

- Name
- Address
- Phone
- Website
- Description
- Boss <br>
  This class has the following methods:
- Setters and Getters
- getCompanyInfo() - Displays all asigned atributtes of the class
- getEmployeesInfo() - Displays all info about the employees that the company has
- getBossInfo() - Displays all info about the boss of the company
- addEmployee() - Allows to "hire" new employees for the company
- removeEmployee() - Allows to "fire" a individual employee of the company
  This methods can only be executed by the boss

## Boss

This class defines the boss of the company is composed by the following atributes:

- Name
- Age
- jobTitle
- Company
- Salary
- workingState <br>
  The class has the following methods:
- Setters and Getters
- getBossInfo() - Displays all asigned atributes of the class
- setWokingState() - Defines is the boss is doing something
- hireEmployee() - Allows to add a new employee to the company
- fireEmployee() - Allowa to remove a employee of the company
- riseSalary() - Allows boss to increment his own salary
- riseEmployeeSalary() - Allows boss to increment a individual employee salary

## Employee

This class defines the employee of the company and it has the following attributes:

- Name
- Address
- Number (id)
- Company
- Department
- Salary
- jobTitle
- hireDate
- workingState <br>
  The class has the following metohds:
- Getters and Setters
- setWorkingState
