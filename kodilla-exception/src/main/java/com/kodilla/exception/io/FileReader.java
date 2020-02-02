package com.kodilla.exception.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReader {
    public void readFile() {
        //obiekt nazwany classLoader typu ClassLoader
        //obiekt typu ClassLoader pobierany jest za pomocą metody getClass().getClassLoader()
        //getClass() - metoda zwracająca klasę w której jest wywołana czyli FileReader
        //klasa ClassLoader jest odpowiedzialna za odnalezienie klas i plików wewnątrz aplikacji.
        ClassLoader classLoader = getClass().getClassLoader();
        //jest to wywołanie metody, która wskazuje klasie ClassLoader gdzie powinna szukać pliku tu w katalogu file/names.txt
        File file = new File(classLoader.getResource("file/names.txt").getFile());
        //new File() - tworzymy obiket reprezentujący nasz plik tekstowy za pomocą klasy File, która jest dostępna wewnątrz biblioteki Javy - java.io.

        //Przełożenie naszej ścieżki na obiekty za pomocą klasy Paths. Obiekt path klasy Path
        //Klasa paths pozwala na modyfikację ścieżki o typie String na obiekt Path, który będzie niezbędny do dalszego działania z plikiem
        try (Stream<String> fileLines = Files.lines(Paths.get(file.getPath())))// java spróbuj to zrobić. Jeżeli się nie uda to pomoc za pomocą polecenia catch
        {
            fileLines.forEach(System.out::println);
        } catch (IOException e) {
            //catch blok kodu, który uruchomi się od razu kiedy Java napotka wyjątek na przykład IOExecption
            //wewnatrz nawiasów musimy zdefiniować wywołania catch musimy zdefiniować jakiego wyjatku może spodziewać się Java
            // i co zrobić jak go napotka
            System.out.println("Oh no, somthing get wrong "+e);
        }
        finally{
            System.out.println("I am gonna be always here!!");
        }
    }
}
