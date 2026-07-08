package com.tiktok.pns.ldp.api.model;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class PrivatisedDataStorageModel {

    @C09CT("biz_data")
    public String bizData;

    @C09CT("biz_ldp_data")
    public String bizLdpData;

    @C09CT("event")
    public String event;

    @C09CT("ldp_config")
    public String ldpConfig;

    @C09CT("event_random_ts")
    public long timestamp;

    @C09CT("uuid")
    public String uuid;

    public PrivatisedDataStorageModel(String str, String str2, long j, String str3, String str4, String str5) {
        this.uuid = str;
        this.event = str2;
        this.timestamp = j;
        this.bizData = str3;
        this.ldpConfig = str4;
        this.bizLdpData = str5;
    }
}
