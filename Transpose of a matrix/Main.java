#include<stdio.h>
int main()
{
int i,j,r,c;
  scanf("%d %d",&r,&c);
  int m[r][c],n[c][r];
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      scanf("%d",&m[i][j]);
    }
  }
 /* for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      scanf("%d",&n[i][j]);
    }
  }*/
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
  n[j][i]=m[i][j];
    }
  }
  for(i=0;i<c;i++)
  {
    for(j=0;j<r;j++)
    {
      printf("%d ",n[i][j]);
    }
    printf("\n");
  }
return 0;
}
