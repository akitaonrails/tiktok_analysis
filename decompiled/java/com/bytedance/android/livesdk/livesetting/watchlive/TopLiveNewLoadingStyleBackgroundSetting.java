package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("toplive_newstyle_loading_background_setting")
public final class TopLiveNewLoadingStyleBackgroundSetting {
    public static final int DEFAULT = 0;
    public static final TopLiveNewLoadingStyleBackgroundSetting INSTANCE;
    public static final int backgroundShowType;

    static {
        TopLiveNewLoadingStyleBackgroundSetting topLiveNewLoadingStyleBackgroundSetting = new TopLiveNewLoadingStyleBackgroundSetting();
        INSTANCE = topLiveNewLoadingStyleBackgroundSetting;
        backgroundShowType = topLiveNewLoadingStyleBackgroundSetting.getValue();
    }

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("toplive_newstyle_loading_background_setting", DEFAULT);
    }

    public final int getBackgroundShowType() {
        return backgroundShowType;
    }
}
