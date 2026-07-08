package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("live_host_i_moderate_faq")
public final class LiveHostIModerateFaqLinkSetting {
    public static final String DEFAULT = "sslocal://webcast_lynxview_popup?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_fundamental_main%2Fmain%2Fpages%2Fmoderator-faq%2Ftemplate.js&gravity=bottom&height=440&radius=16rpx&use_spark=1&transition_animation=right&enter_from=host_moderate_panel";
    public static final LiveHostIModerateFaqLinkSetting INSTANCE = new LiveHostIModerateFaqLinkSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_host_i_moderate_faq", DEFAULT);
    }
}
