#include<stdio.h>
int nat(int n);
int main()
{
    int n;
    scanf("%d",&n);
    printf("%d",nat(n));
}
int nat(int n)
{
    if(n==0)
    return 0;
     else
 return n+nat(n-1);
}