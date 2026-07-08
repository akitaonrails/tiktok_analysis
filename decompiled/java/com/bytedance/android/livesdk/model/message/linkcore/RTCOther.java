package com.bytedance.android.livesdk.model.message.linkcore;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class RTCOther {

    @C09CT("max_transcoding_cb_interval_second")
    public int transCodingSecond;

    public RTCOther() {
        this(0);
    }

    public RTCOther(int i) {
        this.transCodingSecond = i;
    }
}
