package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_take_stage_window_bg_outline_expand_setting")
public final class TakeStageWindowBgOutlineExpandSetting {
    public static final TakeStageWindowBgOutlineExpandSetting INSTANCE = new TakeStageWindowBgOutlineExpandSetting();
    public static final int DEFAULT = 0;
    public static int value = SettingsManager.INSTANCE.getIntValue("live_take_stage_window_bg_outline_expand_setting", DEFAULT);

    public final boolean isEnable() {
        return value > 0;
    }
}
