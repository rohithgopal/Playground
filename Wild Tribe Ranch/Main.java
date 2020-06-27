#include<iostream>
int main()
{
  int max,me;
  std::cin>>max>>me;
  if(max>me)
    std::cout<<"Yes, you can enter.";
  else if(max==me)
    std::cout<<"Yes, you can enter. Kindly use a rope.";
  else
    std::cout<<"Sorry, you can't enter";
}