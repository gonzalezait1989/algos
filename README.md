# Answers to the programming exercise:


## Question 1:

_The answer is C, the code will not compile because the method "show" is final on class "Base.java" and cannot be overwritten_

## Question 2:

_The answer is A, this is an example of polymorphism. You can access the method Print from Derived using a Base type reference, but as the code is written in this question, the answer will be D, because the Strings have double quotes two times at the beginning and the end of the declaration but I guess that this is a typo._

## Question 3:

_The answer is C. int arrays cannot be declared like this in Java._

## Question 4:

_The answer is A. But it has the same typo as in question 2._

## Question 5:

_The answer is A._

## Question 6:

_The answer is A. The code will not compile because catch block for ArrayIndexOutOfBoundsException is unreachable, because the exception is already being catched as Exception._

## Question 7:

_The answer is B. Throwable also can be used to handle Errors, but the question is specific._

## Question 8:

_The answer is A. Integer is inmutable and it is passed by value to methods so the value is not changed after calling swap._

## Question 9:

_Look at Employees.java and EmployeesTest.java classes_

## Question 10:

_Est� resuelto en la clase SiguienteElementoMayor.java y he implementado los Tests en la clase SiguienteElementoMayorTest.java_
### A)

_La estructura de datos que he utilizado son simples arrays de enteros puesto que a nivel de rendimiento son mejores que las listas y no necesito ninguna operaci�n que las listas puedan proporcionar, puesto que solo leo o escribo valores en posiciones ya inicializadas, no necesito eliminar elementos ni hacer crecer nada din�micamente._


### B)

_La complejidad del algoritmo es O(n*(n-m)) puesto que recorremos los n elementos del array  y dentro de este bucle, volvemos a recorrer un m�ximo de n-m (donde m es el numero de elementos que ya hemos recorrido previamente) elementos (y es m�ximo, puesto que en el momento en el que encontremos un valor mayor, saldremos del bucle m�s interno). Para simplificar, podemos decir que la complejidad ser�a O(n^2). Es posible que haya maneras de hacer un c�digo m�s legible y m�s sencillo pero no se me ocurre una manera de hacerlo m�s eficiente._





