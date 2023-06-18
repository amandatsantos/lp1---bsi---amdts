main :: IO()
main = do
 putStrLn("Digite seu nome ")
 nome<- getLine

 putStrLn("Digite seu sexo (M - Masculino e F - Feminino)")
 sexo <- getLine
 putStrLn("Digite seu estado civil (solteira | casada)")
 civil <- getLine
 if sexo == "F" && civil == "casada" then do
 putStrLn("Digite o tempo de casada")
 tempo<-getLine
 putStrLn(nome ++ " você é casada a " ++ tempo ++ " anos")
 else do
 putStrLn(nome ++ " você é do sexo " ++ sexo ++ " e é " ++ civil)
