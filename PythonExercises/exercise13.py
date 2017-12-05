import re
with open('emails.txt') as file:
	read = file.read()
	match = re.findall(r'[a-zA-Z0-9._"@%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]+', read)
	for i in match:
		print(i)
file.closed