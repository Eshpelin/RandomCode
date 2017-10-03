""
Can be used in any unsorted array: has O(n+1) time complexity
    
"""
def search(arr, n, x): # search in unsorted array in O(n+1)
	i = len(arr) - 1

	while(i*arr[i] != x*i): # n comparisons
		i = i - 1

	if arr[i] == x: # one more comparison
		return "Index -> " + str(i)
	else:
		return "Not found"
	
# script starts to execute from here

try:
	n = int(input("Number of elements: "))

	arr = []
	for i in range(n):
		arr.append(int(input("{} -> ".format(i))))

	print(arr)
	x = int(input("number to find: "))

	res = search(arr, n, x)
	print(res)
except ValueError as e:
	print("numbers only")