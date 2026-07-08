package com.bytedance.android.livesdk.livesetting.liveevent;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("enable_create_live_event_on_publish_page")
public final class LiveEventPublishPageCreationEnableSetting {
    public static final boolean DEFAULT = false;
    public static final LiveEventPublishPageCreationEnableSetting INSTANCE = new LiveEventPublishPageCreationEnableSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("enable_create_live_event_on_publish_page", DEFAULT);
    }
}
