package com.bytedance.android.livesdk.game.broadcast.dualdevice.message;

import X.C09CT;
import X.EnumC742780TBs;

/* JADX INFO: loaded from: classes13.dex */
public final class DualAckMessage extends DualBaseMessage {

    @C09CT("ack_id")
    public long ackId;

    @Override // com.bytedance.android.livesdk.game.broadcast.dualdevice.message.DualBaseMessage
    public final int LIZ() {
        return EnumC742780TBs.DUAL_ACK_MESSAGE.getMessageType();
    }
}
