package com.ss.android.ugc.aweme.ecommerce.base.addon.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class GetAddonPanelResponse {

    @C09CT("code")
    public final Integer code;

    @C09CT("data")
    public final GetAddonPanelLayoutResponseData data;

    @C09CT("message")
    public final String message;

    public GetAddonPanelResponse(Integer num, String str, GetAddonPanelLayoutResponseData getAddonPanelLayoutResponseData) {
        this.code = num;
        this.message = str;
        this.data = getAddonPanelLayoutResponseData;
    }
}
