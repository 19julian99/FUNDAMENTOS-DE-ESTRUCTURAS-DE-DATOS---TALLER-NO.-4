# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

if __name__ == "__main__":
    """comma-separated numbers are requested and stored in a variable and 
    a library is used and from it the function .split to separate the vector 
    and it is passed to an array by means of a cycle  """
  
    print("ingrese sumeros separados por coma")
    alv=raw_input()
    vla=alv.split(',')
    Array = []
    for i in range(len(vla)):
        Array.append(int(vla[i]))
#    print array
    
    
    'this function order the array'
    def quick_sort(Array):
        """this function is a very fast sorting method that is of 
        divide and conquer methodology, choose a pivot and start comparing 
        the elements of the arrangement, ordering them from highest to lowest 
        each one in arrangements of different sizes
        
        
        parameters: 
        Array--unsorted array
        
        
        Return;
        sorted array
        
        
        
        """
        pivot=0;
        less_subarray = []
        greather_subarray = []
        
        for j in range(len(Array)):
            if Array[j] > Array[j + 1]:
                return Array
        else:
            pivot = Array[0]
            for i in range(1, len(Array)):
                if Array[i] < pivot:
                    less_subarray.append(Array[i])
                else:
                    greather_subarray.append(Array[i])

    return quick_sort(less_subarray) + pivot + quick_sort(greather_subarray)
    'return another function with his parameters'
    orden=quick_sort(Array)
    print(orden)