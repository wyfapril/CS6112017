import numpy as np
import matplotlib.pyplot as plt
fig, ax_lst = plt.subplots(1, 1)  
x = np.linspace(0, 2, 100)
y = np.square(np.sin(x-2))*np.exp(-1*np.square(x))
plt.plot(x, y, label='f(x)')
plt.xlabel('x-axis')
plt.ylabel('y-axis')
plt.title('Exercise 10')
plt.legend()
plt.show()