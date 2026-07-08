package com.bytedance.helios.network.runtime.host.model;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public interface NetworkStoreRepo {
    void clear();

    Map<String, ?> getAll();

    boolean getBoolean(String str, boolean z);

    float getFloat(String str, float f);

    int getInt(String str, int i);

    long getLong(String str, long j);

    String getString(String str, String str2);

    Set<String> getStringSet(String str, Set<String> set);

    void putBoolean(String str, boolean z);

    void putFloat(String str, float f);

    void putInt(String str, int i);

    void putLong(String str, long j);

    void putString(String str, String str2);

    void putStringSet(String str, Set<String> set);

    void remove(String str);
}
