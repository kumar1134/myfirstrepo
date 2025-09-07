#include<stdio.h>
int main()
{
  int a[2][3],sum=0,i,j;
  printf("enter elements of matrix\n");
  for(i=0;i<2;i++);
  {
    for(j=0;j<3;j++);{
      printf("%d\n",&a[i][j]);
      sum=sum+a[i][j];   
       }
      printf("\n");
  }
  return 0;
}