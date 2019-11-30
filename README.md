# provaThread

## Teoria:
Un thread è un processo che viene eseguito in maniera indipendente dal resto resto del programma.
Il multithreading è usato per occupare meno spazio in memoria e rendere più veloce l'esecuzione del programma.

## Esercizio1:  
In questo esercizio vengono create 2 classi, la classe HELLO e la classe HI, successivamente ad ogni classe si assegna un therad.
Successivamente viene scritto il codice delle classi che si occupano si stampare a schermo per 10 volte hello ed hi.

## Conclusioni:
La stampa avviene in maniera casuale poiché si creano due diversi thread,
dove ognuno viene eseguito in modo indipendente in base al protocollo di esecuzione dei processi,
che viene determinato dal sistema operativo. Ed è per questo motivo che le stringhe sono stampate in ordine casuale.
