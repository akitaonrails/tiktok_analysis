package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_cohost_dataholder_refactor_reset_opt")
public final class LiveCoHostDataHolderRefactorResetOptSetting {
    public static final LiveCoHostDataHolderRefactorResetOptSetting INSTANCE = new LiveCoHostDataHolderRefactorResetOptSetting();
    public static final int DEFAULT = 1;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_cohost_dataholder_refactor_reset_opt", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue() == 1;
    }
}
