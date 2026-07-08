package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_custom_poll_url")
public final class CustomPollLynxUrl {
    public static final String DEFAULT = "sslocal://webcast_lynxview_popup?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_fundamental_poll%2Fpoll%2Fpages%2Fcustom-poll%2Fmain%2Ftemplate.js&type=popup&radius=8&gravity=bottom&transition_animation=bottom&use_spark=1&hide_nav_bar=1&hide_status_bar=0&keyboard_adjust=1&hide_loading=1&disable_back_press=0";
    public static final CustomPollLynxUrl INSTANCE = new CustomPollLynxUrl();

    public final String getValue() {
        String stringValue = SettingsManager.INSTANCE.getStringValue("live_custom_poll_url", DEFAULT);
        return stringValue.length() == 0 ? "sslocal://webcast_lynxview_popup?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_fundamental_poll%2Fpoll%2Fpages%2Fcustom-poll%2Fmain%2Ftemplate.js&type=popup&radius=8&gravity=bottom&transition_animation=bottom&use_spark=1&hide_nav_bar=1&hide_status_bar=0&keyboard_adjust=1&hide_loading=1&disable_back_press=0" : stringValue;
    }
}
