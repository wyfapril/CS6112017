a = [0, 1, 2, 3, 4]
b = a
b[1] = 0.1
print('list a: ', a)

c = a[:] 
c[2] = '-2.0'
print('list a: ', a)
print('list c: ', c)

l = [9, 9, 9, 9]
def set_first_elem_to_zero(l):
	l[0] = 0
	return l
print('original list l: ', l)
print('new list l: ', set_first_elem_to_zero(l)) 