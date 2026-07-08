package webcast.api.fans;

import X.C09CT;
import webcast.data.DiscordEntrance;
import webcast.data.ImageXParams;
import webcast.data.SuperFanPermissionInfo;

/* JADX INFO: loaded from: classes29.dex */
public final class AnchorPageExtra {

    @C09CT("anchor_fans_count")
    public long anchorFansCount;

    @C09CT("discord_entrance")
    public DiscordEntrance discordEntrance;

    @C09CT("enable_customize_benefit")
    public boolean enableCustomizeBenefit;

    @C09CT("enable_new_level_gifts")
    public boolean enableNewLevelGifts;

    @C09CT("gtm_feature_flag")
    public long gtmFeatureFlag;

    @C09CT("gtm_phase")
    public long gtmPhase;

    @C09CT("has_goody_bag_permission")
    public boolean hasGoodyBagPermission;

    @C09CT("has_team_mission")
    public boolean hasTeamMission;

    @C09CT("hit_relationship_journey_ab")
    public boolean hitRelationshipJourneyAb;

    @C09CT("image_upload_params")
    public ImageXParams imageUploadParams;

    @C09CT("is_popularity_rank_released")
    public boolean isPopularityRankReleased;

    @C09CT("scroll_to_user_id")
    public String scrollToUserId = "";

    @C09CT("sub_privilege_upgrade")
    public boolean subPrivilegeUpgrade;

    @C09CT("super_fan_permission_info")
    public SuperFanPermissionInfo superFanPermissionInfo;
}
