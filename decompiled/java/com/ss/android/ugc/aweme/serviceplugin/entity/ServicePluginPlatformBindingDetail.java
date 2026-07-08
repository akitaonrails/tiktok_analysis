package com.ss.android.ugc.aweme.serviceplugin.entity;

import X.C09CT;

/* JADX INFO: loaded from: classes13.dex */
public final class ServicePluginPlatformBindingDetail {

    @C09CT("calibrated_entity_id")
    public final String calibratedEntityId;

    @C09CT("is_bound")
    public final Boolean isBound;

    @C09CT("platform_icon_url")
    public final String platformIconUrl;

    @C09CT("platform_id")
    public final String platformId;

    @C09CT("platform_name")
    public final String platformName;

    @C09CT("platform_schema")
    public final String platformSchema;

    public ServicePluginPlatformBindingDetail(String str, String str2, String str3, String str4, Boolean bool, String str5) {
        this.platformId = str;
        this.platformName = str2;
        this.platformSchema = str3;
        this.platformIconUrl = str4;
        this.isBound = bool;
        this.calibratedEntityId = str5;
    }
}
