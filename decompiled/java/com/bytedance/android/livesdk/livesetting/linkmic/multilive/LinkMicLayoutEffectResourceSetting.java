package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("linkmic_layout_effect_resource_config")
public final class LinkMicLayoutEffectResourceSetting {
    public static final LinkMicLayoutEffectResourceConfig DEFAULT;
    public static final LinkMicLayoutEffectResourceSetting INSTANCE = new LinkMicLayoutEffectResourceSetting();
    public static final LinkMicLayoutEffectResourceConfig config;

    static {
        LinkMicLayoutEffectResourceConfig linkMicLayoutEffectResourceConfig = new LinkMicLayoutEffectResourceConfig("live_dance", "7592891457921356305");
        DEFAULT = linkMicLayoutEffectResourceConfig;
        LinkMicLayoutEffectResourceConfig linkMicLayoutEffectResourceConfig2 = (LinkMicLayoutEffectResourceConfig) SettingsManager.INSTANCE.getValueSafely("linkmic_layout_effect_resource_config", linkMicLayoutEffectResourceConfig);
        if (linkMicLayoutEffectResourceConfig2 != null) {
            linkMicLayoutEffectResourceConfig = linkMicLayoutEffectResourceConfig2;
        }
        config = linkMicLayoutEffectResourceConfig;
    }

    public final String getPanel() {
        return config.panel;
    }

    public final String getResourceId() {
        return config.resourceId;
    }
}
