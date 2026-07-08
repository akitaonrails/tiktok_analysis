package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
public final class LiveGiftComboNumberOptConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("big_gift_threshold")
    public int bigGiftThreshold;

    @C09CT("exp")
    public int exp;

    @C09CT("small_gift_threshold")
    public int smallGiftThreshold;

    static {
        NormalGson.singleton();
        ADAPTER = new LiveGiftComboNumberOptConfig_OptTypeAdapter();
    }
}
