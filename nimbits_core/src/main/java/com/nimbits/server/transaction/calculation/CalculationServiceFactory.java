/*
 * Copyright (c) 2013 Nimbits Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS,  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either expressed or implied.  See the License for the specific language governing permissions and limitations under the License.
 */

package com.nimbits.server.transaction.calculation;

import com.nimbits.server.NimbitsEngine;
import com.nimbits.server.process.task.TaskService;

/**
 * Created by benjamin on 10/15/13.
 */
public class CalculationServiceFactory {

    public static CalculationService getInstance(NimbitsEngine engine, TaskService taskService) {
        return new CalculationServiceImpl(engine, taskService);

    }

}