package com.bytedance.memdump.data;

import X.C09CT;

/* JADX INFO: loaded from: classes24.dex */
public class DataBean {

    @C09CT("event_type")
    public String eventType;

    @C09CT("timestamp")
    public long timestamp;

    public DataBean(String str, long j) {
        this.eventType = str;
        this.timestamp = j;
    }
}
