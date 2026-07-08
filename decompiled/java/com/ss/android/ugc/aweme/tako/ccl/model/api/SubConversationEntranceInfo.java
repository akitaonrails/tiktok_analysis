package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class SubConversationEntranceInfo {

    @C09CT("conv_info")
    public final SubConversationConfig conversationInfo;

    @C09CT("sub_conv_id")
    public final String subConversationId;

    @C09CT("sub_conv_type")
    public final Integer subConversationType;

    @C09CT("unread_message")
    public final String unreadMsgId;

    public SubConversationEntranceInfo() {
        this(null, null, null, null);
    }

    public SubConversationEntranceInfo(SubConversationConfig subConversationConfig, String str, String str2, Integer num) {
        this.conversationInfo = subConversationConfig;
        this.subConversationId = str;
        this.unreadMsgId = str2;
        this.subConversationType = num;
    }
}
