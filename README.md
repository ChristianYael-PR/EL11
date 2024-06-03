# Ejercicio de Laboratorio 11

## Introducción

El objetivo de este ejercicio es resolver el problema del Ejercicio de Laboratorio 10 utilizando interfaces en lugar de clases abstractas en los lenguajes Python y Java. Este enfoque permite demostrar el uso del polimorfismo y la flexibilidad en el diseño de software, proporcionando una manera clara y estricta de definir los métodos que las clases deben implementar.

## Diseño de la Jerarquía de Clases

1. **Figure (Interfaz)**
   - Métodos:
     - `getColor()`: devuelve el color.
     - `perimetro()`: método para calcular el perímetro.
     - `area()`: método para calcular el área.

2. **Triangle (Implementación de Figure)**
   - Atributos: `base`, `altura`, `lado1`, `lado2`, `lado3`
   - Métodos:
     - `getColor()`: devuelve el color del triángulo.
     - `perimetro()`: calcula el perímetro del triángulo.
     - `area()`: calcula el área del triángulo.

3. **Circle (Implementación de Figure)**
   - Atributo: `radio`
   - Métodos:
     - `getColor()`: devuelve el color del círculo.
     - `perimetro()`: calcula el perímetro del círculo.
     - `area()`: calcula el área del círculo.

4. **Rectangle (Implementación de Figure)**
   - Atributos: `largo`, `ancho`
   - Métodos:
     - `getColor()`: devuelve el color del rectángulo.
     - `perimetro()`: calcula el perímetro del rectángulo.
     - `area()`: calcula el área del rectángulo.

5. **Hexagon (Implementación de Figure)**
   - Atributo: `lado`
   - Métodos:
     - `getColor()`: devuelve el color del hexágono.
     - `perimetro()`: calcula el perímetro del hexágono.
     - `area()`: calcula el área del hexágono.

## Implementación en Python

```python
from abc import ABC, abstractmethod
import math

class Figure(ABC):
    @abstractmethod
    def getColor(self):
        pass

    @abstractmethod
    def perimetro(self):
        pass
    
    @abstractmethod
    def area(self):
        pass

class Triangle(Figure):
    def __init__(self, color, base, altura, lado1, lado2, lado3):
        self.color = color
        self.base = base
        self.altura = altura
        self.lado1 = lado1
        self.lado2 = lado2
        self.lado3 = lado3
    
    def getColor(self):
        return self.color
    
    def perimetro(self):
        return self.lado1 + self.lado2 + self.lado3
    
    def area(self):
        return (self.base * self.altura) / 2

class Circle(Figure):
    def __init__(self, color, radio):
        self.color = color
        self.radio = radio
    
    def getColor(self):
        return self.color
    
    def perimetro(self):
        return 2 * math.pi * self.radio
    
    def area(self):
        return math.pi * self.radio ** 2

class Rectangle(Figure):
    def __init__(self, color, largo, ancho):
        self.color = color
        self.largo = largo
        self.ancho = ancho
    
    def getColor(self):
        return self.color
    
    def perimetro(self):
        return 2 * (self.largo + self.ancho)
    
    def area(self):
        return self.largo * self.ancho

class Hexagon(Figure):
    def __init__(self, color, lado):
        self.color = color
        self.lado = lado
    
    def getColor(self):
        return self.color
    
    def perimetro(self):
        return 6 * self.lado
    
    def area(self):
        return (3 * math.sqrt(3) * (self.lado ** 2)) / 2

# Demostración de polimorfismo
shapes = [
    Triangle("red", 3, 4, 3, 4, 5),
    Circle("blue", 5),
    Rectangle("green", 4, 6),
    Hexagon("yellow", 2)
]

for shape in shapes:
    print(f"Color: {shape.getColor()}, Perimeter: {shape.perimetro()}, Area: {shape.area()}")
