package com.bytedance.android.livesdk.livesetting.performance.degrade;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.rank.RankEntranceLoopInterval;
import com.bytedance.android.livesdk.livesetting.rank.RankEntranceMarqueeInterval;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes36.dex */
@SettingsKey("live_ranking_and_privilege_downgrade_setting")
public final class LiveRankingAndPrivilegeDowngradeSetting {
    public static final LiveRankingAndPrivilegeDowngradeSetting INSTANCE = new LiveRankingAndPrivilegeDowngradeSetting();
    public static final Config DEFAULT = new Config(false, false, false, 0, false, false, false, false, RankEntranceLoopInterval.INSTANCE.getValue().rankLoopInterval, RankEntranceMarqueeInterval.INSTANCE.getValue(), false, false, false, false, false);

    public static final class Config {
        public static final TypeAdapter ADAPTER = new LiveRankingAndPrivilegeDowngradeSetting_Config_OptTypeAdapter(NormalGson.singleton());

        @C09CT("disable_creator_team_entrance_animation")
        public boolean disableCreatorTeamEntranceAnimation;

        @C09CT("disable_ranking_entrance_animation")
        public boolean disableRankingEntranceAnimation;

        @C09CT("disable_ranking_list_bottom_bar_enter_rank_animation")
        public boolean disableRankingListBottomBarEnterRankAnimation;

        @C09CT("disable_ranking_list_item_live_webp")
        public boolean disableRankingListItemLiveWebp;

        @C09CT("disable_ranking_list_page_refresh")
        public boolean disableRankingListPageRefresh;

        @C09CT("disable_user_level_public_screen_barrage_animation")
        public boolean disableUserLevelPublicScreenBarrageAnimation;

        @C09CT("enable_audience_side_optimization")
        public boolean enableAudienceSideOptimization;

        @C09CT("enable_creator_side_optimization")
        public boolean enableCreatorSideOptimization;

        @C09CT("loading_delay_time_for_creator_ranking_widget")
        public long loadingDelayTimeForCreatorRankingWidget;

        @C09CT("ranking_entrance_loop_interval")
        public long rankingEntranceLoopInterval;

        @C09CT("ranking_entrance_loop_optimization_switch")
        public boolean rankingEntranceLoopOptimizationSwitch;

        @C09CT("ranking_entrance_marquee_interval")
        public long rankingEntranceMarqueeInterval;

        @C09CT("ranking_entrance_marquee_optimization_switch")
        public boolean rankingEntranceMarqueeOptimizationSwitch;

        @C09CT("ranking_entrance_optimization_switch")
        public boolean rankingEntranceOptimizationSwitch;

        @C09CT("widget_loading_delay_switch")
        public boolean widgetLoadingDelaySwitch;

        public Config() {
            this(false, false, false, 0L, false, false, false, false, RankEntranceLoopInterval.INSTANCE.getValue().rankLoopInterval, RankEntranceMarqueeInterval.INSTANCE.getValue(), false, false, false, false, false);
        }

        public Config(boolean z, boolean z2, boolean z3, long j, boolean z4, boolean z5, boolean z6, boolean z7, long j2, long j3, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
            this.enableCreatorSideOptimization = z;
            this.enableAudienceSideOptimization = z2;
            this.widgetLoadingDelaySwitch = z3;
            this.loadingDelayTimeForCreatorRankingWidget = j;
            this.rankingEntranceOptimizationSwitch = z4;
            this.rankingEntranceLoopOptimizationSwitch = z5;
            this.rankingEntranceMarqueeOptimizationSwitch = z6;
            this.disableRankingEntranceAnimation = z7;
            this.rankingEntranceLoopInterval = j2;
            this.rankingEntranceMarqueeInterval = j3;
            this.disableRankingListPageRefresh = z8;
            this.disableRankingListItemLiveWebp = z9;
            this.disableRankingListBottomBarEnterRankAnimation = z10;
            this.disableCreatorTeamEntranceAnimation = z11;
            this.disableUserLevelPublicScreenBarrageAnimation = z12;
        }
    }

