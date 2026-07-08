package com.bytedance.android.livesdk.livesetting.redenvelope;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_treasurebox_interface_optimization_enable_post")
public final class GetTreasureBoxListOptEnablePost {
    public static final boolean DEFAULT = false;
    public static final GetTreasureBoxListOptEnablePost INSTANCE = new GetTreasureBoxListOptEnablePost();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_treasurebox_interface_optimization_enable_post", DEFAULT);
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }
}
