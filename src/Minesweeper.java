import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by alex on 15/01/2017.
 */
public class Minesweeper {

	private List<Field> fields = new ArrayList<>();
	private WindowController windowController;

	public void initGame() {
		int width = 10;
		int height = 10;

		windowController = new WindowController(width, height, this);
		generateFields(width, height);
		placeBombs(width, height);
	}

	private void generateFields(int width, int height) {

	}

	private void placeBombs(int width, int height) {

	}
}
