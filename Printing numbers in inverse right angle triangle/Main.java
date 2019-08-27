#include <stdio.h>
int main() {
    int n,i,j,v;
	scanf("%d", &n);
  v=n;
	for(i=1;i<=n;i++)
    {
	  for(j=v;j>=1;j--)
      {
	        printf("%d",j);
	    }
      v--;
	     printf("\n");
	}
	return 0;
}