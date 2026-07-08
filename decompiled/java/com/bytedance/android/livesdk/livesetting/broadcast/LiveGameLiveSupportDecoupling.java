package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_game_live_support_decoupling")
public final class LiveGameLiveSupportDecoupling {
    public static final boolean DEFAULT = true;
    public static final LiveGameLiveSupportDecoupling INSTANCE = new LiveGameLiveSupportDecoupling();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_game_live_support_decoupling", DEFAULT);
    }
}