    public static final Config getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Config config = DEFAULT;
        Config config2 = (Config) settingsManager.getValueSafely("live_ranking_and_privilege_downgrade_setting", config);
        return config2 != null ? config2 : config;
    }

    public static final Config getDefaultValue() {
        return DEFAULT;
    }

    public static final boolean isBarrageAnimDisabled(boolean z) {
        return ((Boolean) INSTANCE.getDowngradeOptimizationSettingValue(z, Boolean.valueOf(getValue().disableUserLevelPublicScreenBarrageAnimation), Boolean.valueOf(getDefaultValue().disableUserLevelPublicScreenBarrageAnimation))).booleanValue();
    }

    public static final boolean isCreatorEntranceAnimDisabled(boolean z) {
        return ((Boolean) INSTANCE.getDowngradeOptimizationSettingValue(z, Boolean.valueOf(getValue().disableCreatorTeamEntranceAnimation), Boolean.valueOf(getDefaultValue().disableCreatorTeamEntranceAnimation))).booleanValue();
    }

    public static final boolean isRankingEntranceAnimationDisabled(boolean z) {
        return ((Boolean) INSTANCE.getDowngradeOptimizationSettingValue(z, Boolean.valueOf(getValue().disableRankingEntranceAnimation), Boolean.valueOf(getDefaultValue().disableRankingEntranceAnimation))).booleanValue();
    }

    public static final boolean isRankingEntranceLoopOptimizationEnabled(boolean z) {
        return ((Boolean) INSTANCE.getDowngradeOptimizationSettingValue(z, Boolean.valueOf(getValue().rankingEntranceLoopOptimizationSwitch), Boolean.valueOf(getDefaultValue().rankingEntranceLoopOptimizationSwitch))).booleanValue();
    }

    public static final boolean isRankingEntranceMarqueeOptimizationEnabled(boolean z) {
        return ((Boolean) INSTANCE.getDowngradeOptimizationSettingValue(z, Boolean.valueOf(getValue().rankingEntranceMarqueeOptimizationSwitch), Boolean.valueOf(getDefaultValue().rankingEntranceMarqueeOptimizationSwitch))).booleanValue();
    }

    public static final boolean isRankingEntranceOptimizationEnabled(boolean z) {
        return ((Boolean) INSTANCE.getDowngradeOptimizationSettingValue(z, Boolean.valueOf(getValue().rankingEntranceOptimizationSwitch), Boolean.valueOf(getDefaultValue().rankingEntranceOptimizationSwitch))).booleanValue();
    }

    public static final boolean isRankingListBottomBarEnterRankAnimDisabled(boolean z) {
        return ((Boolean) INSTANCE.getDowngradeOptimizationSettingValue(z, Boolean.valueOf(getValue().disableRankingListBottomBarEnterRankAnimation), Boolean.valueOf(getDefaultValue().disableRankingListBottomBarEnterRankAnimation))).booleanValue();
    }

    public static final boolean isRankingListItemLiveWebpDisabled(boolean z) {
        return ((Boolean) INSTANCE.getDowngradeOptimizationSettingValue(z, Boolean.valueOf(getValue().disableRankingListItemLiveWebp), Boolean.valueOf(getDefaultValue().disableRankingListItemLiveWebp))).booleanValue();
    }

    public static final boolean isRankingListPageRefreshDisabled(boolean z) {
        return ((Boolean) INSTANCE.getDowngradeOptimizationSettingValue(z, Boolean.valueOf(getValue().disableRankingListPageRefresh), Boolean.valueOf(getDefaultValue().disableRankingListPageRefresh))).booleanValue();
    }

    private final <T> T getDowngradeOptimizationSettingValue(boolean z, T t, T t2) {
        if (z) {
            if (getValue().enableCreatorSideOptimization) {
                return t;
            }
        } else if (getValue().enableAudienceSideOptimization) {
            return t;
        }
        return t2;
    }
}
