package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_follow_draw_show_animation")
public final class LiveDrawShowAnimationSetting {
    public static final LiveDrawShowAnimationSetting INSTANCE = new LiveDrawShowAnimationSetting();
    public static final String[] DEFAULT = new String[0];

    public final String[] getCurrentValue() {
        return SettingsManager.INSTANCE.getStringArrayValue("live_follow_draw_show_animation", DEFAULT);
    }
}
