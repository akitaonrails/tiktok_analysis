package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import com.bytedance.android.livesdkapi.message.CommonMessageData;

/* JADX INFO: loaded from: classes.dex */
public final class ModeratorSpeakerMessage extends AbstractC1136060ffY {
    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public final boolean canText() {
        return true;
    }

    @Override // X.AbstractC1136060ffY
    public final boolean supportDisplayText() {
        CommonMessageData commonMessageData = this.baseMessage;
        return (commonMessageData == null || commonMessageData.displayText == null) ? false : true;
    }

    public ModeratorSpeakerMessage() {
        this.type = C001A.MODERATOR_OPERATE_MESSAGE;
    }
}
