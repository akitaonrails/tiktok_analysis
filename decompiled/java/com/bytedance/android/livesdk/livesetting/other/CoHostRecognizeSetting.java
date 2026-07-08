package com.bytedance.android.livesdk.livesetting.other;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class CoHostRecognizeSetting {
    public static final TypeAdapter ADAPTER = new CoHostRecognizeSetting_OptTypeAdapter(NormalGson.singleton());

    @C09CT("isLog")
    public boolean isLog;

    @C09CT("isNewCheck")
    public boolean isNewCheck;

    public CoHostRecognizeSetting() {
        this(false, true);
    }

    public CoHostRecognizeSetting(boolean z, boolean z2) {
        this.isLog = z;
        this.isNewCheck = z2;
    }
}
