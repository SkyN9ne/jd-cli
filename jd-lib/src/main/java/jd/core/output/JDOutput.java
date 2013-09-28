/*
 * Copyright 2013 kwart, betterphp, nviennot
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jd.core.output;

import java.io.InputStream;

/**
 * This interface has to be implemented by jd-core output plugins. It contains methods for processing classes and resources.
 * 
 * @author Josef Cacek
 */
public interface JDOutput {
    void init(String basePath);

    void processClass(String className, String src);

    void processResource(String fileName, InputStream is);

    void commit();
}