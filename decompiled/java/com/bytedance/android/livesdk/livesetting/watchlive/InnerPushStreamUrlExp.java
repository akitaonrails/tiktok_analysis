package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = true, value = "inner_push_stream_url_exp")
public final class InnerPushStreamUrlExp {
    public static final boolean DEFAULT = false;
    public static final InnerPushStreamUrlExp INSTANCE = new InnerPushStreamUrlExp();
    public static final boolean V2 = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("inner_push_stream_url_exp", DEFAULT);
    }
}
