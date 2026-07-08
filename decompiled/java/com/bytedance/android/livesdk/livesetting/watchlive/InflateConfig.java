package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class InflateConfig {
    public static final TypeAdapter ADAPTER = new InflateConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable")
    public boolean enable;

    @C09CT("gcBlockOpt")
    public boolean enableGcBlockOpt;

    @C09CT("enlargeCapacity")
    public boolean enlargeCapacity;

    public InflateConfig() {
        this(false, false, false);
    }

    public InflateConfig(boolean z, boolean z2, boolean z3) {
        this.enable = z;
        this.enableGcBlockOpt = z2;
        this.enlargeCapacity = z3;
    }
}
