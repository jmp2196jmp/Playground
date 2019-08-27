#include<stdio.h>
int main()
{
int i,j,r,c;
  scanf("%d %d",&r,&c);
  int m[r][c],sum[r][c],n[r][c];
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      scanf("%d",&m[i][j]);
    }
  }
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      scanf("%d",&n[i][j]);
    }
  }
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
  sum[i][j]=m[i][j]-n[i][j];
    }
  }
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      printf("%d ",sum[i][j]);
    }
    printf("\n");
  }
return 0;
}

