package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import X.C2188811AlT;
import com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeInfo;
import com.bytedance.android.livesdk.model.message.battle.BattleDisplayConfig;
import com.bytedance.android.livesdk.model.message.battle.BattleResult;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdk.model.message.battle.BattleUserInfoWrapper;
import com.bytedance.android.livesdk.model.message.battle.SupportedActionsWrapper;
import com.bytedance.android.livesdk.model.message.battle.UserArmiesWrapper;
import com.bytedance.android.livesdkapi.depend.model.live.match.AnchorMatchSettings;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleABTestSetting;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleComboInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleFeatureFlags;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamResult;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamUserArmies;
import com.bytedance.android.livesdkapi.depend.model.live.match.EnigmaBattleSetting;
import com.bytedance.android.livesdkapi.depend.model.live.match.HighScoreControlCfg;
import com.bytedance.android.livesdkapi.depend.model.live.match.LeagueScoreInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.MatchPunishExtraInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.MatchThemeDisplayResource;
import com.bytedance.android.livesdkapi.depend.model.live.match.TeamMatchCampaign;
import java.util.List;
import java.util.Map;
import tikcast.linkmic.common.LayoutData;

/* JADX INFO: loaded from: classes.dex */
public class LinkMicBattleMessage extends AbstractC1136060ffY {

    @C09CT("ab_test_setting")
    public List<BattleABTestSetting> abtestSettings;

    @C09CT("action")
    public int action;

    @C09CT("action_by_user_id")
    public long actionByUserId;

    @C09CT("anchors_info")
    public List<BattleUserInfoWrapper> anchorInfo;

    @C09CT("anchor_match_settings")
    public Map<Long, AnchorMatchSettings> anchorMatchSettings;

    @C09CT("armies")
    public List<UserArmiesWrapper> armies;

    @C09CT("battle_combo_v2")
    public Map<Long, BattleComboInfo> battleCombos;

    @C09CT("battle_feature_flags")
    public BattleFeatureFlags battleFeatureFlags;

    @C09CT("battle_id")
    public long battleId;

    @C09CT("battle_result")
    public Map<Long, BattleResult> battleResult;

    @C09CT("battle_settings")
    public BattleSetting battleSetting;

    @C09CT("bubble_text")
    public String bubbleText;

    @C09CT("cross_room_layout")
    public LayoutData crossRoomLayout;

    @C09CT("enigma_battle_setting")
    public EnigmaBattleSetting enigmaBattleSetting;

    @C09CT("fuzzy_display_config_v2")
    public HighScoreControlCfg fuzzyDisplayConfigV2;

    @C09CT("invitee_gift_permission_type")
    public int inviteeGiftPermissionType;

    @C09CT("invitees_gift_permission_type")
    public List<BattleInviteeGiftPermission> inviteeGiftPermissionTypes;

    @C09CT("league_info_map")
    public Map<Long, GiftGalleryBadgeInfo> leagueInfoMap;

    @C09CT("league_score_info_map")
    public Map<Long, LeagueScoreInfo> leagueScoreInfoMap;

    @C09CT("fuzzy_display_config")
    public BattleDisplayConfig mBattleDisplayConfig;

    @C09CT("match_punish_extra_info")
    public MatchPunishExtraInfo matchPunishExtraInfo;

    @C09CT("match_theme_display_resource")
    public MatchThemeDisplayResource matchThemeDisplayResource;

    @C09CT("supported_actions")
    public List<SupportedActionsWrapper> supportedActions;

    @C09CT("team_armies")
    public List<BattleTeamUserArmies> teamArmies;

    @C09CT("team_battle_result")
    public List<BattleTeamResult> teamBattleResult;

    @C09CT("team_match_campaign")
    public TeamMatchCampaign teamMatchCampaign;

    @C09CT("team_member")
    public List<TeamUsersInfo> teamUsers;

    @C09CT("tracking_extra")
    public Map<String, String> trackingExtra;

    public LinkMicBattleMessage() {
        this.type = C001A.LINK_MIC_BATTLE;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LinkMicBattleMessage{battleId=");
        sbLIZ.append(this.battleId);
        sbLIZ.append(", action=");
        sbLIZ.append(this.action);
        sbLIZ.append(", battleSetting=");
        sbLIZ.append(this.battleSetting);
        sbLIZ.append(", battleResult=");
        sbLIZ.append(this.battleResult);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
