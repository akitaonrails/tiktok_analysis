package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("bug_fix_layout_container_layer_setting")
public final class BugFixLayoutContainerLayerSetting {
    public static final int DEFAULT = 1;
    public static final BugFixLayoutContainerLayerSetting INSTANCE = new BugFixLayoutContainerLayerSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("bug_fix_layout_container_layer_setting", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue() == 1;
    }
}
