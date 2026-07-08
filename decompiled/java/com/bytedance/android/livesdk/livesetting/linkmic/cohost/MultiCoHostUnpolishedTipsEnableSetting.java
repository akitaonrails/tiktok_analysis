package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_cohost_unpolished_tips_enable")
public final class MultiCoHostUnpolishedTipsEnableSetting {
    public static final boolean DEFAULT = false;
    public static final MultiCoHostUnpolishedTipsEnableSetting INSTANCE = new MultiCoHostUnpolishedTipsEnableSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_cohost_unpolished_tips_enable", DEFAULT);
    }
}
