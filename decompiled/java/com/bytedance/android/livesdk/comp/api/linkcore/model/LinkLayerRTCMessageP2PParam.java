package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C09CT;

/* JADX INFO: loaded from: classes16.dex */
public final class LinkLayerRTCMessageP2PParam {

    @C09CT("interact_id")
    public String linkMicId;

    public LinkLayerRTCMessageP2PParam() {
        this("");
    }

    public LinkLayerRTCMessageP2PParam(String str) {
        this.linkMicId = str;
    }

    public final void setLinkMicId(String str) {
        this.linkMicId = str;
    }
}
