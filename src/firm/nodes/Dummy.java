/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Dummy extends Node {

	public Dummy(Pointer ptr) {
		super(ptr);
	}

	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	}

	public static final int pnMax = 0;
}
