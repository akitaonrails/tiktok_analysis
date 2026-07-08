package com.bytedance.android.livesdk.model.message.redenvelope;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon;

/* JADX INFO: loaded from: classes.dex */
public final class RedEnvelopMessage extends AbstractC1136060ffY {
    public boolean LL;

    @C09CT("display")
    public int display;

    @C09CT("envelope_info")
    public MessageRedEnvelopInfo envelopeInfo;

    @C09CT("public_area_msg_common")
    public PublicAreaMessageCommon publicAreaMsgCommon;

    @Override // X.AbstractC1136060ffY
    public final boolean supportDisplayText() {
        return true;
    }

    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public final boolean canText() {
        int i = this.display;
        return (i == 1 || i == 3) && this.LL;
    }

    public RedEnvelopMessage() {
        this.type = C001A.RED_ENVELOPE_MESSAGE;
        this.LL = true;
    }
}
