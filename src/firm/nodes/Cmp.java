/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Cmp extends Binop {

	public Cmp(Pointer ptr) {
		super(ptr);
	}

	
	@Override
	public Node getLeft() {
		return createWrapper(binding.get_Cmp_left(ptr));
	}

	@Override
	public void setLeft(Node left) {
		binding.set_Cmp_left(this.ptr, left.ptr);
	}
	
	@Override
	public Node getRight() {
		return createWrapper(binding.get_Cmp_right(ptr));
	}

	@Override
	public void setRight(Node right) {
		binding.set_Cmp_right(this.ptr, right.ptr);
	}
	

	

	

	
	public static final int pnFalse = 0;
	
	public static final int pnEq = 1;
	
	public static final int pnLt = 2;
	
	public static final int pnLe = 3;
	
	public static final int pnGt = 4;
	
	public static final int pnGe = 5;
	
	public static final int pnLg = 6;
	
	public static final int pnLeg = 7;
	
	public static final int pnUo = 8;
	
	public static final int pnUe = 9;
	
	public static final int pnUl = 10;
	
	public static final int pnUle = 11;
	
	public static final int pnUg = 12;
	
	public static final int pnUge = 13;
	
	public static final int pnNe = 14;
	
	public static final int pnTrue = 15;
	
	public static final int pnMax = 16;
}