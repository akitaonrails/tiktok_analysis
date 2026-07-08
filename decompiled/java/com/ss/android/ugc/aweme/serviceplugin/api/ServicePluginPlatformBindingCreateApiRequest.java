package com.ss.android.ugc.aweme.serviceplugin.api;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class ServicePluginPlatformBindingCreateApiRequest {

    @C09CT("entity_id")
    public final String entityId;

    @C09CT("platform_id")
    public final String platformId;

    @C09CT("service_type")
    public final Integer serviceType;

    public ServicePluginPlatformBindingCreateApiRequest(String str, String str2, Integer num) {
        this.entityId = str;
        this.platformId = str2;
        this.serviceType = num;
    }
}
