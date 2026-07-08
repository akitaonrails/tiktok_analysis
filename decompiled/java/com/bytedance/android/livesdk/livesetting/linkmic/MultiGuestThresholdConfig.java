package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import X.C1697810uHb;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class MultiGuestThresholdConfig {
    public static final TypeAdapter ADAPTER = new MultiGuestThresholdConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("max_coins")
    public int maxCoins;

    @C09CT("options")
    public List<Integer> options;

    public MultiGuestThresholdConfig() {
        this(C1697810uHb.LJIIJJI(1, 5, 10, 30, 50), 39999);
    }

    public MultiGuestThresholdConfig(List<Integer> list, int i) {
        this.options = list;
        this.maxCoins = i;
    }
}
