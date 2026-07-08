package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("gift_use_composition_render_config")
public final class GiftUseCompositionRenderConfig {
    public static final GiftUseCompositionRenderConfig INSTANCE = new GiftUseCompositionRenderConfig();
    public static final long DEFAULT = 120000;

    public final long getCompositionTimeOutInMs() {
        return SettingsManager.INSTANCE.getLongValue("gift_use_composition_render_config", DEFAULT);
    }

    public final long getDEFAULT() {
        return DEFAULT;
    }
}
