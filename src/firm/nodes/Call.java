/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Call extends Node {

	public Call(Pointer ptr) {
		super(ptr);
	}

	
	
	public Node getMem() {
		return createWrapper(binding.get_Call_mem(ptr));
	}

	
	public void setMem(Node mem) {
		binding.set_Call_mem(this.ptr, mem.ptr);
	}
	
	
	public Node getPtr() {
		return createWrapper(binding.get_Call_ptr(ptr));
	}

	
	public void setPtr(Node ptr) {
		binding.set_Call_ptr(this.ptr, ptr.ptr);
	}
	

	
	public firm.Type getType() {
		Pointer _res = binding.get_Call_type(ptr);
		return firm.Type.createWrapper(_res);
	}

	public void setType(firm.Type _val) {
		binding.set_Call_type(this.ptr, _val.ptr);
	}
	

	

	
	public static final int pnMRegular = 0;
	
	public static final int pnXRegular = 1;
	
	public static final int pnXExcept = 2;
	
	public static final int pnTResult = 3;
	
	public static final int pnMExcept = 4;
	
	public static final int pnPValueResBase = 5;
	
	public static final int pnMax = 6;
}