package com.bytedance.android.livesdk.livesetting.feed;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("toplive_reuse_skylight_req_opt")
public final class TopliveReuseSkylightDataOptReqSetting {
    public static final boolean DEFAULT = false;
    public static final TopliveReuseSkylightDataOptReqSetting INSTANCE = new TopliveReuseSkylightDataOptReqSetting();

    public final boolean getConfig() {
        return SettingsManager.INSTANCE.getBooleanValue("toplive_reuse_skylight_req_opt", DEFAULT);
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }
}
