# Paswoord

- schrijf het volgende programma: 
    - definieer enkele gebruikersnamen met bijbehorende paswoorden
    - vraag om een gebruikersnaam in te voeren
    - vraag om een wachtwoord in te voeren
    - controleer of de juiste gebruikersnaam, wachtwoord en combinatie van die 2 ingevoerd zijn
    - is dit goed, toon een melding en beeindig programma
    - is dit niet goed, toon een melding en herhaal het proces totdat het goed gaat
    
- extra
    - wacht na 3 pogingen 1 minuut alvorens opnieuw om een gebruikersnaam/wachtwoord te vragen
    
- voorbeeldoutput:

```shell script
Voer je gebruikersnaam in:
Alexx

Onbekende gebruikersnaam!

Voer je gebruikersnaam in:
Alex

Voer je paswoord in:
hallo
Verkeerd wachtwoord!

Voer paswoord in:
geheim

Je bent ingelogd.

```         

- geavanceerd:
    - het is mogelijk om de invoer van het paswoord te verbergen. Gebruik hiervoor readPassword() van java.io.Console. *Let op:* Als je dit in IntelliJ runt, krijg je een NullPointerException. Dit is dan ook alleen te runnen vanuit de command line buiten IntelliJ om. Zie ook: https://stackoverflow.com/questions/34555185/system-console-nullpointerexception
    ```java
      var c = System.console();
      var pw = c.readPassword();      
    ```