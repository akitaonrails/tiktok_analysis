package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_link_injector_scope_optimize")
public final class LinkMicLinkInjectorScopeOptimizeSetting {
    public static final boolean DEFAULT = false;
    public static final LinkMicLinkInjectorScopeOptimizeSetting INSTANCE = new LinkMicLinkInjectorScopeOptimizeSetting();

    public static final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_link_injector_scope_optimize", DEFAULT);
    }
}
