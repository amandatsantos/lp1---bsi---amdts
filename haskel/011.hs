vista :: Double->String->Double
vista valor formaPagam | formaPagam == "d" || formaPagam == "h" = valor - (valor * 10/100)
 | formaPagam == "c" = valor - (valor * 15/100)
 |otherwise = -1.0
prazo :: Double -> Int -> Double
prazo valor quant | quant >= 1 && quant <= 2 = valor
 | quant > 2 = valor + (valor * 10/100)
main :: IO()
main = do
 putStrLn("Digite o valor: ")
 valor <- readLn
 putStrln("Escolha a forma de pagamento: a vista ou a prazo (A vista - v | A prazo - p)")
 comoPagam <- getLine
 if comoPagam == "v"
 then do
 putStrLn("Digite a forma de pagamento (Dinheiro - d | Cheque - q | Cartao - c)")
 formaPagam <- getLine
 putStrLn("O valor final e "++show(vista valor formaPagam))
 else if comoPagam == "p"
 then do
 putStrLn("Digite a quantidade de parcelas: ")
 quant <- readLn

 let valorFinal = prazo valor quant
 putStrLn("O valor final sera " ++ show(prazo valor quant) ++ " dividido em " ++ show
(quant) ++ " parcelas")