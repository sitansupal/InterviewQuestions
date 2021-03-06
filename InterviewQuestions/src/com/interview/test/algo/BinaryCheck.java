package com.interview.test.algo;

/**
 * The binary numeral system, or base-2 number system, represents numeric values
 * using two symbols: 0 and 1. More specifically, the usual base-2 system is a
 * positional notation with a radix of 2. Because of its straightforward
 * implementation in digital electronic circuitry using logic gates, the binary
 * system is used internally by almost all modern computers.
 * 
 * @author sekha
 *
 */
public class BinaryCheck {
	public boolean isBinaryNumber(int binary) {

		boolean status = true;
		while (true) {
			if (binary == 0) {
				break;
			} else {
				int tmp = binary % 10;
				if (tmp > 1) {
					status = false;
					break;
				}
				binary = binary / 10;
			}
		}
		return status;
	}

	public static void main(String a[]) {
		BinaryCheck mbc = new BinaryCheck();
		System.out.println("Is 1000111 binary? :" + mbc.isBinaryNumber(1000111));
		System.out.println("Is 10300111 binary? :" + mbc.isBinaryNumber(10300111));
	}
}
