package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("cohost_layout_extra_decode_opt")
public final class CoHostLayoutExtraDecodeOpt {
    public static final boolean DEFAULT = true;
    public static final CoHostLayoutExtraDecodeOpt INSTANCE = new CoHostLayoutExtraDecodeOpt();

    public static final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("cohost_layout_extra_decode_opt", DEFAULT);
    }
}
