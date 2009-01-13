/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Rotl extends Binop {

	public Rotl(Pointer ptr) {
		super(ptr);
	}

	
	@Override
	public Node getLeft() {
		return createWrapper(binding.get_Rotl_left(ptr));
	}

	@Override
	public void setLeft(Node left) {
		binding.set_Rotl_left(this.ptr, left.ptr);
	}
	
	@Override
	public Node getRight() {
		return createWrapper(binding.get_Rotl_right(ptr));
	}

	@Override
	public void setRight(Node right) {
		binding.set_Rotl_right(this.ptr, right.ptr);
	}
	

	

	

	
	public static final int pnMax = 0;
}