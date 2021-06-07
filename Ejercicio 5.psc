Algoritmo mayores_menores_edades
	
	Definir n, mayores, menores, edades como Entero
	
	Escribir "Ingrese la cantidad de edades"
	leer n
	
	Para i=1 Hasta n Con Paso 1 Hacer
		edades=Aleatorio(0,50)
		Escribir edades
		
		Si edades >= 18 Entonces
			mayores= mayores+1
		SiNo
			menores = menores+1
		Fin Si
		
	Fin Para
	
	Escribir "Mujeres Mayores son " mayores
	Escribir "Hombres Menores son " menores
	
FinAlgoritmo