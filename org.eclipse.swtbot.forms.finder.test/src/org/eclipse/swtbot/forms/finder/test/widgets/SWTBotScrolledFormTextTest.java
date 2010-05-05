/*******************************************************************************
 * Copyright (c) 2010 Chris Aniszczyk and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Chris Aniszczyk <caniszczyk@gmail.com> - initial API and implementation
 *******************************************************************************/
package org.eclipse.swtbot.forms.finder.test.widgets;

import static org.junit.Assert.assertNotNull;

import org.eclipse.swtbot.forms.finder.test.SWTBotFormsTestCase;
import org.eclipse.swtbot.forms.finder.widgets.SWTBotScrolledFormText;
import org.junit.Test;

public class SWTBotScrolledFormTextTest extends SWTBotFormsTestCase {

	@Test
	public void findsScrolledFormText() throws Exception {
		SWTBotScrolledFormText text = bot.scrolledFormText("Hello, Eclipse Forms");
		assertNotNull(text);
	}
	
}
