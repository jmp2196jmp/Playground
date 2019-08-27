#include <stdio.h>
int gft(int n1,int n2);
int main()
{
int a,b,n3,g;
scanf("%d %d %d",&a,&b,&n3);
g=gft(a,b);
if(g>n3)
printf("%d",g);
else
printf("%d",n3);
    return 0;
}
int gft(int n1,int n2)
{
int t;
if(n1>n2)
{
t=n1;
return t;
}
else
{
t=n2;
return t;
}
}
