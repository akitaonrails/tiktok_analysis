package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_tooltip_alog_setting")
public final class LiveTooltipAlogSetting {
    public static final LiveTooltipAlogSetting INSTANCE = new LiveTooltipAlogSetting();
    public static final LiveTooltip DEFAULT = new LiveTooltip();

    public final LiveTooltip getValue() {
        return (LiveTooltip) SettingsManager.INSTANCE.getValueSafely("live_tooltip_alog_setting", DEFAULT);
    }

    public final int getToolbarBehaviorDelay() {
        LiveTooltip value = getValue();
        if (value != null) {
            return value.shareToolbarBehaviorDelay;
        }
        return 0;
    }
}
