package com.bytedance.android.livesdk.game.broadcast.dualdevice.message;

import X.C09CT;
import X.EnumC742780TBs;

/* JADX INFO: loaded from: classes13.dex */
public final class DualDeviceRejectMessage extends DualBaseMessage {

    @C09CT("invite_id")
    public String inviteId = "";

    @C09CT("source_did")
    public String sourceDid = "";

    @C09CT("source_device_name")
    public String sourceDeviceName = "";

    @Override // com.bytedance.android.livesdk.game.broadcast.dualdevice.message.DualBaseMessage
    public final int LIZ() {
        return EnumC742780TBs.DUAL_DEVICE_REJECT_MESSAGE.getMessageType();
    }
}
