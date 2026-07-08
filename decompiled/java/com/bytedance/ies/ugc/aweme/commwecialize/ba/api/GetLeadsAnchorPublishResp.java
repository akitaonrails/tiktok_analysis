package com.bytedance.ies.ugc.aweme.commwecialize.ba.api;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public final class GetLeadsAnchorPublishResp {

    @C09CT("anchor_status")
    public final Integer anchor_status;

    @C09CT("page_id")
    public final String pageId;

    @C09CT("status_code")
    public final int statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public GetLeadsAnchorPublishResp(int i, String str, Integer num, String str2) {
        this.statusCode = i;
        this.statusMsg = str;
        this.anchor_status = num;
        this.pageId = str2;
    }
}
