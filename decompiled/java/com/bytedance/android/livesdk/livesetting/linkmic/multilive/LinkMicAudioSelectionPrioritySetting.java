package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("linkmic_downlink_select_priority_config")
public final class LinkMicAudioSelectionPrioritySetting {
    public static final LinkMicAudioSelectionPriorityConfig DEFAULT;
    public static final LinkMicAudioSelectionPrioritySetting INSTANCE = new LinkMicAudioSelectionPrioritySetting();
    public static final LinkMicAudioSelectionPriorityConfig config;

    static {
        LinkMicAudioSelectionPriorityConfig linkMicAudioSelectionPriorityConfig = new LinkMicAudioSelectionPriorityConfig(false, 2, 0);
        DEFAULT = linkMicAudioSelectionPriorityConfig;
        LinkMicAudioSelectionPriorityConfig linkMicAudioSelectionPriorityConfig2 = (LinkMicAudioSelectionPriorityConfig) SettingsManager.INSTANCE.getValueSafely("linkmic_downlink_select_priority_config", linkMicAudioSelectionPriorityConfig);
        if (linkMicAudioSelectionPriorityConfig2 != null) {
            linkMicAudioSelectionPriorityConfig = linkMicAudioSelectionPriorityConfig2;
        }
        config = linkMicAudioSelectionPriorityConfig;
    }

    public final int getAnchorPriority() {
        return config.anchorPriority;
    }

    public final int getGuestPriority() {
        return config.guestPriority;
    }

    public final boolean isEnable() {
        return config.enable;
    }
}
