package org.chelkatrao.bekki;

import lombok.SneakyThrows;

import java.util.Arrays;
import java.util.stream.Stream;


public class Translator {
    @SneakyThrows
    public String converter(String w) {
        final String[] word = {w};
        Stream<AlphabetKiril> streamKiril = Arrays.stream(AlphabetKiril.values());
        Stream<AlphabetLatin> streamLotin = Arrays.stream(AlphabetLatin.values());
        if ((int) w.toCharArray()[0] < 500) {
            streamKiril.forEach(alphabetKiril -> {
                // key = lotin
                // name = kiril   (lotin->kiril) ga
                word[0] = word[0].replace(alphabetKiril.key, alphabetKiril.name());
            });
        } else {
            streamLotin.forEach(alphabetLatin -> {
                // key = lotin
                // value = kiril (kiril->lotin) ga
                word[0] = word[0].replace(alphabetLatin.key, alphabetLatin.value);
            });
        }
        return word[0];
    }
}
