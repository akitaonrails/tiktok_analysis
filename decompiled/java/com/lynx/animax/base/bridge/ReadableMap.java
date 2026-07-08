package com.lynx.animax.base.bridge;

import X.InterfaceC1285700jYu;
import java.util.HashMap;

/* JADX INFO: loaded from: classes21.dex */
public interface ReadableMap {
    HashMap<String, Object> asHashMap();

    InterfaceC1285700jYu getArray(String str);

    double getDouble(String str, double d);

    int getInt(String str, int i);

    long getLong(String str, long j);

    String getString(String str);

    ReadableType getType(String str);
}
