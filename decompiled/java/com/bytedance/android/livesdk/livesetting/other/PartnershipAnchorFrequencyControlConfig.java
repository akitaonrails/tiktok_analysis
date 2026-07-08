package com.bytedance.android.livesdk.livesetting.other;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class PartnershipAnchorFrequencyControlConfig {
    public static final TypeAdapter ADAPTER = new PartnershipAnchorFrequencyControlConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enabled")
    public boolean enable;

    @C09CT("max_impression")
    public int maxCountLimit;

    @C09CT("psp_enabled")
    public boolean pspEnable;

    public PartnershipAnchorFrequencyControlConfig() {
        this(false, 10, false);
    }

    public PartnershipAnchorFrequencyControlConfig(boolean z, int i, boolean z2) {
        this.enable = z;
        this.maxCountLimit = i;
        this.pspEnable = z2;
    }
}
