package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveQuickReturnOptSettingConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("delay_time")
    public int delayTime;

    @C09CT("expire_time")
    public long expireTime;

    @C09CT("mock_status_code")
    public int mockStatusCode;

    static {
        NormalGson.singleton();
        ADAPTER = new LiveQuickReturnOptSettingConfig_OptTypeAdapter();
    }
}
