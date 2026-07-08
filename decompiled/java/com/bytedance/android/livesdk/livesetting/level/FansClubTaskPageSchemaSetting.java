package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_fans_club_task_page_schema")
public final class FansClubTaskPageSchemaSetting {
    public static final String DEFAULT = "sslocal://webcast_lynxview_popup?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Fmusically%2Ffe%2Flive%2Ftiktok_live_revenue_fans_user_manage%2Ffan%2Fclub%2Fuser%2Ftemplate.js&container_bg_color=00000000&height=73%25&radius=12&bdhm_bid=tiktok_live_revenue_fans_user_manage&roma_target_router=live&gravity=bottom&loading_bg_color=ffffffff&enable_prefetch=1&enable_code_cache=1&bdhm_pid=tiktok_live_revenue_fans_club_user&enable_pull_down_close=0&schema_from=roma&preload_setting_keys=%7B%22keys%22%3A%5B%7B%22key%22%3A%22creator_team_manually_collect_mode_opt%22%2C%22type%22%3A%22number%22%2C%22biz%22%3A%22live%22%7D%5D%7D&fan_club_page=fan_club_user_manage&use_live_sheet=1&height_mode=fixed_7&launch_mode=overlay&use_spark=1";
    public static final FansClubTaskPageSchemaSetting INSTANCE = new FansClubTaskPageSchemaSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_fans_club_task_page_schema", DEFAULT);
    }
}
