package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class AddNotReceiveFirstFrameExpConf {
    public static final TypeAdapter ADAPTER = new AddNotReceiveFirstFrameExpConf_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable")
    public boolean enable;

    @C09CT("report_when_not_reach_frame_linked")
    public boolean reportWhenNotReachFrameLinked;

    @C09CT("time_out")
    public long timeOUt;

    public AddNotReceiveFirstFrameExpConf() {
        this(true, 180L, true);
    }

    public AddNotReceiveFirstFrameExpConf(boolean z, long j, boolean z2) {
        this.enable = z;
        this.timeOUt = j;
        this.reportWhenNotReachFrameLinked = z2;
    }
}
