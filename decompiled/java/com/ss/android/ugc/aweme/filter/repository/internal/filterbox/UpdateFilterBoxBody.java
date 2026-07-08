package com.ss.android.ugc.aweme.filter.repository.internal.filterbox;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class UpdateFilterBoxBody {

    @C09CT("access_key")
    public final String accessKey;

    @C09CT("app_version")
    public final String appVersion;

    @C09CT("channel")
    public final String channel;

    @C09CT("device_id")
    public final String deviceId;

    @C09CT("effect_ids")
    public final String effectIds;

    @C09CT("panel")
    public final String panel;

    @C09CT("region")
    public final String region;

    @C09CT("type")
    public final int removeType;

    @C09CT("sdk_version")
    public final String sdkVersion;

    public UpdateFilterBoxBody(String str, int i, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.effectIds = str;
        this.removeType = i;
        this.deviceId = str2;
        this.panel = str3;
        this.sdkVersion = str4;
        this.channel = str5;
        this.region = str6;
        this.accessKey = str7;
        this.appVersion = str8;
    }
}
