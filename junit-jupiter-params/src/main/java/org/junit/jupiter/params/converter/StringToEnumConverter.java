/*
 * Copyright 2015-2023 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * https://www.eclipse.org/legal/epl-v20.html
 */

package org.junit.jupiter.params.converter;

class StringToEnumConverter implements StringToObjectConverter {

	@Override
	public boolean canConvert(Class<?> targetType) {
		return targetType.isEnum();
	}

	@Override
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Object convert(String source, Class targetType) throws Exception {
		return Enum.valueOf(targetType, source);
	}

}
