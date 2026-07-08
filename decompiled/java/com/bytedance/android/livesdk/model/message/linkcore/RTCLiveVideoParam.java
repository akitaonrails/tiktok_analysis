package com.bytedance.android.livesdk.model.message.linkcore;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class RTCLiveVideoParam {

    @C09CT("params")
    public RTCVideoParam serverDefineParam;

    @C09CT("strategy_id")
    public int strategyId;

    public RTCLiveVideoParam() {
        this(0, null);
    }

    public RTCLiveVideoParam(int i, RTCVideoParam rTCVideoParam) {
        this.strategyId = i;
        this.serverDefineParam = rTCVideoParam;
    }
}
