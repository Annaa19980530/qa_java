package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class AlexLionTest {
    Feline feline;
    AlexLion alexLionTest;

    @Mock
    AlexLion alexLion;


    @Before
    public void init() throws Exception {
        alexLionTest = new AlexLion(feline);
    }

    @Test //что метод getKittens() вызван
    public void getKittensCallCheck() {
        alexLion.getKittens();
        Mockito.verify(alexLion).getKittens();
    }

    @Test //что метод getFriends() вызван
    public void getFriendsCallCheck() {
        alexLion.getFriends();
        Mockito.verify(alexLion).getFriends();
    }

    @Test //метод getPlaceOfLiving() вызван
    public void getPlaceOfLivingCallCheck() {
        alexLion.getPlaceOfLiving();
        Mockito.verify(alexLion).getPlaceOfLiving();
    }

    @Test //метод getFriends() вызывает нужный список
    public void getFriendsListCheck() {
        assertEquals(List.of("зебра Марти", "бегемотиха Глория", "жираф Мелман"), alexLionTest.getFriends());
    }

    @Test //метод getPlaceOfLiving() вызывает нужный String
    public void testPlaceOfLiving() {
        assertEquals("Нью-Йоркский зоопарк", alexLionTest.getPlaceOfLiving());
    }

    @Test //проверка, что у Алекса нет детей
    public void testGetKittens() {
        assertEquals(0, alexLionTest.getKittens());
    }

}