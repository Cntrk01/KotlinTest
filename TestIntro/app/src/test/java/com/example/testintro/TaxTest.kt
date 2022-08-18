package com.example.testintro

import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Test

class TaxTest {

    private lateinit var tax:Tax
    @Before
    fun setup(){
        tax=Tax()
    }
    @After
    fun tearDown(){

    }

    @Test
    fun calculateTax() {
        val netTax=tax.calculateTax(100.0,0.1)
        //5 bin satır kod olan fonksiyonu kontrol ediyor olabilirdik.Bunun birbirine eşit olup olmadığını kontrol etmek için Truth library kullanıcaz.
        assertThat(netTax).isEqualTo(10) // import com.google.common.truth.Truth.assertThat olmasına dikkat et !.Assert kontrol sağlar if gibi.Bu buna eşit mi ? bu bundan büyükmü değilse çalıştırma der
        //netTaxt 10 a eşit mi diyor burda.Amaç hata varsa uygulama çöker ki hatayı görmesini istediğimiz için çökmesini istiyoruz.
    }
    @Test
    fun calculateIncome() {
        val netIncome=tax.calculateIncome(200.0,0.2)
        assertThat(netIncome).isEqualTo(160)
    }
}