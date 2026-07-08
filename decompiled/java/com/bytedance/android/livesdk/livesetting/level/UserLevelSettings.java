package com.bytedance.android.livesdk.livesetting.level;

import X.C2097608Jq;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.ArrayList;
import kotlin.Pair;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_user_level")
public final class UserLevelSettings {
    public static final UserLevelSettings INSTANCE = new UserLevelSettings();
    public static final UserLevelConfig DEFAULT = new UserLevelConfig(new ArrayList(), new ArrayList(), new UserLevelDynamicConfig(10, false, 7, 9, 4), new ArrayList(), new ArrayList(), C2097608Jq.LJIIIIZZ(new Pair("user_level_upgrade_panel", "sslocal://webcast_lynxview_popup?use_spark=1&url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_revenue_user_level_main%2Fsrc%2Fpages%2Fupgrade%2Fpanel%2Ftemplate.js&hide_status_bar=0&hide_nav_bar=1&container_bg_color=00000000&height=1280rpx"), new Pair("user_level_detail_panel", "sslocal://webcast_lynxview_popup?use_spark=1&url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_revenue_user_level_main%2Fsrc%2Fpages%2Fprivilege%2Fpanel%2Ftemplate.js&hide_status_bar=0&hide_nav_bar=1&container_bg_color=00000000&height=1280rpx"), new Pair("user_level_faq_panel", "sslocal://webcast_lynxview_popup?use_spark=1&url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_revenue_user_level_main%2Fsrc%2Fpages%2Ffaq%2Fpanel%2Ftemplate.js&hide_status_bar=0&hide_nav_bar=1&height=1280rpx")));

    public final UserLevelConfig getUserLevelConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        UserLevelConfig userLevelConfig = DEFAULT;
        UserLevelConfig userLevelConfig2 = (UserLevelConfig) settingsManager.getValueSafely("live_user_level", userLevelConfig);
        return userLevelConfig2 != null ? userLevelConfig2 : userLevelConfig;
    }

    public final UserLevelConfig getDEFAULT() {
        return DEFAULT;
    }
}
