main:: IO()
valores:: Float -> Float -> Float -> String
valores2:: Float -> Float -> Float -> Float
valores2 a b c = (a + b)
valores a b c = if (a+ b) < c then "Maior" else "Menor"
main = do
 putStrLn ("Informe o valor de A ")
 a<-readLn
 putStrLn ("Informe o valor de B ")
 b<-readLn
 putStrLn ("Informe o valor de C ")
 c<-readLn
 putStrLn("O resultado da soma foi: "++show(valores2 a b c) ++ "\nO valor de C e
"++show(valores a b c))