package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("PushParamsStoreInvalidOptSetting")
public final class PushParamsStoreInvalidOptSetting {
    public static final boolean DEFAULT = true;
    public static final PushParamsStoreInvalidOptSetting INSTANCE = new PushParamsStoreInvalidOptSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("PushParamsStoreInvalidOptSetting", DEFAULT);
    }
}
