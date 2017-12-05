# 6(a)
import math
def is_prime_a(n):
    if n<2:
    	return False
    for i in range(2,int(math.sqrt(n))+1): # trail division 
    	if n%i==0:
    		return False
    return True

# 6(b)
def is_prime_b(n):
	if n<2:
		return False
	if n==2 or n==3:
		return True
	if n>3:
		for k in range(1,n):
			if (n==6*k-1 or n==6*k+1):
				return True
		return False

# 6(c)
def all_primes(n):
	for k in range(0, n+1):
		if is_prime(k):
			print(k)	

# 6(d)
def first_n_primes(n):
	count=0
	num=2
	while count<n:
		if is_prime(num):
			print(num)
			count+=1
		num+=1