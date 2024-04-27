/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.hertzbeat.collector.collect.log.impl;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;
import org.apache.hertzbeat.collector.collect.AbstractCollect;
import org.apache.hertzbeat.collector.dispatch.DispatchConstants;
import org.apache.hertzbeat.common.entity.job.Metrics;
import org.apache.hertzbeat.common.entity.message.CollectRep;

import java.io.File;
import java.io.IOException;

@Slf4j
public class FileLogCollectImpl extends AbstractCollect {
    /**
     * Real acquisition implementation interface
     *
     * @param builder   response builder
     * @param monitorId monitor id
     * @param app       monitor type
     * @param metrics   metric configuration
     */
    @Override
    public void collect(CollectRep.MetricsData.Builder builder, long monitorId, String app, Metrics metrics) {
        File file = new File("");

        try (LineIterator it = FileUtils.lineIterator(file, "UTF-8")) {
            while (it.hasNext()) {
                String line = it.nextLine();
                // 处理每一行数据
                System.out.println(line);
            }
        } catch (IOException e) {
            log.error("Error reading file:{}", e.getMessage());
        }
    }

    /**
     * the protocol this collect instance support
     *
     * @return protocol str
     */
    @Override
    public String supportProtocol() {
        return DispatchConstants.PROTOCOL_FILE_LOG;
    }
}
