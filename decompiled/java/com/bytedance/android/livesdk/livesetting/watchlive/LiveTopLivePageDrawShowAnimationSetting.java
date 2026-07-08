package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("toplive_page_draw_show_animation")
public final class LiveTopLivePageDrawShowAnimationSetting {
    public static final LiveTopLivePageDrawShowAnimationSetting INSTANCE = new LiveTopLivePageDrawShowAnimationSetting();
    public static final String[] DEFAULT = new String[0];

    public final String[] getCurrentValue() {
        return SettingsManager.INSTANCE.getStringArrayValue("toplive_page_draw_show_animation", DEFAULT);
    }
}
