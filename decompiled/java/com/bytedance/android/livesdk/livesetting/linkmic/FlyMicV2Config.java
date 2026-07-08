package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class FlyMicV2Config {
    public static final TypeAdapter ADAPTER = new FlyMicV2Config_OptTypeAdapter(NormalGson.singleton());

    @C09CT("flying_gift_multi_guest_phase_2")
    public boolean isInExperiment;

    @C09CT("flying_gift_multi_guest_delay_strat")
    public boolean shouldUseNewStrat;

    public FlyMicV2Config() {
        this(false, false);
    }

    public final boolean getShouldUseNewStrat() {
        return this.shouldUseNewStrat;
    }

    public final boolean isInExperiment() {
        return this.isInExperiment;
    }

    public final void setInExperiment(boolean z) {
        this.isInExperiment = z;
    }

    public final void setShouldUseNewStrat(boolean z) {
        this.shouldUseNewStrat = z;
    }

    public FlyMicV2Config(boolean z, boolean z2) {
        this.isInExperiment = z;
        this.shouldUseNewStrat = z2;
    }
}
