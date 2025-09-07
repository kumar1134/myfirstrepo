#include <stdio.h>
int main()
{
  char name[10];
  int usn;
  float total, m1, m2, m3;
  printf("enter the student name");
  scanf("%s", name);
  printf("enter the studdent usn ");
  scanf("%d", &usn);
  printf("enter the student marks1");
  scanf("%f", &m1);
  printf("enter the student marks2");
  scanf("%f", &m2);
  printf("enter the student marks3");
  scanf("%f", &m3);
  total = m1 + m2 + m3;
  printf("student details\n");
  printf("name:%s\n", name);
  printf("usn:%d", usn);
  printf("tatal marks=%f", total);
  return 0;
}