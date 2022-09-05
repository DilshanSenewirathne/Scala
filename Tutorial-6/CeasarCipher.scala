object CeasarCipher extends App{

	val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

	val shift = (scala.io.StdIn.readLine("Shift By: ").toInt + alphabet.size) % alphabet.size

	val inputText = scala.io.StdIn.readLine("Enter your message: ")

	val outputText = inputText.map( (c: Char) => { 

		val x = alphabet.indexOf(c.toUpper)

		if (x == -1){
			c
		}
		else{
			alphabet((x + shift) % alphabet.size)
		} 
	});

	printf("\nOutput message: %s",outputText);
}