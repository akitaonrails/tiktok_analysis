package com.bytedance.android.livesdk.game.broadcast.dualdevice.message;

import X.C09CT;
import X.EnumC742780TBs;

/* JADX INFO: loaded from: classes13.dex */
public final class DualSourceStateMessage extends DualBaseMessage {

    @C09CT("camera_state")
    public int cameraState;

    @C09CT("connect_state")
    public int connectState;

    @Override // com.bytedance.android.livesdk.game.broadcast.dualdevice.message.DualBaseMessage
    public final int LIZ() {
        return EnumC742780TBs.DUAL_SOURCE_STATE_MESSAGE.getMessageType();
    }
}
