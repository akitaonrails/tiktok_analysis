package com.bytedance.android.livesdk.model.message.ext;

import X.AbstractC1136060ffY;
import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class ECTaskRegisterMessage extends AbstractC1136060ffY {

    @C09CT("message_entity")
    public EcTaskRegisterMessageEntity entity;

    @Override // X.AbstractC1136060ffY, com.ss.ugc.live.sdk.message.data.IMessage
    public final int getIntType() {
        return 100001;
    }
}
