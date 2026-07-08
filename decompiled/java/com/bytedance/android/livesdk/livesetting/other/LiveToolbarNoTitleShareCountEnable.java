package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_toolbar_no_title_share_count_enable_v1")
public final class LiveToolbarNoTitleShareCountEnable {
    public static final boolean DEFAULT = false;
    public static final LiveToolbarNoTitleShareCountEnable INSTANCE = new LiveToolbarNoTitleShareCountEnable();

    public final boolean isEnable() {
        LiveToolbarUIConfigOpt liveToolbarUIConfigOpt = LiveToolbarUIConfigOpt.INSTANCE;
        return liveToolbarUIConfigOpt.shareWithText() || liveToolbarUIConfigOpt.shareWithTextOpt();
    }
}
