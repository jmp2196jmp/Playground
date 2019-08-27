#include <stdio.h>
int power(int,int );
int main()
{
  int e,b,a;
 // printf("enter base and exponent\n");
  scanf("%d %d",&b,&e);
  a=power(e,b);
  printf("%d",a);
  return 0;
}
int power(int n1,int n2)
{
    int i,pr=1;
    for(i=1;i<=n1;i++)
    {
       pr=pr*n2;
       
    }
    return pr;
}