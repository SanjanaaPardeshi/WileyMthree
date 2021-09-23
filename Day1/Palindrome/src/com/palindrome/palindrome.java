package com.palindrome;

import com.reverse.Reverse;

public class palindrome {
	private int num;
	private boolean status;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public boolean isStatus() {
		Reverse rev = new Reverse();
		rev.setNum(num);
		if(num == rev.getRev()) {
			status = true;
		}else
			status = false;
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}

	


	
}