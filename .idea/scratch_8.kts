import javax.swing.JOptionPane

var aleatorio = (1..5).random()
var input= JOptionPane.showInputDialog("Adivina un numero del 1 al 5").toInt()

while (input!=aleatorio){
    input=JOptionPane.showInputDialog("Ese no es el numero que tengo, intenta de nuevo").toInt()
    if (input==0){
        break
}
    aleatorio = (1..5).random() //aca se repite el numero
}
if (input==0){
    println("El numero que estaba pensando era = ${aleatorio}")
}else{
    println("Bien, el numero era = ${aleatorio}")
}

