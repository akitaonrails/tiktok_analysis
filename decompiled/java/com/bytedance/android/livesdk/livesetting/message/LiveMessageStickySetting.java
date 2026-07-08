package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_message_sticky_config")
public final class LiveMessageStickySetting {
    public static final LiveMessageStickySetting INSTANCE = new LiveMessageStickySetting();
    public static final LiveMessageStickyConfig DEFAULT = new LiveMessageStickyConfig();

    public final LiveMessageStickyConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveMessageStickyConfig liveMessageStickyConfig = DEFAULT;
        LiveMessageStickyConfig liveMessageStickyConfig2 = (LiveMessageStickyConfig) settingsManager.getValueSafely("live_message_sticky_config", liveMessageStickyConfig);
        return liveMessageStickyConfig2 != null ? liveMessageStickyConfig2 : liveMessageStickyConfig;
    }

    public final int capacityPerMethod() {
        return getValue().getCapacityPerMethod();
    }

    public final boolean enabled() {
        return getValue().getEnable();
    }

    public final List<String> methodList() {
        return getValue().getMethodList();
    }

    public final int stickyTillTime() {
        return getValue().getStickyTillTime();
    }

    public final int stickyTimeLimit() {
        return getValue().getStickyTimeLimit();
    }
}
