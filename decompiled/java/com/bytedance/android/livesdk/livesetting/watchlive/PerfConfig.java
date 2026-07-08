package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class PerfConfig {
    public static final TypeAdapter ADAPTER = new PerfConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enableInflaterOpt")
    public boolean enableInflaterOpt;

    @C09CT("enableMemClean")
    public boolean enableMemClean;

    public PerfConfig() {
        this(false, false);
    }

    public PerfConfig(boolean z, boolean z2) {
        this.enableInflaterOpt = z;
        this.enableMemClean = z2;
    }
}
