package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "link_mic_resolution_demand_rule")
public final class LinkMicResolutionDemandRuleSetting {
    public static final LinkMicResolutionDemandRuleSetting INSTANCE = new LinkMicResolutionDemandRuleSetting();
    public static final LinkMicResolutionDemandRuleConfig DEFAULT = new LinkMicResolutionDemandRuleConfig(false, null, null, false, false, 0.0d, 63, null);

    private final LinkMicResolutionDemandRuleConfig getConfig() {
        LinkMicResolutionDemandRuleConfig linkMicResolutionDemandRuleConfig = (LinkMicResolutionDemandRuleConfig) SettingsManager.INSTANCE.getValueSafely(LinkMicResolutionDemandRuleSetting.class);
        return linkMicResolutionDemandRuleConfig == null ? DEFAULT : linkMicResolutionDemandRuleConfig;
    }

    public final double getDemandTriggerRatioThreshold() {
        return getConfig().getDemandTriggerRatioThreshold();
    }

    public final List<String> getLayoutBlackList() {
        return getConfig().getLayoutBlackList();
    }

    public final List<String> getLayoutWhiteList() {
        return getConfig().getLayoutWhiteList();
    }

    public final boolean isEnableReceiveIm() {
        return getConfig().getEnableReceiveIm();
    }

    public final boolean isEnableSendIm() {
        return getConfig().getEnableSendIm();
    }

    public final boolean isEnabled() {
        return getConfig().getEnable();
    }
}
