# multiThreading 2.0

> Output1: Hello Hello Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hello Hello Hello Hello Hello Hello Hello Hello

> Output2: Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello

> Output3: Hi Hi Hi Hi Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hi Hi Hi Hi Hi Hi

# Descrizione 

**Come si può notare nella precedente sequenza di Output, essi non sono tutti uguali, poichè il pogramma viene suddiviso in thread, sottoprocessi, che vengono eseguiti concorrentemente, dunque l'ordine degli output può variare a seconda della proprità di esecuzione.**

>***Nota Bene:*** Le versioni di multiThreading sono due [multiThreading1.0](https://github.com/claudio-capu/multiThreading1.0/) e [multiThreading2.0](https://github.com/claudio-capu/multiThreading2.0/)

- Le differenze sono:
  - La versione [multiThreading1.0](https://github.com/claudio-capu/multiThreading1.0/) utilizza due classi differenti per creare due oggetti che diano in output "Hi" e "Hello".
  - La versione [multiThreading2.0](https://github.com/claudio-capu/multiThreading2.0/) utilizza una singola classe per dare in output CIAO e ciao, questo viene fatto attraverso l'istanziamento di due oggetti appartenenti alla stessa classe (Classe Say), ma con due assegnamenti differenti per l'attributo della classe.

# Che cos'è un Thread?

>Un thread è una suddivisione di un processo in due o più sottoprocessi che vengono eseguiti concorrentemente da un sistema di elaborazione multithreading.

