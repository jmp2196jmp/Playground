#include <stdio.h>
int main()
{
     int i, count=0,size,arr[20];
   scanf("%d",&size);
       for(i = 0; i<= size - 1; i++)
       {
           scanf("%d",&arr[i]);
       }
   for(i = 0; i < size; i++)
   {
       
       if(arr[i] > 0)
       {
         arr[count++] = arr[i];
       }
       
   }
    while(count < size)
    {
       arr[count++] = 0;
    }
 for(i = 0; i < size; i++)
 {
       printf("%d ",arr[i]);
   } 
   return 0;
}