package com.ss.ugc.live.sdk.message.data;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class LimitedSizeHashMap<K, V> extends LinkedHashMap<K, V> {
    public int mMaxSize;

    public LimitedSizeHashMap(int i) {
        this.mMaxSize = i;
    }

    @Override // java.util.LinkedHashMap
    public boolean removeEldestEntry(Map.Entry<K, V> entry) {
        if (size() > this.mMaxSize) {
            return true;
        }
        return false;
    }
}
