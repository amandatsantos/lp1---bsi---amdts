-- aliquota - 7,5%
-- aliquota - 9%
-- aliquota - 12%
-- aliquota -14%
-- teto máximo para desconto
teto = 7087.22
-- Calcula o valor do desconto de INSS
inss salario
 | salario <= 0 = 0
 | salario <= 1212.00 = salario * 0.075
 | salario <= 2427.35 = salario * 0.09
 | salario <= 3641.03 = salario * 0.12
 | salario <= teto = salario * 0.14
 | otherwise = 0
-- Calcula o salário líquido
salarioLiquido salario = salario - inss salario
-- Pede o nome e o salário do funcionário, e exibe o resultado
main = do
 putStrLn "Digite o nome do funcionário:"
 nome <- getLine
 putStrLn "Digite o salário bruto do funcionário:"
 salarioBruto <- readLn
 let salario = salarioLiquido salarioBruto
 desconto = inss salarioBruto
 putStrLn $ "Nome: " ++ nome
 putStrLn $ "Salário bruto: R$ " ++ show salarioBruto
 putStrLn $ "Desconto de INSS: R$ " ++ show desconto
 putStrLn $ "Salário líquido: R$ " ++ show salario