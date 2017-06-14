grammar Test;
@header {
    package org.acme.test;
}
@lexer::header {
    package org.acme.test;
}

list    :   item (item)*
        ;

item    :
    ID
    | INT
    ;

ID  :   ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

INT :   '0'..'9'+
    ;