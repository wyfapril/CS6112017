def print_list(list):
	for i in list:
		print(i)

def print_reversed_list(list):
	for i in reversed(list):
		print(i)

def len(list):
	count = 0
	for i in list:
		count += 1
	return count