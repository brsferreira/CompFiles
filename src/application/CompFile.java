package application;

import java.io.FileInputStream;
import java.io.IOException;

/*
Tente Isto 10-1
Compara dois arquivos.
Para usar este programa, especifique os nomes dos
arquivos a serem comparados na linha de comando.
*/

public final class CompFile {

	public static void main(String[] args) {

		try (FileInputStream f1 = new FileInputStream("..\\CompFiles\\src\\application\\file01.txt");
				FileInputStream f2 = new FileInputStream("..\\CompFiles\\src\\application\\file02.txt")) {
			int j;
			int i;

			// verificar o conteudo de cada arquivo
			do {
				i = f1.read();
				j = f2.read();
				if (i != j)
					break;
			} while (i != -1 && j != -1);

			if (i != j)
				System.out.println("Os arquivos são diferentes.");
			else
				System.out.println("Os arquivos são identicos!");

		} catch (IOException e) {
			System.out.println("ERROR I/O: " + e.getMessage());
		}

	}// main
}// class
