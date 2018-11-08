package com.github.maven.example.tests;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.github.maven.example.Widget;

/**
 * Unit tests of {@link Widget} class
 */
public class WidgetTest {

	/**
	 * Test default enable state of {@link Widget}
	 */
	@Test
	public void defaultState() {
		Widget widget = new Widget();
		assertTrue(widget.isEnabled());
		System.out.println("Testing");
	}

	/**
	 * Test enabling and disabling a {@link Widget}
	 */
	@Test
	public void updateEnableState() {
		Widget widget = new Widget();
		widget.setEnabled(false);
		assertFalse(widget.isEnabled());
		widget.setEnabled(true);
		assertTrue(widget.isEnabled());
		System.out.println("Testing2");
	}
}
