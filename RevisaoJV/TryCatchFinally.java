// Questão 20

/*

try {
    System.out.println("try");
    throw new Exception();
} catch (Exception e) {
    System.out.println("catch");
} finally {
    System.out.println("finally");
}

*/

/*
Aparecerá primeiramente, dentro do bloco try, a mensagem "try".
Mas logo foi lançada uma exeção com o bloco catch, e então será exibido a mensagem "catch".
E por último o bloco finally, que sempre será executado, independente se houve exeção ou não,
ele exibirá a mensagem "finally".
Ou seja, aparecerá:
"try
catch
finally"
*/