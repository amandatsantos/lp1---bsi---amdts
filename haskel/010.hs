main::IO()
imc::Float->Float->Float->String
imc peso altura = peso/(altura*altura)
imc peso altura | imc < 18.5 = "Abaixo do peso"
 | imc >= 18.5 && imc <= 25 = "Peso Normal"
 | imc >= 25 && imc <= 30 = "Acima do peso"
 | imc > 30 = "Obeso"
main = do
 putStrLn("Digite sseu peso: ")
 peso<-readLn
 putStrLn("Digite sua altura: ")
 altura<-readLn
 putStrLn("O resultado e "++show(imc peso altura))