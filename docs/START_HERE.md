# Börja här: Java-kassan

## Förkunskapskoll utan tidspress
Förklara variabel, metod, loop, array, klass, objekt och konstruktor med egna exempel.
Kör programmet enligt README. Läs sedan Product.java och skapa två olika produkter i ett eget experiment.

## Första veckan på Misa IT, från 9 november
1. Pass 1 (60–90 min): kör startkod och tester. Förklara varför 2500 betyder 25 kr. Skriv ned tre saker att repetera.
2. Pass 2 (60–90 min): aktivera calculatesLineTotal i WarmupTest, se det falla, implementera R1. Aktivera valideringstestet.
3. Pass 3 (60–90 min): aktivera sumsArrays och implementera R2 med en loop. Lägg själv till ett fall med ett enda tal.
4. Pass 4: gå igenom ändringarna med handledare, öppna PR och skriv fem meningar i lärandeloggen.

Fördela passen över veckan. Lägg till fler pass först när du kan förklara det du skrivit.

## Från repetition till projekt
Fortsätt i befintliga issues #1–#6. Setup-filerna finns nu; #1 handlar om att du verifierar och förstår dem, inte skriver om dem.
#2: Product, SaleLine och Sale innehåller arbetsytor. Ta bort @Disabled från ett test åt gången.
Skriv egna tester för flera antal, negativt pris och ogiltigt antal; gör ett medvetet fel och kontrollera att testet hittar det.
#3: skissa konsoldialog innan du bygger den i Main.
#4: inför lager först när ett litet köp fungerar.

## Ledtrådar i ordning
- R1: vilka två indata behövs? Vilka värden är förbjudna?
- R2: vad ska en ackumulator börja på? Vad händer om loopen kör noll varv?
- Sale: vad tillhör ett enskilt köp, och vad tillhör en produkt?
Be om nästa ledtråd efter ett eget försök; skriv inte av en hel lösning.

## Testpolicy
ProductTest körs direkt. WarmupTest och SaleTest är avstängda uppgiftstester.
Grön start-CI betyder att grundstrukturen fungerar, inte att kassan är färdig.
När #2 är klar ska dess tester vara aktiverade; CI får därefter aldrig hoppas över dem.

## Klart för veckan
Du kan köra från terminalen, lösa R1/R2, beskriva testerna och visa en liten PR.
Branch: feat/java-repetition. Commit: feat: implement price and sum exercises.
