package test;

import spil.Field;

import static org.junit.Assert.*;

public class FieldTest {
    Field field;
    @org.junit.Before
    public void setUp() throws Exception {
        field = new Field(0);
    }

    @org.junit.After
    public void tearDown() throws Exception {
        field = null;
    }

    @org.junit.Test
    public void landOnField() throws Exception {

    }

}