                                  +-----------------------------------+
                                  |          SchulungsManager         |
                                  +-----------------------------------+
                                  | -teilnehmer: List<T>              |
                                  | -kurse: List<K>                   |
                                  | -dozenten: List<D>                |
                                  +-----------------------------------+
                                  | +getKursuebersicht(): String      |
                                  | +getTeilnehmer(kurs: K): List<T>  |
                                  | +getDozent(kurs: K): D            |
                                  | +getPersonenInfo(): List<String>  |
                                  +-----------------+-----------------+
                                                    ^
                                                    |
                                                    |
                           +------------------------+------------------------+
                           |                                                 |
                           |                                                 |
                           |                                                 |
+--------------------------+--------------------------+   +------------------+------------------+
|                         Kurs                        |   |               Person                |
+-----------------------------------------------------+   +-------------------------------------+
| - start: Date                                       |   | - name: String                      |
| - ende: Date                                        |   | - adresse: String                   |
| - raum: String                                      |   | - telefon: String                   |
| - thema: String                                     |   | - email: String                     |
| - dozent: Dozent                                    |   +-------------------------------------+
| - teilnehmer: List<Teilnehmer>                      |   | + Person(name: String,              |
+-----------------------------------------------------+   |          adresse: String,           |
| + Kurs(start: Date,                                 |   |          telefon: String,           |
|        ende: Date,                                  |   |          email: String)             |
|        raum: String,                                |   |                                     |
|        thema: String,                               |   | + getName(): String                 |
|        dozent: Dozent)                              |   | + getAdresse(): String              |
|                                                     |   | + getTelefon(): String              |
| + getStart(): Date                                  |   | + getEmail(): String                |
| + getEnde(): Date                                   |   |                                     |
| + getRaum(): String                                 |   | + setName(name: String): void       |
| + getThema(): String                                |   | + setAdresse(adresse: String): void |
| + getDozent(): Dozent                               |   | + setTelefon(telefon: String): void |
| + getTeilnehmerListe(): List<Teilnehmer>            |   | + setEmail(email: String): void     |
|                                                     |   |                                     |
| + setStart(start: Date): void                       |   | + getInfo(): String                 |
| + setEnde(ende: Date): void                         |   +------------------+------------------+
| + setRaum(raum: String): void                       |                      ^
| + setThema(thema: String): void                     |                      |
| + setDozent(dozent: Dozent): void                   |                      |
|                                                     |                      |
| + setTeilnehmer(teilnehmer: List<Teilnehmer>): void |                      |
| + addTeilnehmer(teilnehmer: Teilnehmer): void       |                      |
+-----------------------------------------------------+                      |
                                                                             |
                                      +--------------------------------------+-------------+
                                      |                                                    |
                                      |                                                    |
                                      |                                                    |
               +----------------------+----------------------+      +----------------------+----------------------+
               |                   Dozent                    |      |                 Teilnehmer                  |
               +---------------------------------------------+      +---------------------------------------------+
               | - fachgebiet : String                       |      | - kurse: List<Kurs>                         |
               +---------------------------------------------+      | + Teilnehmer(name: String,                  |
               | + Dozent(name: String,                      |      |        adresse: String,                     |
               |        adresse: String,                     |      |        telefon: String,                     |
               |        telefon: String,                     |      |        email: String,                       |
               |        email: String,                       |      |                                             |
               |        fachgebiet: String)                  |      | + getKurse(): List<Kurs>                    |
               |                                             |      |                                             |
               | + getFachgebiet() : String                  |      | + addKurs(kurs: Kurs): void                 |
               |                                             |      +---------------------------------------------+
               | + setFachgebiet(fachgebiet: String) : void  |
               |                                             |
               | + getInfo() : String                        |
               +---------------------------------------------+
