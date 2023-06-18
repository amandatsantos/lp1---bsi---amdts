main::IO()
num::Int->Int->Int
num a b = if (a==b) then (a+b) else (a*b)
main = do
 putStrLn("Digite o valor de a ")
 a<-readLn
 putStrLn("Digite o valor de b ")
 b<-readLn
 putStrLn("O resultado foi "++show(num a b))