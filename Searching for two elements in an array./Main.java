#include<stdio.h>
int main()
{
       int z,i,ar[100],match,m1,f=0,g=0,s,t;
   // printf("enter the array size\n");
    scanf("%d",&z);
  //  printf("enter the array elements\n");
    for(i=0;i<z;i++)
    {
        scanf("%d",&ar[i]);
        
    }
    //printf("enter the 1st element to be searched\n");
    scanf("%d",&match);
    //printf("enter the2nd element to be searched\n");
    scanf("%d",&m1);
    for(i=0;i<z;i++)
    {
        if(ar[i]==match)
        {
        t=i;
        f=1;
        break;
        }
    }
    for(i=0;i<z;i++)
    {
        if(ar[i]==m1)
        {
        s=i;
        g=1;
        break;
        }
    }
    if(f==1)
        printf("%d\n",t);
    else
        printf("-1");
    if(g==1)
        printf("%d\n",s);
    else
        printf("-1");
  return 0;
}