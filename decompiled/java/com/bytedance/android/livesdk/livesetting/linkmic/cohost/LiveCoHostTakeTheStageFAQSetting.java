package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_cohost_take_stage_faq_url")
public final class LiveCoHostTakeTheStageFAQSetting {
    public static final LiveCoHostTakeTheStageFAQSetting INSTANCE = new LiveCoHostTakeTheStageFAQSetting();
    public static final String DEFAULT = "aweme://roma_redirect/?roma_group_key=roma_schema_group_take_the_stage&roma_page_key=roma_schema_page_take_the_stage_faq&trait_mode=light";

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_cohost_take_stage_faq_url", DEFAULT);
    }
}
