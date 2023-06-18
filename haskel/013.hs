main::IO()
idade::Int->String
idade id1 | id1 >= 16 = " você é eleitor, pode votar"
 | otherwise = " você não pode votar, pois é menor de idade"
main = do
 putStrLn ("Informe a sua idade ")
 id1<-readLn
 putStrLn("A sua idade é "++show(id1)++" anos"++" e"++(idade id1));