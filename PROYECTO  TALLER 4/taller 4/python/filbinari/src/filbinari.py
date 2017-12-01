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
    array = []
    
    """in this part the number to be searched is requested by console"""
   
    print("elija el numero a buscar")
    x=input()
    for i in range(len(vla)):
        array.append(int(vla[i]))
    
    'this function searches for the users number'
    def binarysearch(array, x):
        """for this method the lowerBound is set and the upperBound creates an 
        index variable and other call MiddlePoint.
        
        in a while structure the last one is compared with the first one and 
        inside of it the number is searched by comparing the desired number 
        with the positions of the vector
        
        
        parameters:
        array--unsorted array
        x--usuario´s number
        
        exceptions:
        Principal (lowerBound < upperBound)
        
        
        """
        lowerBound = 0
        upperBound = len(array)-1
        index = 1
        middlePoint = 0
        
        while lowerBound < upperBound:
            middlePoint = (lowerBound + upperBound) / 2
            if x == Array[middlePoint]:
                index = middlePoint
                break
            else:
                if x < Array[middlePoint]:
                    upperBound = middlePoint-1
                else:
                    lowerBound = middlePoint + 1
            if lowerBound == upperBound and array[lowerBound] == x:
                index = lowerBound
        return index

