package tikcast.api.fans;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import webcast.data.CoinStrategyTaskExtra;
import webcast.data.FansScoreRule;
import webcast.data.FansUpgradeDynamicEffectConfig;
import webcast.data.LevelGiftPrivilege;

/* JADX INFO: loaded from: classes29.dex */
public final class TaskExtra {

    @C09CT("boost_expire_time")
    public long boostExpireTime;

    @C09CT("boost_factor")
    public double boostFactor;

    @C09CT("boost_source")
    public int boostSource;

    @C09CT("coin_strategy_task_extra")
    public CoinStrategyTaskExtra coinStrategyTaskExtra;

    @C09CT("enable_new_level_gifts")
    public boolean enableNewLevelGifts;

    @C09CT("expire_time")
    public long expireTime;

    @C09CT("has_celebration_privilege")
    public boolean hasCelebrationPrivilege;

    @C09CT("has_team_mission")
    public boolean hasTeamMission;

    @C09CT("has_treasure_box_permission")
    public boolean hasTreasureBoxPermission;

    @C09CT("heart_me_gift_id")
    public long heartMeGiftId;

    @C09CT("is_fan_club_2")
    public boolean isFanClub2;

    @C09CT("is_high_engagement")
    public boolean isHighEngagement;

    @C09CT("is_manually_claim_mode")
    public boolean isManuallyClaimMode;

    @C09CT("is_popularity_rank_released")
    public boolean isPopularityRankReleased;

    @C09CT("level_gift_privilege_info")
    public LevelGiftPrivilege levelGiftPrivilegeInfo;

    @C09CT("next_level_dynamic_effect")
    public FansUpgradeDynamicEffectConfig nextLevelDynamicEffect;

    @C09CT("sub_privilege_upgrade")
    public boolean subPrivilegeUpgrade;

    @C09CT("super_fan_awareness_enabled")
    public boolean superFanAwarenessEnabled;

    @C09CT("skin")
    public String skin = "";

    @C09CT("level_configs")
    public List<FansScoreRule> levelConfigs = new ArrayList();
}
