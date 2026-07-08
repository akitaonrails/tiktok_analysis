package com.bytedance.android.livesdk.livesetting.feed;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("toplive_guarantee_data_enter_opt")
public final class TopliveGuaranteeDataEnterOpt {
    public static final boolean DEFAULT = false;
    public static final TopliveGuaranteeDataEnterOpt INSTANCE = new TopliveGuaranteeDataEnterOpt();

    public final boolean getConfig() {
        return SettingsManager.INSTANCE.getBooleanValue("toplive_guarantee_data_enter_opt", DEFAULT);
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }
}
