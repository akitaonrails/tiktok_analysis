package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("linkmic_sdk_union_linker_mode_opt")
public final class LinkMicSdkUnionLinkerModeOpt {
    public static final boolean DEFAULT = true;
    public static final LinkMicSdkUnionLinkerModeOpt INSTANCE = new LinkMicSdkUnionLinkerModeOpt();

    public static final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_sdk_union_linker_mode_opt", DEFAULT);
    }
}
