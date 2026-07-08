package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_cohost_dataholder_refactor")
public final class LiveCoHostDataHolderRefactorSetting {
    public static final int DEFAULT = 0;
    public static final LiveCoHostDataHolderRefactorSetting INSTANCE = new LiveCoHostDataHolderRefactorSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_cohost_dataholder_refactor", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue() == 1;
    }
}
