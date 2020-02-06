#include <iostream>
#include "lista.h"

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

using namespace std;

int main(int argc, char *argv[]) {
	
	cout << "tarea prueba de insertar" << endl;
	
	lista* lis = new lista();
	nodo* eli = new nodo();
	
	lis->nuevo(2016, "Kevin");
	lis->nuevo(2015, "Maria");
	lis->nuevo(2017, "Sophia");
	lis->nuevo(2018, "Rene");
	
	cout << "-------------------" << endl;
	
	lis->mostrar();
	
	lis->buscar(2015);
		cout << "-------------------" << endl;
	
	lis->eliminar(2017);
		cout << "-------------------" << endl;
	
	lis->mostrar();
	
	return 0;
}
