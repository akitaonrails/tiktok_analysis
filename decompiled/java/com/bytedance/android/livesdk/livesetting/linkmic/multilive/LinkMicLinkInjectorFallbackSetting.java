package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_link_injector_fallback_setting")
public final class LinkMicLinkInjectorFallbackSetting {
    public static final boolean DEFAULT = false;
    public static final LinkMicLinkInjectorFallbackSetting INSTANCE = new LinkMicLinkInjectorFallbackSetting();

    public static final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_link_injector_fallback_setting", DEFAULT);
    }
}
