package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;

/* JADX INFO: loaded from: classes23.dex */
public final class GroupLayoutDataRequestBody {

    @C09CT("conv_short_id")
    public final Long conversationShortId;

    @C09CT("layout_opt")
    public final QRCodeGroupChatLayoutOpt layoutOpt;

    public GroupLayoutDataRequestBody() {
        this(null, null);
    }

    public GroupLayoutDataRequestBody(Long l, QRCodeGroupChatLayoutOpt qRCodeGroupChatLayoutOpt) {
        this.conversationShortId = l;
        this.layoutOpt = qRCodeGroupChatLayoutOpt;
    }
}
