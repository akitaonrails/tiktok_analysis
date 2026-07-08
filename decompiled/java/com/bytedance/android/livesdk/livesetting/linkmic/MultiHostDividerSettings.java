package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes4.dex */
@SettingsKey("multi_host_divider_conf")
public final class MultiHostDividerSettings {
    public static final MultiHostDividerSettings INSTANCE = new MultiHostDividerSettings();
    public static final MultiHostDividerSettingsConf DEFAULT = new MultiHostDividerSettingsConf(false);

    public final MultiHostDividerSettingsConf getValue() {
        MultiHostDividerSettingsConf multiHostDividerSettingsConf = (MultiHostDividerSettingsConf) SettingsManager.INSTANCE.getValueSafely(MultiHostDividerSettings.class);
        return multiHostDividerSettingsConf == null ? DEFAULT : multiHostDividerSettingsConf;
    }
}
