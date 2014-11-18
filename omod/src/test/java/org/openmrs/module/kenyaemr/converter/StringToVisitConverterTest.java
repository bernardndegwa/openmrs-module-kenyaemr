/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */

package org.openmrs.module.kenyaemr.converter;

import org.junit.Assert;
import org.junit.Test;
import org.openmrs.api.context.Context;
import org.openmrs.web.test.BaseModuleWebContextSensitiveTest;

import static org.hamcrest.Matchers.*;

/**
 * Tests for {@link StringToVisitConverter}
 */
public class StringToVisitConverterTest extends BaseModuleWebContextSensitiveTest {

	private StringToVisitConverter converter = new StringToVisitConverter();

	/**
	 * @see StringToVisitConverter#convert(String)
	 */
	@Test
	public void convert_shouldConvertString() {
		Assert.assertThat(converter.convert(null), nullValue());
		Assert.assertThat(converter.convert(""), nullValue());
		Assert.assertThat(converter.convert("1"), is(Context.getVisitService().getVisit(1)));
	}
}