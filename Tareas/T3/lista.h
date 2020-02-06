#ifndef LISTA_H
#define LISTA_H

#endif 

#include <iostream>

using namespace std;

class nodo{
	
	public:
		int id;
		string nombre;
		nodo* sig;
		
		nodo(){
			
		}
		
		nodo(int iden, string name){
			id  = iden;
			nombre = name;
			sig;
		}
};


class lista{
	
	nodo* inicio = new nodo();
	nodo* end1 = new nodo();
	nodo* aux = new nodo();
	int tam = 0;
	
	public:
		
		lista(){
			end1;
			inicio;
		}
		
		
		void nuevo (int iden, string name){
			
			nodo* nuevo = new nodo(iden, name);
			if (tam == 0){
				
				inicio = nuevo;
				end1 = nuevo;
				aux = nuevo;
				tam++;
				
			}else{
				
			aux->sig = nuevo;
			end1 = nuevo;
			aux = nuevo;
			tam++;
			
			}
			
		}
		
		
		void mostrar(){
			
			nodo* auxx = inicio;
			int cuantos = 0;
			
			do{
				
				cout << auxx->nombre << endl;
				cout << auxx->id << endl;
				cout << "------------------" << endl;
				auxx = auxx->sig;
				cuantos++;
				
			}while (cuantos < tam);
			
		}
		
		nodo* buscar(int buscado){

			nodo* buscas = inicio;
			int cuantos = 0;
			bool encontrado;
			
			do{
				
				if (buscas->id == buscado){
					
					encontrado = true;
					cout << "Considencia: ";
					cout << buscas->nombre << endl;
					return buscas;
					cuantos = tam;
					
				}else{
					
					buscas = buscas->sig;
					cuantos++;
				}
				
			}while (cuantos < tam);
			
			if(encontrado == false){
				cout << "no se encotro ningun usuario" << endl;
				return buscas;
			}
			
		}
		
		
		void eliminar(int buscado){
			
			nodo* buscas = inicio;
			int cuantos = 0;
			bool encontrado;
			
			do{
				
				if (buscas->id == buscado){
					
					encontrado = true;
					buscas->sig = NULL;
					
					cuantos = tam;
					
				}else{
					
					buscas = buscas->sig;
					cuantos++;
				}
				
			}while (cuantos < tam);
			
			if(encontrado == false){
				cout << "no se encotro ningun usuario con ese carnet para eliminar" << endl;
			}
			
		}

		
};











