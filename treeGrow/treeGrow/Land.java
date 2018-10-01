//package treeGrow;

public class Land{
	int xp;
	int yp;
	float [][] Sunexposure;
	float [][] originalshade;
	// to do
	// sun exposure data here

	static float shadefraction = 0.1f; // only this fraction of light is transmitted by a tree

	Land(int dx, int dy) {
		// to do
		xp=dx;
		yp=dy;
		Sunexposure = new float[dy][dx];
		originalshade = new float[dy][dx];
	}

	// return the number of landscape cells in the x dimension
	int getDimX() {
		// to do
		return xp; // incorrect value
	}
	
	// return the number of landscape cells in the y dimension
	int getDimY() {
		// to do
		return yp; // incorrect value
	}
	
	// Reset the shaded landscape to the same as the initial sun exposed landscape
	// Needs to be done after each growth pass of the simulator
	void resetShade() {
		// to do
		Sunexposure = originalshade;
	}
	
	// return the sun exposure of the initial unshaded landscape at position <x,y?
	float getFull(int x, int y) {
		// to do
		return 0.0f; // incorrect value
	}
	
	// set the sun exposure of the initial unshaded landscape at position <x,y> to <val>
	void setFull(int x, int y, float val) {
		originalshade[y][x]= val;
	}
	
	// return the current sun exposure of the shaded landscape at position <x,y>
	float getShade(int x, int y) {
		// to do 
		return Sunexposure[y][x]; 
	}
	
	// set the sun exposure of the shaded landscape at position <x,y> to <val>
	void setShade(int x, int y, float val){
		// to do
		Sunexposure[y][x]=val;
	}
	
	// reduce the sun exposure of the shaded landscape to 10% of the original
	// within the extent of <tree>
	void shadow(Tree tree){
		int extent = (int) tree.getExt();
		int ty = tree.getY();
		int tx = tree.getX();
		for(int u = tx-extent; u <= tx+extent; u++){
			for(int j = ty-extent; j<= ty+extent; j++){
				if(xp>u && xp>j && j>=0 && u>=0){
					Sunexposure[j][u] = Sunexposure[j][u]*shadefraction;
					}
				}
			}
	}
}
