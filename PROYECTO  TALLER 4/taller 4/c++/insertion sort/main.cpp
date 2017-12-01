#include <cstdlib>
#include <iostream>

using namespace std;

int main(int argc, char *argv[])
{
    /*
    In this part a message is displayed on the screen asking for the 
    size of the array which will be passed as part of a variable called 
    matriz
    */
   
    cout << "INGRESE EL TAMAÑO DEL ARRAY";
    int m;
    printf("\n");
    cin >> m;
    printf("\n");
    int array[m];
    /*
    A For structure is added to store each number entered in the array
    */
    for(int i=0;i<m;i++){
            cout<<"ingrese el numero para la matriz:  ";
            int numa;
            cin>>numa;
            array[i]=numa;
    }
    
    /*
    In this method of insertion ordering, a For cycle is used 
    with the size of the array, since this defines the limit to stop.
    within this For a conditional is made whle that says that if the index 
    is less than 0 and elarreglo in the index position minus 1 is greater in x
    it is increased and the index is addedthen x becomes the position of the fix 
    in the index position in case it does not meet the condition
    */
    
    int x;
    int x2=array[0];
    int index;
    
    for(int i=1;i<m;i++){
     x=array[i];
     index=i;
     while(index >0 && array[index-1]>x){
     index=index-1;
     }
     array[index]=x ;           
    
    }    
    array[0]=x2;
    
    /*a for cycle is used to print the ordered array*/
    for(int i=0;i<m;i++){
    cout<<"[";
           cout<<array[i];
           cout<<"]";
              }
        

    
    
    
    system("PAUSE");
    return EXIT_SUCCESS;
}
