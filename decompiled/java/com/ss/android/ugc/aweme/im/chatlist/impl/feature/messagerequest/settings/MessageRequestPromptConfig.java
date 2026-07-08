package com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes15.dex */
public final class MessageRequestPromptConfig {

    @C09CT("chat_banner")
    public final MessageRequestPromptData chatInlineMsgPromptData;

    @C09CT("inbox_banner")
    public final MessageRequestPromptData inboxBannerPromptData;

    @C09CT("is_enable")
    public final Boolean isEnable;

    @C09CT("message_request_banner")
    public final MessageRequestPromptData messageRequestBannerPromptData;

    public MessageRequestPromptConfig() {
        this(Boolean.FALSE, null, null, null);
    }

    public MessageRequestPromptConfig(Boolean bool, MessageRequestPromptData messageRequestPromptData, MessageRequestPromptData messageRequestPromptData2, MessageRequestPromptData messageRequestPromptData3) {
        this.isEnable = bool;
        this.inboxBannerPromptData = messageRequestPromptData;
        this.messageRequestBannerPromptData = messageRequestPromptData2;
        this.chatInlineMsgPromptData = messageRequestPromptData3;
    }
}
