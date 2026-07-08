package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class CohostMatchResumeSetting {
    public static final TypeAdapter ADAPTER;

    @C09CT("enable_cohost_match_resume")
    public int enableMatchResume;

    @C09CT("max_app_exit_duration")
    public int maxAppExitDuration;

    static {
        NormalGson.singleton();
        ADAPTER = new CohostMatchResumeSetting_OptTypeAdapter();
    }

    public CohostMatchResumeSetting() {
        this(1, 27);
    }

    public CohostMatchResumeSetting(int i, int i2) {
        this.enableMatchResume = i;
        this.maxAppExitDuration = i2;
    }
}
