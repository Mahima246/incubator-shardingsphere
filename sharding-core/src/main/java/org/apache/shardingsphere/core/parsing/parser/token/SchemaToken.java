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

package org.apache.shardingsphere.core.parsing.parser.token;

import lombok.Getter;
import lombok.ToString;
import org.apache.shardingsphere.core.util.SQLUtil;

/**
 * Schema token.
 *
 * @author zhangliang
 */
@ToString
public final class SchemaToken extends SQLToken {
    
    @Getter
    private final String originalLiterals;
    
    private final String tableName;
    
    public SchemaToken(final int beginPosition, final String originalLiterals, final String tableName) {
        super(beginPosition);
        this.originalLiterals = originalLiterals;
        this.tableName = tableName;
    }
    
    /**
     * Get schema name.
     * 
     * @return table name
     */
    public String getSchemaName() {
        return SQLUtil.getExactlyValue(originalLiterals);
    }
    
    /**
     * Get table name.
     *
     * @return table name
     */
    public String getTableName() {
        return SQLUtil.getExactlyValue(tableName);
    }
}