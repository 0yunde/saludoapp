package com.equipo.taskmaster;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    void testAddTask() {
        // Arrancamos con la lista vacía
        App.tasks.clear();

        // Añadimos una tarea de prueba
        App.addTask("Terminar ejercicio Maven");

        // Comprobamos que ahora hay exactamente 1 elemento
        assertEquals(1, App.tasks.size());
    }
}


