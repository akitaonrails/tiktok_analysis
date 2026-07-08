package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C09CT;
import X.C2097608Jq;
import com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeInfo;
import com.bytedance.android.livesdk.model.message.battle.BattleDisplayConfig;
import com.bytedance.android.livesdk.model.message.battle.BattleResult;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdk.model.message.battle.BattleUserArmies;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class BattleInfoResponse {

    @C09CT("anchor_match_settings")
    public Map<Long, AnchorMatchSettings> anchorMatchSettings;

    @C09CT("armies")
    public Map<Long, BattleUserArmies> armies;

    @C09CT("battle_combo_v2")
    public Map<Long, BattleComboInfo> battleCombos;

    @C09CT("battle_feature_flags")
    public BattleFeatureFlags battleFeatureFlags;

    @C09CT("battle_id")
    public Long battleId;

    @C09CT("battle_id_str")
    public String battleIdStr;

    @C09CT("battle_item_cards")
    public Map<Long, EffectingCard> battleItemCards;

    @C09CT("battle_task")
    public BattleTask battleTask;

    @C09CT("battle_truth_or_dare")
    public BattleTruthOrDare battleTruthOrDare;

    @C09CT("bubble_text")
    public String bubbleText;

    @C09CT("channel_id")
    public Long channelId;

    @C09CT("channel_id_str")
    public String channelIdStr;

    @C09CT("effect_infos")
    public BattleEffectInfos effectInfos;

    @C09CT("enigma_battle_extra_info")
    public EnigmaBattleExtraInfo enigmaBattleExtraInfo;

    @C09CT("enigma_battle_setting")
    public EnigmaBattleSetting enigmaBattleSetting;

    @C09CT("fuzzy_display_config_v2")
    public HighScoreControlCfg fuzzyDisplayConfigV2;

    @C09CT("ice_showdown_info")
    public IceShowdownInfo iceShowdownInfo;

    @C09CT("league_info_map")
    public Map<Long, GiftGalleryBadgeInfo> leagueInfoMap;

    @C09CT("league_score_info_map")
    public Map<Long, LeagueScoreInfo> leagueScoreInfoMap;

    @C09CT("fuzzy_display_config")
    public BattleDisplayConfig mBattleDisplayConfig;

    @C09CT("match_theme_display_resource")
    public MatchThemeDisplayResource matchThemeDisplayResource;

    @C09CT("battle_result")
    public Map<Long, BattleResult> resultMap;

    @C09CT("battle_settings")
    public BattleSetting setting;

    @C09CT("supported_actions")
    public Map<Long, Boolean> supportedActions;

    @C09CT("team_armies")
    public Map<Long, BattleTeamUserArmies> teamArmies;

    @C09CT("team_battle_item_cards")
    public Map<Long, EffectingCard> teamBattleItemCards;

    @C09CT("team_battle_result")
    public Map<Long, BattleTeamResult> teamBattleResult;

    @C09CT("team_match_campaign")
    public TeamMatchCampaign teamMatchCampaign;

    @C09CT("team_virtual_ticket_envelopes")
    public Map<Long, VirtualTicketEnvelopeInfoList> teamVirtualTicketEnvelopes;

    @C09CT("anchors_info")
    public Map<Long, BattleUserInfo> userInfoMap;

    public BattleInfoResponse() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, C2097608Jq.LJ(), new LinkedHashMap(), "", "", null, new LinkedHashMap(), new LinkedHashMap(), null, null, null, null, new LinkedHashMap(), null, null, new LinkedHashMap());
    }

    public final String toString() {
        return "BattleInfoResponse(channelId=" + this.channelId + ", battleId=" + this.battleId + ", setting=" + this.setting + ", armies=" + this.armies + ", resultMap=" + this.resultMap + ", userInfoMap=" + this.userInfoMap + ", bubbleText=" + this.bubbleText + ", supportedActions=" + this.supportedActions + ", mBattleDisplayConfig=" + this.mBattleDisplayConfig + ", battleCombos=" + this.battleCombos + ", battleTask=" + this.battleTask + ", teamArmies=" + this.teamArmies + ", teamBattleResult=" + this.teamBattleResult + ", battleTruthOrDare=" + this.battleTruthOrDare + ", teamMatchCampaign=" + this.teamMatchCampaign + ", battleItemCards=" + this.battleItemCards + ", teamBattleItemCards=" + this.teamBattleItemCards + ", channelIdStr=" + this.channelIdStr + ", battleIdStr=" + this.battleIdStr + ", fuzzyDisplayConfigV2=" + this.fuzzyDisplayConfigV2 + ", leagueInfoMap=" + this.leagueInfoMap + ", leagueScoreInfoMap=" + this.leagueScoreInfoMap + ", iceShowdownInfo=" + this.iceShowdownInfo + ", effectInfos=" + this.effectInfos + ", enigmaBattleSetting=" + this.enigmaBattleSetting + ", enigmaBattleExtraInfo=" + this.enigmaBattleExtraInfo + ", anchorMatchSettings=" + this.anchorMatchSettings + ", battleFeatureFlags=" + this.battleFeatureFlags + ", matchThemeDisplayResource=" + this.matchThemeDisplayResource + ", teamVirtualTicketEnvelopes=" + this.teamVirtualTicketEnvelopes + ')';
    }

    public BattleInfoResponse(Long l, Long l2, BattleSetting battleSetting, Map<Long, BattleUserArmies> map, Map<Long, BattleResult> map2, Map<Long, BattleUserInfo> map3, String str, Map<Long, Boolean> map4, BattleDisplayConfig battleDisplayConfig, Map<Long, BattleComboInfo> map5, BattleTask battleTask, Map<Long, BattleTeamUserArmies> map6, Map<Long, BattleTeamResult> map7, BattleTruthOrDare battleTruthOrDare, TeamMatchCampaign teamMatchCampaign, Map<Long, EffectingCard> map8, Map<Long, EffectingCard> map9, String str2, String str3, HighScoreControlCfg highScoreControlCfg, Map<Long, GiftGalleryBadgeInfo> map10, Map<Long, LeagueScoreInfo> map11, IceShowdownInfo iceShowdownInfo, BattleEffectInfos battleEffectInfos, EnigmaBattleSetting enigmaBattleSetting, EnigmaBattleExtraInfo enigmaBattleExtraInfo, Map<Long, AnchorMatchSettings> map12, BattleFeatureFlags battleFeatureFlags, MatchThemeDisplayResource matchThemeDisplayResource, Map<Long, VirtualTicketEnvelopeInfoList> map13) {
        this.channelId = l;
        this.battleId = l2;
        this.setting = battleSetting;
        this.armies = map;
        this.resultMap = map2;
        this.userInfoMap = map3;
        this.bubbleText = str;
        this.supportedActions = map4;
        this.mBattleDisplayConfig = battleDisplayConfig;
        this.battleCombos = map5;
        this.battleTask = battleTask;
        this.teamArmies = map6;
        this.teamBattleResult = map7;
        this.battleTruthOrDare = battleTruthOrDare;
        this.teamMatchCampaign = teamMatchCampaign;
        this.battleItemCards = map8;
        this.teamBattleItemCards = map9;
        this.channelIdStr = str2;
        this.battleIdStr = str3;
        this.fuzzyDisplayConfigV2 = highScoreControlCfg;
        this.leagueInfoMap = map10;
        this.leagueScoreInfoMap = map11;
        this.iceShowdownInfo = iceShowdownInfo;
        this.effectInfos = battleEffectInfos;
        this.enigmaBattleSetting = enigmaBattleSetting;
        this.enigmaBattleExtraInfo = enigmaBattleExtraInfo;
        this.anchorMatchSettings = map12;
        this.battleFeatureFlags = battleFeatureFlags;
        this.matchThemeDisplayResource = matchThemeDisplayResource;
        this.teamVirtualTicketEnvelopes = map13;
    }
}
