package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_cohost_dataholder_refactor_binder_set_opt")
public final class LiveCoHostDataHolderRefactorBinderSetSetting {
    public static final int DEFAULT = 0;
    public static final LiveCoHostDataHolderRefactorBinderSetSetting INSTANCE = new LiveCoHostDataHolderRefactorBinderSetSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_cohost_dataholder_refactor_binder_set_opt", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue() == 1;
    }
}
