package assignment9.scenes;

import java.util.HashSet;
import java.util.Set;

import assignment9.Drawable;
import assignment9.scenes.ifs.Tree;
import edu.princeton.cs.introcs.StdDraw;

public class Forest implements Drawable {
	
	private Set<Tree> trees;
	
	/**
	 * A collection (Set) of trees
	 * @param numTrees the number of trees in this Forest
	 */
	public Forest(int numTrees) {
		this.trees = new HashSet<Tree>();
		for (int i=0; i < numTrees; ++i) {
			trees.add(new Tree(2*Math.random()-1.0, 2*Math.random()-1.0, Math.random()));
		}
	}
	
	@Override
	public void draw() {
		for (Tree t : trees) {
			t.draw();
		}
	}
	
	//
	// Demo a Forest
	//
	public static void main(String[] args) {
		StdDraw.enableDoubleBuffering();
		Forest f = new Forest(75);
		StdDraw.show();
		StdDraw.pause(10);
		f.draw();
		StdDraw.show();
		StdDraw.pause(10);
	}

}
