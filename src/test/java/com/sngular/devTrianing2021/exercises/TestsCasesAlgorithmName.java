package com.sngular.devTrining2021.exercises;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestsCasesAlgorithmName {
    @Test
    public void test() {
        assertEquals("Test value ZpglnRxqenU","Z-Pp-Ggg-Llll-Nnnnn-Rrrrrr-Xxxxxxx-Qqqqqqqq-Eeeeeeeee-Nnnnnnnnnn-Uuuuuuuuuuu",AlgorithmName.accum("ZpglnRxqenU"));
        assertEquals("Test value NyffsGeyylB","N-Yy-Fff-Ffff-Sssss-Gggggg-Eeeeeee-Yyyyyyyy-Yyyyyyyyy-Llllllllll-Bbbbbbbbbbb",AlgorithmName.accum("NyffsGeyylB"));
        assertEquals("Test value MjtkuBovqrU","M-Jj-Ttt-Kkkk-Uuuuu-Bbbbbb-Ooooooo-Vvvvvvvv-Qqqqqqqqq-Rrrrrrrrrr-Uuuuuuuuuuu",AlgorithmName.accum("MjtkuBovqrU"));
        assertEquals("Test value EvidjUnokmM","E-Vv-Iii-Dddd-Jjjjj-Uuuuuu-Nnnnnnn-Oooooooo-Kkkkkkkkk-Mmmmmmmmmm-Mmmmmmmmmmm",AlgorithmName.accum("EvidjUnokmM"));
        assertEquals("Test value HbideVbxncC","H-Bb-Iii-Dddd-Eeeee-Vvvvvv-Bbbbbbb-Xxxxxxxx-Nnnnnnnnn-Cccccccccc-Ccccccccccc",AlgorithmName.accum("HbideVbxncC"));
    }
}
