package com.tiktok.pns.ldp.api.model;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class UnknownDataStorageModel {

    @C09CT("biz_ldp_data")
    public String bizLdpData;

    @C09CT("event")
    public String event;

    @C09CT("ldp_config")
    public String ldpConfig;

    @C09CT("event_random_ts")
    public long timestamp;

    public UnknownDataStorageModel(String str, long j, String str2, String str3) {
        this.event = str;
        this.timestamp = j;
        this.ldpConfig = str2;
        this.bizLdpData = str3;
    }
}
