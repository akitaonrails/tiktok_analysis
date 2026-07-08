package com.ss.android.ugc.aweme.lazydata;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class LazyDataBase {
    public volatile String lazyDataKey = "";
    public volatile String lazyDataRootKey = "";
    public ConcurrentHashMap<Object, Boolean> lazyDataInitializedMarkMap = new ConcurrentHashMap<>();

    public final ConcurrentHashMap<Object, Boolean> getLazyDataInitializedMarkMap() {
        return this.lazyDataInitializedMarkMap;
    }

    public final String getLazyDataKey() {
        return this.lazyDataKey;
    }

    public final String getLazyDataRootKey() {
        return this.lazyDataRootKey;
    }

    public final void setLazyDataInitializedMarkMap(ConcurrentHashMap<Object, Boolean> concurrentHashMap) {
        this.lazyDataInitializedMarkMap = concurrentHashMap;
    }

    public final void setLazyDataKey(String str) {
        this.lazyDataKey = str;
    }

    public final void setLazyDataRootKey(String str) {
        this.lazyDataRootKey = str;
    }
}
