class UniquePaths {
	public int uniquePathsIII(int[][] grid) {

		int startingRowValue = 0;
		int startingColumnValue = 0;
		int zero = 0;

		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid[row].length; col++) {
				if (grid[row][col] == 1) {
					startingColumnValue = col;
					startingRowValue = row;
				} else if (grid[row][col] == 0) {
					zero++;
				}
			}

		}

		return startCountingPath(grid, startingRowValue, startingColumnValue, zero);
	}

	private int startCountingPath(int[][] grid, int startingSquareRow, int startingSquareColumn, int zero) {

		if (startingSquareRow < 0 || startingSquareColumn < 0 || startingSquareRow >= grid.length
				|| startingSquareColumn >= grid[0].length || grid[startingSquareRow][startingSquareColumn] == -1) {
			return 0;
		}

		if (grid[startingSquareRow][startingSquareColumn] == 2) {
			return zero == -1 ? 1 : 0;
		}

		grid[startingSquareRow][startingSquareColumn] = -1;

		zero--;

		int totalPaths = startCountingPath(grid, startingSquareRow + 1, startingSquareColumn, zero)
				+ startCountingPath(grid, startingSquareRow, startingSquareColumn + 1, zero)
				+ startCountingPath(grid, startingSquareRow - 1, startingSquareColumn, zero)
				+ startCountingPath(grid, startingSquareRow, startingSquareColumn - 1, zero);

		grid[startingSquareRow][startingSquareColumn] = 0;
		zero++;
		return totalPaths;

	}

}
