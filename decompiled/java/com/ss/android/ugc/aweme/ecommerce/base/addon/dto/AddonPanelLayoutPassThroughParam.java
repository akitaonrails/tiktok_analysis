package com.ss.android.ugc.aweme.ecommerce.base.addon.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class AddonPanelLayoutPassThroughParam {

    @C09CT("preload_cart_info")
    public final String preloadCartInfo;

    @C09CT("preload_cart_info_req_id")
    public final String preloadCartInfoReqId;

    public AddonPanelLayoutPassThroughParam() {
        this(null, null);
    }

    public AddonPanelLayoutPassThroughParam(String str, String str2) {
        this.preloadCartInfo = str;
        this.preloadCartInfoReqId = str2;
    }
}
