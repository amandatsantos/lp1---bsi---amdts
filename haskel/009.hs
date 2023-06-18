main::IO()
mdc::Double->String->Double
mdc altura sexo | sexo == "M" = ((72.7 * altura) - 58)
 | sexo == "F" = ((62.1 * altura) - 44.7)
main = do
 putStrLn("Digite sua altura: ")
 altura <- readLn
 putStrLn("Digite seu sexo (M - Masculino e F - Feminino)")
 sexo <- getLine
 putStrLn("O peso ideal e " ++show(mdc altura sexo))