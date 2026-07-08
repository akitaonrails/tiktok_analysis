package com.bytedance.android.livesdk.livesetting.other;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes4.dex */
public final class GamePartnershipPerformanceSample {
    public static final TypeAdapter ADAPTER = new GamePartnershipPerformanceSample_OptTypeAdapter(NormalGson.singleton());

    @C09CT("interval")
    public int interval;

    @C09CT("open")
    public boolean open;

    public GamePartnershipPerformanceSample() {
        this(false, 3);
    }

    public GamePartnershipPerformanceSample(boolean z, int i) {
        this.open = z;
        this.interval = i;
    }
}
