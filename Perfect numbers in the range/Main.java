#include<iostream>
using namespace std;
int main()
{
  int i,j,start,sum,end;
  cin>>start>>end;
  for(i=start;i<=end;i++){
    sum=0;
    for(j=1;j<=i/2;j++){
      if(i%j==0)
        sum+=j;
    }
    if(sum==i)
      cout<<sum<<" ";
  }
}