package com.bytedance.android.livesdk.broadcast.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ttls_push_event_opt")
public final class TTLSPushEventInterceptor {
    public static final TTLSPushEventInterceptor INSTANCE = new TTLSPushEventInterceptor();
    public static final String[] DEFAULT = new String[0];

    public final String[] strings() {
        return SettingsManager.INSTANCE.getStringArrayValue("ttls_push_event_opt", DEFAULT);
    }

    public final String[] getDEFAULT() {
        return DEFAULT;
    }
}
