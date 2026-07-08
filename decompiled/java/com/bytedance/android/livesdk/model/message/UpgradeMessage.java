package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.message.CommonMessageData;

/* JADX INFO: loaded from: classes.dex */
public final class UpgradeMessage extends AbstractC1136060ffY {
    public User LL;

    @C09CT("text")
    public Text text;

    @Override // X.AbstractC1136060ffY
    public final boolean supportDisplayText() {
        return true;
    }

    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public final boolean canText() {
        CommonMessageData commonMessageData = this.baseMessage;
        return (commonMessageData == null || commonMessageData.displayText == null) ? false : true;
    }

    public UpgradeMessage() {
        this.type = C001A.UPGRADE_MESSAGE;
    }

    public UpgradeMessage(boolean z) {
        this.isLocalInsertMsg = z;
        this.type = C001A.UPGRADE_MESSAGE;
    }
}
