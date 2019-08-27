// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include<stdio.h>

void index(int list[],int z);


int main() {
   int z,list[10],i;
   scanf("%d",&z);
   for( i = 0; i < z ; i++)
   {
       scanf("%d",&list[i]);
   }
  
   index(list,z);
  
   return 0;  
}

 index(int list[],int z)
 {
     int i,large ,max;
     large = list[0];
     max = 0 ;
     for( i = 1; i < z ; i++)
   { 
       if(large < list [i])
       {
           max = i;
           
       }
      
   }  
   printf("%d",max);
 }