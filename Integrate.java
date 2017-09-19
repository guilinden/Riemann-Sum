public abstract class Integrate
{
  public static double middleSum (Function f, double a, double b, int n)
  {
	  double deltaX = (b-a) / n;
	  double x = a + (deltaX/2);
	  double sum = 0.0;
	  
	  int i;
	  for(i=0;i<n;i++) {
		  sum = sum + f.f(x);
		  x = x + deltaX;
	  }
	  return sum*deltaX;
	  
  }
  
  public static double leftSum (Function f, double a, double b, int n) {
	  double deltaX = (b-a) / n;
	  double x = f.f(0);
	  double sum = 0.0;
	  double originalDeltaX = deltaX;
	  int i;
	  
	  for(i=0;i<n;i++) {
		  sum = sum + x;
		  deltaX = deltaX + originalDeltaX;
		  x = f.f(deltaX);		  
	  }
	  
	  return sum*originalDeltaX;
  }
  
  public static double rigthSum(Function f, double a, double b, int n) {
	  int i;
	  double deltaX = (b-a) / n;
	  double x = a + deltaX;
	  double sum = 0.0;
	  
	  for(i=0;i<n;i++) {
		  sum = sum + f.f(x);
		  x = x + deltaX;
	  }
	  
	  
	  return sum*deltaX;
  }
}
