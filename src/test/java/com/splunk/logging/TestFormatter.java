package com.splunk.logging;/*
* Copyright 2013-2014 Splunk, Inc.
*
* Licensed under the Apache License, Version 2.0 (the "License"): you may
* not use this file except in compliance with the License. You may obtain
* a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
* WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
* License for the specific language governing permissions and limitations
* under the License.
*/
import java.net.Inet4Address;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

/**
 * Trivial formatter for java.util.logging, since under Java 6 you cannot specify
 * a format string to the SimpleFormatter that it provides.
 */
public class TestFormatter extends Formatter {
    @Override
    public String format(LogRecord record) {
        return record.getLevel() + ": " + record.getMessage() + "\n";
    }
}
