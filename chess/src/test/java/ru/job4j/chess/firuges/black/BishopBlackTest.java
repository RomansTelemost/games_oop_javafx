package ru.job4j.chess.firuges.black;

import org.junit.jupiter.api.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.junit.jupiter.api.Assertions.*;

class BishopBlackTest {

    @Test
    public void whenCreate() {
        Figure bishopBlack = new BishopBlack(Cell.C1);
        assertEquals(bishopBlack.position(), Cell.C1);
    }

    @Test
    public void whenCopyThenPositionIsEqual() {
        Figure bishopBlack = new BishopBlack(Cell.C1);
        assertEquals(bishopBlack.position(), Cell.C1);
        Figure copiedBishopBlack = bishopBlack.copy(Cell.D7);
        assertEquals(copiedBishopBlack.position(), Cell.D7);
    }

    @Test
    public void whenMoveBlackBishopFigure() {
        Figure bishopBlack = new BishopBlack(Cell.C1);
        bishopBlack.way(Cell.G5);
        bishopBlack.way(Cell.H6);
        bishopBlack.way(Cell.E3);
    }
}