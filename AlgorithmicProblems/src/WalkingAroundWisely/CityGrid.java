package WalkingAroundWisely;

public class CityGrid {

	private int numRoads, startX, startY, endX, endY;
	private boolean[][][] workPath;
	private static final int DIRECTIONS = 2;
	private static final int NORTH = 1;
	private static final int EAST = 0;

	public CityGrid(int numRoads) {
		this.numRoads = numRoads;
		this.workPath = new boolean[numRoads][numRoads][DIRECTIONS];
	}

	public void setStartPoint(int x, int y) {
		startX = x;
		startY = y;
	}

	public void setEndPoint(int x, int y) {
		endX = x;
		endY = y;
	}

	public void setWorkPlace(int x, int y, char dir) {
		if (dir == 'N')
			workPath[x][y][NORTH] = true;
		else if (dir == 'S')
			workPath[x][y - 1][NORTH] = true;
		else if (dir == 'E')
			workPath[x][y][EAST] = true;
		else if (dir == 'W')
			workPath[x - 1][y][EAST] = true;
	}
	
	public long numberOfPaths() {
		long a[][] = new long[numRoads][numRoads];
		a[endX - 1][endY - 1] = 1;
		for (int i = endX - 1; i >= 0; i-- ) {
			for (int j = endY - 1; j >= 0; j--) {
				if (isOK(i + 1, j) && !workPath[i][j][EAST])
					a[i][j] += a[i + 1][j];
				if (isOK(i, j + 1) && !workPath[i][j][NORTH])
					a[i][j] += a[i][j + 1];
			}
		}
		return a[startX-1][startY-1];
	}

	private boolean isOK(int x, int y) {
		return x >= 0 && y >= 0 && x < numRoads && y < numRoads;
	}
}