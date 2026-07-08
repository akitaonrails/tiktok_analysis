package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_text_view_init_warmup_opt")
public final class LiveTextViewViewInitWarmUpOpt {
    public static final boolean DEFAULT = false;
    public static final LiveTextViewViewInitWarmUpOpt INSTANCE = new LiveTextViewViewInitWarmUpOpt();

    public static /* synthetic */ void getEnable$annotations() {
    }

    public static final boolean getEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_text_view_init_warmup_opt", DEFAULT);
    }
}
