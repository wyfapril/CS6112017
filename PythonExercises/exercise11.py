def iter_product(list):
	product = 1
	for i in range(0,len(list)):
		product = product*list[i]
		i += 1
	return product

def rec_product(list):
	if len(list)==1:
		return list[0]
	return rec_product([list[0]])*rec_product(list[1:])