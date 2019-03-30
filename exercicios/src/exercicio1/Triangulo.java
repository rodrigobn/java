package exercicio1;

public class Triangulo {
	float base;
	float atura;
	float area;
	float perimetro;
	
	public Triangulo(float base, float altura) {
		this.base = base;
		this.atura = altura;
		this.area = (base*altura) / 2;
		this.perimetro = base * 3;
	}
	
	public Triangulo(float base) {
		this.perimetro = base * 3;
	}

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getAtura() {
		return atura;
	}

	public void setAtura(float atura) {
		this.atura = atura;
	}

	public float getArea() {
		return area;
	}

	public void setArea(float base, float altura) {
		this.area = (base*altura) / 2;
	}

	public float getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(float base) {
		this.perimetro = base * 3;
	}
	
	
}
