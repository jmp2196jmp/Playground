// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include<stdio.h>
void rotate(int z,int ar[],int rot);
int main()
{
    int s,i,ar[25],r;
   // printf("enter array size\n");
    scanf("%d",&s);
   // printf("enter the array elements\n");
    for(i=0;i<s;i++)
    {
        scanf("%d",&ar[i]);
    }
    //printf("enter no. of rotations\n");
    scanf("%d",&r);
    rotate(s,ar,r);
    }
void rotate(int z,int ar[],int rot)
{
    int i,j;
    int odd_temp,even_temp,odd_temp_idx,even_temp_idx;
     odd_temp_idx = (z%2 == 0)? z-2:z-1;
     even_temp_idx =(z%2 == 0)? z-1: z-2 ;
     	

    
    
    for( i = 0 ; i < rot ; i++)
    {
        
    
        odd_temp = ar[odd_temp_idx];
        for( j = odd_temp_idx; j >= 0 ; j=j-2)
        {
            
            ar[j]=ar[j-2];
        }
        
        ar[0] = odd_temp;
        
    
        
        even_temp = ar[1];
        
        for( j = 1; j < z ; j = j+2)
        {
            
            ar[j] = ar[j+2]; 
        }
        
        ar[even_temp_idx] = even_temp;
        
    }
    
    for( i = 0 ; i <z ; i++ )
    {
        printf( "%d ", ar[i]);
    }
  
 }

