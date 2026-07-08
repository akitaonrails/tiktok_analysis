package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class BatchConfig {
    public static final TypeAdapter ADAPTER = new BatchConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("batchMs")
    public long batchMs;

    @C09CT("enable")
    public boolean enable;

    @C09CT("enablePullOpt")
    public boolean enablePullOpt;

    @C09CT("enableReleaseLinkOpt")
    public boolean enableReleaseLinkOpt;

    public BatchConfig() {
        this(false, false, 50L, false);
    }

    public BatchConfig(boolean z, boolean z2, long j, boolean z3) {
        this.enable = z;
        this.enableReleaseLinkOpt = z2;
        this.batchMs = j;
        this.enablePullOpt = z3;
    }
}
