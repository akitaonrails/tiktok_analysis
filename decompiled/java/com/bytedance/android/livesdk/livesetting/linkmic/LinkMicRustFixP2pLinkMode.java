package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_fix_p2p_linker_mode")
public final class LinkMicRustFixP2pLinkMode {
    public static final boolean DEFAULT = true;
    public static final LinkMicRustFixP2pLinkMode INSTANCE = new LinkMicRustFixP2pLinkMode();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_fix_p2p_linker_mode", DEFAULT);
    }
}
