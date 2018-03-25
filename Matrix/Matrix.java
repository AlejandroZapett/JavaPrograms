public class Matrix{
	private String [][] matrix = new String[25][100];
	private int Aux;
	//constructor
	public Matrix(){
		for(int i=0; i<25; i++){
			for(int j=0; j<100; j++)
				matrix[i][j] = " ";
		}
	}
	//setter
	public void setMatrix(){
		for(int i=0; i<(int)(Math.random()*100); i++){
			Aux = (int)(Math.random()*100);
			if(matrix[1][Aux] == " " || matrix[1][Aux] == "$")
				matrix[0][Aux] = "*";
		}
		for(int j=0; j<100; j++){
			if(matrix[1][j]=="*")
				matrix[0][j]="@";
			else if(matrix[1][j]=="@")
				matrix[0][j]="K";
			else if(matrix[1][j]=="K")
				matrix[0][j]="$";
		}
		recorrer();
	}
	//getter
	public void getMatrix(){
		setMatrix();
		for(int i=0; i<25; i++){
			for(int j=0; j<100; j++)
				System.out.print(matrix[i][j]);
			System.out.println();
		}
	}
	//otros metodos
	public void recorrer(){
		for(int i=24; i>0; i--){
			for(int j=0; j<100; j++)
				matrix[i][j]= matrix[i-1][j];
		}
		for(int k=0; k<100; k++)
			matrix[0][k]=" ";
	}
}