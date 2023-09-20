package nl.tudelft.jpacman.board;


import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BoardTest {

    private Board board;
    private Square[][] grid;

    @BeforeEach
    void setUp() {
        grid = new Square[][] {
            { new BasicSquare() }
        };
        board = new Board(grid);
    }

    @Test
    void testBoardDimensions() {
        assertThat(board.getHeight()).isEqualTo(1);
        assertThat(board.getWidth()).isEqualTo(1);
    }

    @Test
    void testSquareAt() {
        Square square = board.squareAt(0, 0);
        assertThat(square).isNotNull();
        assertThat(square instanceof  BasicSquare).isTrue();
    }

}
