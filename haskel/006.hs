main::IO()
valor:: Bool->Bool->String
valor a b | a==b = "Verdadeiro"
 | a/=b = "Falso"
main = do
 putStrLn("valor a ")
 a<-readLn
 putStrLn("valor b ")
 b<-readLn
 putStrLn("O resultado foi "++show(valor a b))