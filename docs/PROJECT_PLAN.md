# Projektplan: Java Checkout System

**Planerad period:** November 2026–februari 2027. Tidsfönstret är ett förslag; flytta det efter faktisk progression.

## Milstolpar

| Etapp | Resultat |
| --- | --- |
| M0 | Grunder och körbar utvecklingsmiljö |
| M1 | Första fungerande flödet |
| M2 | Struktur, robusthet och tester |
| M3 | Dokumenterad och demonstrerbar v1 |

## Uppgifter i ordning

| Issue | Etapp | Uppgift | Branch |
| --- | --- | --- | --- |
| [#1](https://github.com/leoforsell/java-checkout-system/issues/1) | M0 | Starta Java och testmiljö | `chore/java-setup` |
| [#2](https://github.com/leoforsell/java-checkout-system/issues/2) | M1 | Modellera produkter och köp | `feat/sale-model` |
| [#3](https://github.com/leoforsell/java-checkout-system/issues/3) | M1 | Bygg ett komplett konsolflöde | `feat/checkout-cli` |
| [#4](https://github.com/leoforsell/java-checkout-system/issues/4) | M2 | Dela upp ansvar och inför repository | `refactor/layered-design` |
| [#5](https://github.com/leoforsell/java-checkout-system/issues/5) | M2 | Testa felvägar och automatisera tester | `test/checkout-ci` |
| [#6](https://github.com/leoforsell/java-checkout-system/issues/6) | M3 | Dokumentera och demonstrera v1 | `docs/v1-demo` |

Varje issue innehåller ledtråd, beroende och acceptanskriterier. Etappkoderna är planeringsrubriker, inte separata GitHub Milestones. Välj högst 2–3 uppgifter eller deluppgifter per vecka och arbeta främst med ett projekt åt gången.

## Omfattning

Visa produkter, starta köp, lägga till produkt och antal, beräkna totalsumma och avsluta köp med kvitto. Priser lagras i heltalsören. Ingen betalningsintegration, databas eller GUI i v1.

## Design som växer med projektet

Börja med Product, SaleLine och Sale. Inför sedan View → Controller → Model samt ProductRepository med en implementation i minnet. Modellklasser ska kunna testas utan konsol. Komposition först; arv endast när ett konkret behov finns.

## Tester och leverans

Börja med små deterministiska exempel. Testa både normalfall, tomma fall och felvägar enligt issues. Lägg till CI när en verklig bygg- och testkedja finns. En v1 ska gå att bygga, testa och demonstrera från ren klon.

## Övergripande ordning inför 2027

1. November 2026–februari 2027: Java Checkout System.
2. Mars–april 2027: Metro Route Planner.
3. Maj–juni 2027: C Game of Life.
4. Juli–augusti 2027: buffert, repetition, matematik och portfoliovård.

Anpassa tempot med handledare. IT Ticket Tracker kan avslutas till en avgränsad version eller pausas efter en statusnotering; det projektet ändras inte här.

## Koppling till fortsatta studier

Fristående övningsprojekt i objektorientering, algoritmer och minneshantering. De är inte officiella KTH-laborationer. Exakt kursinnehåll och språk för CINTE HT2027 har inte verifierats i denna projektstart. C-simulering tränar inte alla moment inom elektronik, digitalteknik och processorarkitektur. Java använder referenser; C-pekare hör till C-projektet.

## Startmaterial tillagt

Börja med [START_HERE](START_HERE.md) och dess första fyra pass. Källfiler, byggfiler och tester finns nu; deras TODO markerar ditt arbete.
Startmaterialet ersätter den tidigare manuella skapandet av projektstruktur i setup-uppgifterna. Issues #1–#6 är fortsatt din arbetsordning; stäng dem först när du själv har verifierat kriterierna.

### Kunskapsmål från din tidigare kurslista

Repetera programmeringsgrunder (DD1337) och att planera/leverera ett mindre projekt (DD1349). Träna typer, loopar, metoder, objekt, validering och testning.

Kurskopplingen är tematisk utifrån din uppladdade lista över avklarade kurser; den är ingen bedömning av aktuella kursplaner.

### Definition av klar uppgift

- Acceptancekriterierna i aktuell issue är uppfyllda.
- Relevanta uppgiftstester är aktiverade och passerar; minst ett eget gränsfall finns.
- Du kan förklara koden och ändra ett litet krav utan att kopiera en lösning.
- PR beskriver vad, varför, verifiering och lärdom; lärandeloggen är uppdaterad.

### Veckovis avstämning

Visa en fungerande liten del för handledare, välj 2–3 deluppgifter, notera hinder och justera nästa veckas omfattning. Matematik från din kurslista kan repeteras separat när huvudprojektet fungerar stabilt.
