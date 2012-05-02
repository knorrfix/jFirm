/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class And extends Binop {

	public And(Pointer ptr) {
		super(ptr);
	}

	@Override
	public Node getLeft() {
		return createWrapper(firm.bindings.binding_irnode.get_And_left(ptr));
	}

	@Override
	public void setLeft(Node left) {
		firm.bindings.binding_irnode.set_And_left(this.ptr, left.ptr);
	}

	@Override
	public Node getRight() {
		return createWrapper(firm.bindings.binding_irnode.get_And_right(ptr));
	}

	@Override
	public void setRight(Node right) {
		firm.bindings.binding_irnode.set_And_right(this.ptr, right.ptr);
	}

	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	}

	public static final int pnMax = 0;
}
