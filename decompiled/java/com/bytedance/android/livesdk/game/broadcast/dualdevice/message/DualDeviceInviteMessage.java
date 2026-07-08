package com.bytedance.android.livesdk.game.broadcast.dualdevice.message;

import X.C09CT;
import X.EnumC742780TBs;

/* JADX INFO: loaded from: classes13.dex */
public final class DualDeviceInviteMessage extends DualBaseMessage {

    @C09CT("version_code")
    public int versionCode;

    @C09CT("sink_did")
    public String sinkDid = "";

    @C09CT("sink_device_name")
    public String sinkDeviceName = "";

    @C09CT("invite_id")
    public String inviteId = "";

    @C09CT("sink_platform")
    public String sinkPlatform = "";

    @Override // com.bytedance.android.livesdk.game.broadcast.dualdevice.message.DualBaseMessage
    public final int LIZ() {
        return EnumC742780TBs.DUAL_DEVICE_INVITE_MESSAGE.getMessageType();
    }
}
