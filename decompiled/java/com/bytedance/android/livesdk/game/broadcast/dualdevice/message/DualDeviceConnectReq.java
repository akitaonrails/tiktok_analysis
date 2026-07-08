package com.bytedance.android.livesdk.game.broadcast.dualdevice.message;

import X.C09CT;
import X.EnumC742780TBs;

/* JADX INFO: loaded from: classes13.dex */
public final class DualDeviceConnectReq extends DualBaseMessage {

    @C09CT("connect_type")
    public String connectType;

    @C09CT("did_source")
    public String didSource;

    @C09CT("source_device_name")
    public String sourceDeviceName;

    @Override // com.bytedance.android.livesdk.game.broadcast.dualdevice.message.DualBaseMessage
    public final int LIZ() {
        return EnumC742780TBs.DUAL_DEVICE_CONNECT_REQ.getMessageType();
    }
}
