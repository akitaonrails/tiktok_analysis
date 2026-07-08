package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_cohost_dataholder_refactor_binder")
public final class LiveCoHostDataHolderRefactorBinderSetting {
    public static final int DEFAULT = 0;
    public static final LiveCoHostDataHolderRefactorBinderSetting INSTANCE = new LiveCoHostDataHolderRefactorBinderSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_cohost_dataholder_refactor_binder", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue() == 1;
    }
}
