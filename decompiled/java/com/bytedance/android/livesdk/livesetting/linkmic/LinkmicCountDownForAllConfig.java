package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes36.dex */
public final class LinkmicCountDownForAllConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("code_tech_switch_for_android")
    public int codeTechSwitchForAndroid;

    @C09CT("code_tech_switch_for_player_banner_show")
    public int codeTechSwitchForPlayerBannerShow;

    @C09CT("effect_panel")
    public String effectPanel;

    @C09CT("end_animation")
    public String endAnimation;

    @C09CT("end_IM_lost_protect_backup_delay_time")
    public int endIMLostProtectBackupDelayTime;

    @C09CT("FAQ_url")
    public String faqUrl;

    @C09CT("gecko_channel")
    public String geckoChannel;

    @C09CT("rank_sync_IM_lost_protect_state_change_by_client_backup_delay_time")
    public int rankSyncIMLostProtectStateChangeByClientBackupDelayTime;

    @C09CT("rank_sync_IM_lost_protect_state_change_by_IM_backup_delay_time")
    public int rankSyncIMLostProtectStateChangeByIMBackupDelayTime;

    @C09CT("start_animation")
    public String startAnimation;

    @C09CT("start_IM_lost_protect_retry_count")
    public int startIMLostProtectRetryCount;

    static {
        NormalGson.singleton();
        ADAPTER = new LinkmicCountDownForAllConfig_OptTypeAdapter();
    }

    public LinkmicCountDownForAllConfig() {
        this("sslocal://webcast_lynxview_popup?url=https%3A%2F%2Flf-main-gecko-source.tiktokcdn.com%2Fobj%2Ftiktok-teko-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_interaction_banner%2Fpages%2Fcountdown-for-all-faq%2Ftemplate.js&height=60%25&use_spark=1", 1, 3, 8, 5, 1, 1, "countdown", "tiktok_live_interaction_normal_4", "count_down_for_all_start.zip", "count_down_for_all_end.zip");
    }

    public LinkmicCountDownForAllConfig(String str, int i, int i2, int i3, int i4, int i5, int i6, String str2, String str3, String str4, String str5) {
        this.faqUrl = str;
        this.startIMLostProtectRetryCount = i;
        this.endIMLostProtectBackupDelayTime = i2;
        this.rankSyncIMLostProtectStateChangeByIMBackupDelayTime = i3;
        this.rankSyncIMLostProtectStateChangeByClientBackupDelayTime = i4;
        this.codeTechSwitchForAndroid = i5;
        this.codeTechSwitchForPlayerBannerShow = i6;
        this.effectPanel = str2;
        this.geckoChannel = str3;
        this.startAnimation = str4;
        this.endAnimation = str5;
    }
}
