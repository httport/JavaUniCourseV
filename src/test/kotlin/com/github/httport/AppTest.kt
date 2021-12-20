package com.github.httport

import kotlin.test.*

class AppTest {
    @Test fun firstTaskAscendingSort() {
        val p = Predok("smart  author")
        assertNull(p.StrS, "StrS should be null until PrSort is called")
        p.PrSort()
        assertNotNull(p.StrS, "StrS should be not null after PrSort call")
        assertEquals("author smart", p.StrS, "ascending sort is incorrect")
    }

    @Test fun firstTaskDescendingSort() {
        val p = Potomok("author smart")
        assertNull(p.StrS, "StrS should be null until PrSort is called")
        p.PrSort()
        assertNotNull(p.StrS, "StrS should be not null after PrSort call")
        assertEquals("smart author", p.StrS, "descending sort is incorrect")
    }
}
