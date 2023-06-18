main::IO()
valor::Int->Int
valor a | a > 0 = a*a
 | a < 0 = a*a*a
main = do
 putStrLn("Digite um numero: ")
 a<-readLn
 putStrLn("O resultado e "++show(valor a))