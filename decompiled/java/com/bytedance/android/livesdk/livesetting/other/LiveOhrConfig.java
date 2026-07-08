package com.bytedance.android.livesdk.livesetting.other;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveOhrConfig {
    public static final TypeAdapter ADAPTER = new LiveOhrConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("ohr_predict_enable")
    public boolean ohrPredictEnable;

    public LiveOhrConfig() {
        this(false);
    }

    public LiveOhrConfig(boolean z) {
        this.ohrPredictEnable = z;
    }
}
