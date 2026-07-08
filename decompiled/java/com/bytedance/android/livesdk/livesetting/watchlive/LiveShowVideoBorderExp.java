package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_show_video_border_exp")
public final class LiveShowVideoBorderExp {
    public static final boolean DEFAULT = false;
    public static final LiveShowVideoBorderExp INSTANCE = new LiveShowVideoBorderExp();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_show_video_border_exp", DEFAULT);
    }

    public final boolean disable() {
        return !getValue();
    }
}
