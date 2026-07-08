package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.chatroom.model.LivePublicScreenMsgPriorityConfig;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_publicscreen_message_default_priority")
public final class LivePublicScreenMessageDefaultPrioritySetting {
    public static final LivePublicScreenMessageDefaultPrioritySetting INSTANCE = new LivePublicScreenMessageDefaultPrioritySetting();
    public static final LivePublicScreenMsgPriorityConfig DEFAULT = new LivePublicScreenMsgPriorityConfig();

    public static final long getDefaultPriorityForAnchor() {
        return INSTANCE.getPriority().priorityForAnchor;
    }

    public static final long getDefaultPriorityForAudience() {
        return INSTANCE.getPriority().priorityForAudience;
    }

    private final LivePublicScreenMsgPriorityConfig getPriority() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LivePublicScreenMsgPriorityConfig livePublicScreenMsgPriorityConfig = DEFAULT;
        LivePublicScreenMsgPriorityConfig livePublicScreenMsgPriorityConfig2 = (LivePublicScreenMsgPriorityConfig) settingsManager.getValueSafely("live_publicscreen_message_default_priority", livePublicScreenMsgPriorityConfig);
        return livePublicScreenMsgPriorityConfig2 != null ? livePublicScreenMsgPriorityConfig2 : livePublicScreenMsgPriorityConfig;
    }
}
