package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("integrate_vw_into_liveboard")
public final class LiveViewerWishesBillboardEnableSetting {
    public static final boolean DEFAULT = false;
    public static final LiveViewerWishesBillboardEnableSetting INSTANCE = new LiveViewerWishesBillboardEnableSetting();

    public final boolean enabled() {
        return SettingsManager.INSTANCE.getBooleanValue("integrate_vw_into_liveboard", DEFAULT);
    }
}
