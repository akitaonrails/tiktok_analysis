package com.ss.android.ugc.aweme.aigroupshot;

import X.C09CT;
import com.ss.android.ugc.aweme.im.message.content.FakeMsgContent;

/* JADX INFO: loaded from: classes15.dex */
public final class AIGroupShotAddingPhotoFakeContent implements FakeMsgContent {

    @C09CT("msg_type")
    public final int msgType;

    @C09CT("preview_hint")
    public final String previewHint;

    public AIGroupShotAddingPhotoFakeContent() {
        this("", 4051);
    }

    @Override // com.ss.android.ugc.aweme.im.message.content.FakeMsgContent
    public final int getMsgType() {
        return this.msgType;
    }

    public AIGroupShotAddingPhotoFakeContent(String str, int i) {
        this.previewHint = str;
        this.msgType = i;
    }
}
