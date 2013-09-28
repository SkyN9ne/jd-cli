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
package jd.core.options;

import static jd.core.JavaDecompilerConstants.SystemProperties.*;
import jd.core.IOUtils;

public class SystemPropertiesOptions implements DecompilerOptions {

    public boolean isDebug() {
        return IOUtils.getBoolean(DEBUG, DEBUG_DEFAULT);
    }

    public boolean isDisplayLineNumbers() {
        return IOUtils.getBoolean(LINE_NUMBERS, LINE_NUMBERS_DEFAULT);
    }

    public boolean isDisplayMetadata() {
        return IOUtils.getBoolean(METADATA, METADATA_DEFAULT);
    }

    public boolean isDiscardLocation() {
        return IOUtils.getBoolean(DISCARD_LOCATION, DISCARD_LOCATION_DEFAULT);
    }

    public boolean isSkipResources() {
        return IOUtils.getBoolean(SKIP_RESOURCES, SKIP_RESOURCES_DEFAULT);
    }
}