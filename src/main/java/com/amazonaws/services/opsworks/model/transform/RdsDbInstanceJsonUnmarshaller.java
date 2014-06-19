/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.opsworks.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.opsworks.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Rds Db Instance JSON Unmarshaller
 */
public class RdsDbInstanceJsonUnmarshaller implements Unmarshaller<RdsDbInstance, JsonUnmarshallerContext> {

    public RdsDbInstance unmarshall(JsonUnmarshallerContext context) throws Exception {
        RdsDbInstance rdsDbInstance = new RdsDbInstance();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.currentToken;
        if (token == null) token = context.nextToken();
        if (token == VALUE_NULL) return null;

        while (true) {
            if (token == null) break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("RdsDbInstanceArn", targetDepth)) {
                    context.nextToken();
                    rdsDbInstance.setRdsDbInstanceArn(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DbInstanceIdentifier", targetDepth)) {
                    context.nextToken();
                    rdsDbInstance.setDbInstanceIdentifier(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DbUser", targetDepth)) {
                    context.nextToken();
                    rdsDbInstance.setDbUser(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DbPassword", targetDepth)) {
                    context.nextToken();
                    rdsDbInstance.setDbPassword(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Region", targetDepth)) {
                    context.nextToken();
                    rdsDbInstance.setRegion(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Address", targetDepth)) {
                    context.nextToken();
                    rdsDbInstance.setAddress(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Engine", targetDepth)) {
                    context.nextToken();
                    rdsDbInstance.setEngine(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("StackId", targetDepth)) {
                    context.nextToken();
                    rdsDbInstance.setStackId(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("MissingOnRds", targetDepth)) {
                    context.nextToken();
                    rdsDbInstance.setMissingOnRds(BooleanJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth) break;
                }
            }

            token = context.nextToken();
        }
        
        return rdsDbInstance;
    }

    private static RdsDbInstanceJsonUnmarshaller instance;
    public static RdsDbInstanceJsonUnmarshaller getInstance() {
        if (instance == null) instance = new RdsDbInstanceJsonUnmarshaller();
        return instance;
    }
}
    