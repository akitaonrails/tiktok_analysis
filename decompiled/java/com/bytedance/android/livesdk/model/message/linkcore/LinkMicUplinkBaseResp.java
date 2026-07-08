package com.bytedance.android.livesdk.model.message.linkcore;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public class LinkMicUplinkBaseResp {

    @C09CT("common_resp")
    public LinkMicCommonResp commonResp;

    public LinkMicUplinkBaseResp() {
        this(null);
    }

    public LinkMicUplinkBaseResp(LinkMicCommonResp linkMicCommonResp) {
        this.commonResp = linkMicCommonResp;
    }
}
