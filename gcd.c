//Write a recursive function gcd that accepts two positive non-zero integer parameters i and j and returns the greatest common divisor of these numbers.
****************************************************************************************
int gcd(int i, int j)
{
  if(j!=0)
    return gcd(j, i%j);
  else
    return i;
}