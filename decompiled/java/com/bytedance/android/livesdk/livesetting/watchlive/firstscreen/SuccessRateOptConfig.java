package com.bytedance.android.livesdk.livesetting.watchlive.firstscreen;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
public final class SuccessRateOptConfig {
    public static final TypeAdapter ADAPTER = new SuccessRateOptConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("isAllPreConn")
    public boolean isAllPreConn;

    @C09CT("isEnabled")
    public boolean isEnabled;

    @C09CT("enableByPredict")
    public boolean predictionEnabled;

    public SuccessRateOptConfig() {
        this(false, false, false);
    }

    public SuccessRateOptConfig(boolean z, boolean z2, boolean z3) {
        this.isEnabled = z;
        this.isAllPreConn = z2;
        this.predictionEnabled = z3;
    }
}
