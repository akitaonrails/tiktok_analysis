package com.ss.android.ugc.aweme.im.sdk.chat.feature.translation;

import X.C09CT;
import com.ss.android.ugc.aweme.im.message.content.FakeMsgContent;

/* JADX INFO: loaded from: classes36.dex */
public final class IMTextTranslationInlineTurnOnAutoTranslateContent implements FakeMsgContent {

    @C09CT("msg_type")
    public final int msgType;

    public IMTextTranslationInlineTurnOnAutoTranslateContent() {
        this(4063);
    }

    @Override // com.ss.android.ugc.aweme.im.message.content.FakeMsgContent
    public final int getMsgType() {
        return this.msgType;
    }

    public IMTextTranslationInlineTurnOnAutoTranslateContent(int i) {
        this.msgType = i;
    }
}
