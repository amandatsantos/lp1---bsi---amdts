
progenitor(pam,bob).
progenitor(tom, bob).
progenitor(tom, liz).
progenitor(bob, ann).
progenitor(bob, pat).
progenitor(pat, jim).
homem(tom).
homem(bob).
homem(jim).
mulher(pam).
mulher(liz).
mulher(ann).
mulher(pat).
/*Regras do filho*/
/*Se X é filho de Y*/
filho(X,Y) :- progenitor(Y,X).
/*Regra da mae*/
/*Se X é mae de Y, pra(:-) X ser mae ela tem q ser filho de Y e tem q ser mulher */
mae(X,Y) :- progenitor(X,Y), mulher(X).
/*Regra avos*/
avos(X,Y) :- progenitor(X,Y), progenitor(Y,X).
/* Para saber se pam é mulher: mulher(pam). Run> True.*/
/* Saber todas as mulheres: mulher(X)*/
/* saber os filhos(as) de bob: progenitor(bob, X).*/
/* Regras para se(:-), e(,), ou(;) = a(X) :- b(X); (c(X), d(X)).*/
/* O A de X vai ser verdadeira se o B de ou o C de X e D forem verdadeiras*/
/* Saber se bob é filho de ann: filho(bob, ann).*/
/* Saber de quem bob é filho: filho(bob, X).*/
/* Saber se tom tem algum filho: filho(_,tom).*/