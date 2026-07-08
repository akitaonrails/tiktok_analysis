package com.bytedance.android.livesdk.livesetting.subscription;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = true, value = "live_pcs_client_ai_anchor_opt_in_enable")
public final class LivePCSAnchorTitleAnaliseWithAIPreciseSetting {
    public static final boolean DEFAULT = false;
    public static final LivePCSAnchorTitleAnaliseWithAIPreciseSetting INSTANCE = new LivePCSAnchorTitleAnaliseWithAIPreciseSetting();

    private final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_pcs_client_ai_anchor_opt_in_enable", DEFAULT);
    }

    public final boolean isEnabled() {
        return getValue();
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }
}
