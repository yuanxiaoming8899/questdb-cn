/*******************************************************************************
 * ___                  _   ____  ____
 * / _ \ _   _  ___  ___| |_|  _ \| __ )
 * | | | | | | |/ _ \/ __| __| | | |  _ \
 * | |_| | |_| |  __/\__ \ |_| |_| | |_) |
 * \__\_\\__,_|\___||___/\__|____/|____/
 * <p>
 * Copyright (C) 2014-2016 Appsicle
 * <p>
 * This program is free software: you can redistribute it and/or  modify
 * it under the terms of the GNU Affero General Public License, version 3,
 * as published by the Free Software Foundation.
 * <p>
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * <p>
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/

package com.questdb.ql.impl.analytic;

import com.questdb.factory.configuration.RecordColumnMetadata;
import com.questdb.ql.Record;
import com.questdb.ql.RecordCursor;
import com.questdb.std.CharSink;
import com.questdb.std.DirectInputStream;
import com.questdb.store.SymbolTable;

import java.io.OutputStream;

public interface AnalyticFunction {
    void add(Record record);

    byte get();

    void getBin(OutputStream s);

    DirectInputStream getBin();

    long getBinLen();

    boolean getBool();

    long getDate();

    double getDouble();

    float getFloat();

    CharSequence getFlyweightStr();

    CharSequence getFlyweightStrB();

    int getInt();

    long getLong();

    RecordColumnMetadata getMetadata();

    short getShort();

    void getStr(CharSink sink);

    CharSequence getStr();

    int getStrLen();

    String getSym();

    SymbolTable getSymbolTable();

    AnalyticFunctionType getType();

    void prepare(RecordCursor cursor);

    void prepareFor(Record record);

    void reset();
}
