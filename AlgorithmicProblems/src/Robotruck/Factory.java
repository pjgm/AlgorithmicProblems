package Robotruck;

public class Factory {
	
	private int[] destX, destY, weight;
	private int numberOfPackages;
	private int maximumCapacity;
	
	public Factory(int maximumCapacity, int numberOfPackages) {
		this.maximumCapacity = maximumCapacity;
		this.numberOfPackages = numberOfPackages;	
		destX = new int[numberOfPackages];
		destY = new int[numberOfPackages];
		weight = new int[numberOfPackages];
	}
	
	public void addPackage(int pos, int x, int y, int w) {
		destX[pos] = x;
		destY[pos] = y;
		weight[pos] = w;
	}
	
	public int getMinNumberOfMoves() {
		for (int i = 0; i < numberOfPackages; i++) {
			//TODO
		}
	}
	
	private int distance(int beginX, int beginY, int endX, int endY) {
		return Math.abs(endX - beginX) + Math.abs(endY - beginY); 
	}
	
}