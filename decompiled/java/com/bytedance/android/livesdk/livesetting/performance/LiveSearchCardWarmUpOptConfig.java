package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
public final class LiveSearchCardWarmUpOptConfig {
    public static final TypeAdapter ADAPTER = new LiveSearchCardWarmUpOptConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("ec_card_warm_up")
    public boolean ecCardWarmUp;

    @C09CT("enable")
    public boolean enable;

    @C09CT("mix_card_warm_up")
    public boolean mixCardWarmUp;

    @C09CT("other_warm_up")
    public boolean otherWarmUp;
}
