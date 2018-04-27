L'esempio è composto da due classi java, Studente.java e mybatisRead_ALL.java
oltre a due file di configurazione configuration.xml e dao.xml.

al seguente link https://www.tutorialspoint.com/mybatis/index.htm è riportato lo stesso esempio
con la differenza che qui il db è oracle istallato su una macchina virtuale.

relativamente ai file che compogono l'esempio:
1.Studente.java è un semplice POJO.
2.mybatisRead_ALL.java, in questa classe con l oggetto session si stabilisce una connessione al db e
tremite il metodo selectList si invoca la query da eseguire sul database; Il metodo accetta come parametro 
una stringa che è un tag nel file dao.xml, che specifica la query da eseguire e l'oggetto che conterrà il resultset della 
query;

nel file configuration.xml sono specificati i arametri di connessione al db, nonchè il driver da usare per la connessione
oracle.jdbc.OracleDriver questo libreria deve essere riportata nel classpath; è stata aggiunta come dipendenza nel pom

