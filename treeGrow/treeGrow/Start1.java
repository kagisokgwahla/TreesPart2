public class Start1 extends Thread implements Runnable{
	
	Tree [] trees;
	Land landsc;
	
	public Start1(Tree [] trees, Land landsc){
		this.trees = trees;
		this.landsc = landsc;
		
		}
		
		public void run(){
			while(true){
				
				for(int t = trees.length-1; t>0;t--){
					
					trees[t].sungrow(landsc);
					}
				
				}
			
			}
	
	}
