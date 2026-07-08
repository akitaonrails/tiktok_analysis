package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("layout_biz_config_read_source_setting")
public final class LayoutBizConfigReadSourceSetting {
    public static final int DEFAULT = 1;
    public static final LayoutBizConfigReadSourceSetting INSTANCE = new LayoutBizConfigReadSourceSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("layout_biz_config_read_source_setting", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue() == 1;
    }
}
