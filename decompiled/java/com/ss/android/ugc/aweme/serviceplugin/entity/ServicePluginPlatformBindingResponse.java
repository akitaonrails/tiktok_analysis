package com.ss.android.ugc.aweme.serviceplugin.entity;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class ServicePluginPlatformBindingResponse {

    @C09CT("status_code")
    public final int code;

    @C09CT("status_msg")
    public final String message;

    @C09CT("platform_binding_details")
    public final List<ServicePluginPlatformBindingDetail> platformDetails;

    @C09CT("text_list")
    public final List<ServicePluginPageText> textList;

    public ServicePluginPlatformBindingResponse(int i, String str, List<ServicePluginPageText> list, List<ServicePluginPlatformBindingDetail> list2) {
        this.code = i;
        this.message = str;
        this.textList = list;
        this.platformDetails = list2;
    }
}
