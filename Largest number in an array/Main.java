#include <stdio.h>

int main()
{
int z,i,ar[100],big,t;
    //printf("enter the array size\n");
    scanf("%d",&z);
   // printf("enter the array elements\n");
    for(i=0;i<z;i++)
    {
        scanf("%d",&ar[i]);
        
    }
t=ar[0];
    for(i=0;i<z;i++)
    {
        if(ar[i]>t)
        {
        
         t=ar[i];
        }
         }
   printf("%d",t);

    return 0;
}