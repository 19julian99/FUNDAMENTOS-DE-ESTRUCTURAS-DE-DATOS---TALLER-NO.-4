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
    int index;
    
    /*
    A For structure is added to store each number entered in the array
    */
    for(int i=0;i<m;i++){
               cout<<"ingrese el numero para el vector uno por uno:  ";
            int numa;
            cin>>numa;
            array[i]=numa;
    }
   /*
   in this part you are asked to enter the number to search
   */
   cout<<"ingrese el numero a buscar:  ";
   int value;
   cin>>value;
   
   /*
   then in a For cycle with the size of the areglo and a single condition 
   is used that says that if the array in the position i is equal to the value 
   entered then the variable index takes the value of the variable I and ready
   */
    
    for(int i=0;i<m;i++){
              if(array[i]==value){
                   index=i;
                   break;
              }
    }
    
    cout<<"el indice del numero deseado es :"; cout<<index;cout<<"\n";
    
    
    
    system("PAUSE");
    return EXIT_SUCCESS;
}
