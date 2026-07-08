package com.ss.android.ugc.aweme.serviceplugin.entity;

import X.C09CT;

/* JADX INFO: loaded from: classes13.dex */
public final class ServicePluginBindingCreateResponse {

    @C09CT("status_code")
    public final int code;

    @C09CT("is_binding_created")
    public final Boolean isBindingCreated;

    @C09CT("status_msg")
    public final String message;

    public ServicePluginBindingCreateResponse(int i, String str, Boolean bool) {
        this.code = i;
        this.message = str;
        this.isBindingCreated = bool;
    }
}
