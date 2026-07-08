package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_use_std_error_ui_for_new_biz")
public final class LiveUseStdErrorUIForNewBizSetting {
    public static final boolean DEFAULT = false;
    public static final LiveUseStdErrorUIForNewBizSetting INSTANCE = new LiveUseStdErrorUIForNewBizSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_use_std_error_ui_for_new_biz", DEFAULT);
    }
}
