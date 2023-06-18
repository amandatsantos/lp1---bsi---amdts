main = do
 putStrLn "Digite o primeiro valor"
 num <- readLn
 let resultado | mod num 2 == 0 = num + 5
 | mod num 2 == 1 = num + 8
 putStrLn ("resultado da operação:")
 putStrLn (show(resultado))
