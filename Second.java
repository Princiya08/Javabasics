class Second
{
  public static void main(String args[])
  {
   int a=10,b=7,c=16,d=20;
   if((a>b) && (a>c)&& (a>d))
   {
   if((b<a) && (b>c)&& (b>d))
	{
	System.out.print(b);
	}
	if((c<a) && (c>b)&& (c>d))
	{
	  System.out.print(c);
	}
	if ((d<a) && (d>b)&& (d>c))
	{
		System.out.print(d);
   } }
   else if((b>a) && (b>c)&& (b>d))
   {
   if((a<b) && (a>c)&& (a>d))
	{
	System.out.print(a);
	}
	if((c<b) && (c>a)&& (c>d))
	{
	  System.out.print(c);
	}
	else if ((b>a) && (b>c)&& (b>d))
	{
     if((a<b) && (a>c) && (a>d))		
	{
		System.out.print(a);
	}
	if((c<b) && (c>a) && (c>d))
	{
		System.out.print(c);
	}	
	if((d<b) && (d>a) && (d>c))
	{
		System.out.print(d);
	}	
	}
	else if((c>a) && (c>b) && (c>d))
	{
    if((a<c) && (a>b) && (a>d))
    {
		System.out.print(a);
	}
    if((b<c) && (b>a) && (b>d))
    {
		System.out.print(b);
	}
    if((d<c) && (d>a) && (d>b))
    {
		System.out.print(d);
	}
    }
	else if((d>a) && (d>b) && (d>c))
	{
     if((a<d) && (a>b) && (a>c))
    {
		System.out.print(a);
	}
    if((b<d) && (b>c) && (b>d))
    {
		System.out.print(b);
	}		
	if((c<d) && (c>a) && (c>b))
	{
		System.out.print(c);
	}	
	}
   }
  }
}  