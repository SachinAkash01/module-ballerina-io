/*
 * Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.ballerinalang.stdlib.io.events.result;

import org.ballerinalang.stdlib.io.events.EventContext;
import org.ballerinalang.stdlib.io.events.EventResult;

/**
 * Indicates a boolean result.
 */
public class BooleanResult implements EventResult<Boolean, EventContext> {
    /**
     * Result of the boolean.
     */
    private boolean result;

    /**
     * Holds the context to the event.
     */
    private EventContext context;

    public BooleanResult(EventContext context) {
        this.context = context;
    }

    public BooleanResult(boolean result, EventContext context) {
        this.result = result;
        this.context = context;
    }

    public EventContext getContext() {
        return context;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean getResponse() {
        return result;
    }
}
