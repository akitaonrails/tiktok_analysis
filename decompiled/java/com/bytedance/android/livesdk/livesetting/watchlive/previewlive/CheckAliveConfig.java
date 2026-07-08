package com.bytedance.android.livesdk.livesetting.watchlive.previewlive;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
public final class CheckAliveConfig {
    public static final TypeAdapter ADAPTER = new CheckAliveConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("disable_live_end")
    public boolean disableLiveEnd;

    @C09CT("disable_no_stream")
    public boolean disableNoStream;

    @C09CT("disable_nr")
    public boolean disableNr;

    @C09CT("disable_pause")
    public boolean disablePause;

    public CheckAliveConfig() {
        this(false, false, false, false);
    }

    public CheckAliveConfig(boolean z, boolean z2, boolean z3, boolean z4) {
        this.disableLiveEnd = z;
        this.disableNr = z2;
        this.disablePause = z3;
        this.disableNoStream = z4;
    }
}
