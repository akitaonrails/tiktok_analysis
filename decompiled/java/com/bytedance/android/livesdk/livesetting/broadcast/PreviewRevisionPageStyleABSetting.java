package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "go_live_page_style")
public final class PreviewRevisionPageStyleABSetting {
    public static final int DEFAULT = 0;
    public static final PreviewRevisionPageStyleABSetting INSTANCE = new PreviewRevisionPageStyleABSetting();

    public final boolean isMatch() {
        return SettingsManager.INSTANCE.getIntValue("go_live_page_style", DEFAULT) != 0;
    }

    public final boolean isStrongPackage() {
        return SettingsManager.INSTANCE.getIntValue("go_live_page_style", DEFAULT) == 1;
    }

    public final boolean isWeakPackage() {
        return SettingsManager.INSTANCE.getIntValue("go_live_page_style", DEFAULT) == 2;
    }

    public final int pageStyle() {
        return SettingsManager.INSTANCE.getIntValue("go_live_page_style", DEFAULT);
    }
}
