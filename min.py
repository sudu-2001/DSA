array=[]

n=int(input("Enter the range of an array: "))

for i in range(n):

	value=int(input(f"Enter the value for {i+1} position: "))

	array.append(value)

minvalu=array[0]

for i in array:

	if i<minvalu:

		minvalu=i

print("The elements od an array are: ",array)

print("The minimum value of an array is: ",minvalu)
