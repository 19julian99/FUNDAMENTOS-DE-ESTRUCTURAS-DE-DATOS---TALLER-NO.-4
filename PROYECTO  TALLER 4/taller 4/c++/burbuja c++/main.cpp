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
    int matriz[m];
    /*
    A For structure is added to store each number entered in the array
    */
    for(int i=0;i<m;i++){
               cout<<"ingrese el numero para la matriz:  ";
            int numa;
            cin>>numa;
            matriz[i]=numa;
            
    }

    /*
    a Boolean type variable is created that in the main for is entered 
    as false then in another cycle for a conditional is created that raises
    that if the array in the index n is greater than the array in the index n 
    if that is fulfilled it uses the variable swap so that it serves as an auxiliary 
    and can change the positions of the array
    */
    bool swapped;
    int swap;
    for(int i=0;i<m;i++){
        swapped=false;
    for(int j=0;j<m;j++){
       if (matriz[j]>matriz[j+1]){
          swap=matriz[j];
          matriz[j]=matriz[j+1];
          matriz[j+1]=swap;
          swapped=true;
       }
            
    }
    if(swapped=false){
    break;
         }
}
/*we use a For cycle to print the matriz
*/
    for(int i=0;i<m;i++){
            cout<<"[";
            cout<<matriz[i];
            cout<<"]";
}
    
    system("PAUSE");
    return EXIT_SUCCESS;
}
