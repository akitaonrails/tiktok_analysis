package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C1697810uHb;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("interaction_layout_new_event_setting")
public final class InteractionLayoutNewEventSetting {
    public static final InteractionLayoutNewEventSetting INSTANCE = new InteractionLayoutNewEventSetting();
    public static final InteractionLayoutNewEventConfig DEFAULT = new InteractionLayoutNewEventConfig(true, C1697810uHb.LJ("biz_link_mic_view_p", "biz_gameplay_view_p", "biz_gameplay_view_p", "biz_score_bar", "biz_contributor"), 3, 3000);

    public final InteractionLayoutNewEventConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        InteractionLayoutNewEventConfig interactionLayoutNewEventConfig = DEFAULT;
        InteractionLayoutNewEventConfig interactionLayoutNewEventConfig2 = (InteractionLayoutNewEventConfig) settingsManager.getValueSafely("interaction_layout_new_event_setting", interactionLayoutNewEventConfig);
        return interactionLayoutNewEventConfig2 != null ? interactionLayoutNewEventConfig2 : interactionLayoutNewEventConfig;
    }
}
