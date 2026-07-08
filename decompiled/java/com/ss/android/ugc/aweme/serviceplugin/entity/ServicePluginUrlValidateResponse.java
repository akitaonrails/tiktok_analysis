package com.ss.android.ugc.aweme.serviceplugin.entity;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class ServicePluginUrlValidateResponse {

    @C09CT("status_code")
    public final int code;

    @C09CT("entity_id")
    public final String entityId;

    @C09CT("is_bindable")
    public final Boolean isBindable;

    @C09CT("status_msg")
    public final String message;

    @C09CT("text_list")
    public final List<ServicePluginPageText> textList;

    public ServicePluginUrlValidateResponse(int i, String str, Boolean bool, String str2, List<ServicePluginPageText> list) {
        this.code = i;
        this.message = str;
        this.isBindable = bool;
        this.entityId = str2;
        this.textList = list;
    }
}
