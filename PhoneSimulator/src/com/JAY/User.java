/**
 * 
 */
package com.JAY;

/**
 * @author John
 *
 */
public class User {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Phone myPhone = new Phone();
		myPhone.pressPower();

		// press 9721112222 in sequence

		myPhone.pressNumber(9);
		myPhone.pressNumber(7);
		myPhone.pressNumber(2);
		myPhone.pressNumber(1);
		myPhone.pressNumber(1);
		myPhone.pressNumber(1);
		myPhone.pressNumber(2);
		myPhone.pressNumber(2);
		myPhone.pressNumber(2);
		myPhone.pressNumber(2);

		// press talk button

		myPhone.pressTalk();

		// then hang up

		myPhone.pressHangUp();

		// turn it off

		myPhone.pressPower();

	}

}
