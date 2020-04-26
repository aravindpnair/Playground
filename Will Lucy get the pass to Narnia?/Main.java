#include<iostream>
int main() {
  int choice,num1,num2;
  std::cin>>num1>>num2>>choice;
  std::cout<<"Enter first number : Enter second number : Menu\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Remainder\n";
  switch(choice) {
    case 1: std::cout<<num1+num2;
      		break;
    case 2: std::cout<<num1-num2;
      		break;
    case 3: std::cout<<num1*num2;
      		break;
    case 4: std::cout<<num1/num2;
      		break;
    case 5: std::cout<<num1%num2;
      		break;
    default: std::cout<<"Invalid operation";
  }
}