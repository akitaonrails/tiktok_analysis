package com.bytedance.ies.sdk.widgets;

/* JADX INFO: loaded from: classes5.dex */
public class KVData {
    public Object data;
    public String key;

    public <T> T getData() {
        T t = (T) this.data;
        if (t == null) {
            return null;
        }
        return t;
    }

    public String getKey() {
        return this.key;
    }

    public <T> T getData(T t) {
        return (T) DataCenter.get(this.data, t);
    }

    public KVData(String str, Object obj) {
        this.key = str;
        this.data = obj;
    }
}
