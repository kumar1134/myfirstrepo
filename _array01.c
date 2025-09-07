#include <stdio.h>
void main();
{
  int a[10];

  printf("enter the values: ");
  for (i = 0; i < 10; i++)
  {
    scanf("%d", &a[i]);
  }
  for (i = 0; i < 10; i++)
  {
    printf("the values index %d at %d");
  }
}