package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class HammerParams {
    public static final TypeAdapter ADAPTER = new HammerParams_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enabled")
    public boolean enabled;

    @C09CT("min_combo_price")
    public int minComboPrice;

    @C09CT("min_hammer_price")
    public int minHammerPrice;

    public HammerParams() {
        this(false, 0, 0);
    }

    public HammerParams(boolean z, int i, int i2) {
        this.enabled = z;
        this.minHammerPrice = i;
        this.minComboPrice = i2;
    }
}
