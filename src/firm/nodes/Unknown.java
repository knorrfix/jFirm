/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Unknown extends Node {

	public Unknown(Pointer ptr) {
		super(ptr);
	}

	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	}

	public static final int pnMax = 0;
}
