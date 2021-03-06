/*
 * Copyright © 2012 Conor Roche
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package croche.maven.plugin.jira;

import junit.framework.TestCase;

/**
 * The Increment2DNextVersionGeneratorTest represents
 * @version $Id$
 * @author conorroche
 */
public class Increment2DNextVersionGeneratorTest extends TestCase {

	/**
	 * This tests version generation
	 */
	public void testVersionGeneration() {

		NextVersionGenerator gen = new Increment2DNextVersionGenerator();
		String currentVersion = "2.1";
		String nextVersion = gen.generateNextVersion(currentVersion);
		assertEquals("2.2", nextVersion);
		currentVersion = "2_1";
		nextVersion = gen.generateNextVersion(currentVersion);
		assertEquals("2_2", nextVersion);
		currentVersion = "2_1-SNAPSHOT";
		nextVersion = gen.generateNextVersion(currentVersion);
		assertEquals("2_2-SNAPSHOT", nextVersion);
		currentVersion = "Q2_1-SNAPSHOT";
		nextVersion = gen.generateNextVersion(currentVersion);
		assertEquals("Q2_2-SNAPSHOT", nextVersion);
	}

}
