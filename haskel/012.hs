main::IO()
ma::Float->Float->Float
ma n1 n2 n3 = (n1 + (n2 * 2) + (n3 * 3)/7)
numId:: Float->Float->Char
numId ma |ma >= 90 = "A"
 |(ma >= 75) && (ma < 90) = "B"
 |(ma >= 60) && (ma < 75) = "C"
 |(ma >= 40) && (ma < 60) = "D"
 |ma < 4 = "E"

main = do
 putStrLn("Digite a primeira nota: ")
 n1<-readLn
 putStrLn("Digite a segunda nota: ")
 n2<-readLn
 putStrLn("Digite a terceira nota: ")
 n3<-readLn
 putStrLn("Digite a media: ")
 me<-readLn

 putStrLn("A media de aproveitamento foi "++show(ma n1 n2 n3) ++ "\nA nota foi
"++show(numId ma))