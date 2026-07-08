package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_sheet_fix_title_margin_setting")
public final class LiveSheetFixTitleMarginSetting {
    public static final boolean DEFAULT = true;
    public static final LiveSheetFixTitleMarginSetting INSTANCE = new LiveSheetFixTitleMarginSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_sheet_fix_title_margin_setting", DEFAULT);
    }
}
