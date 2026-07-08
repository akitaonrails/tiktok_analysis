package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import X.C2188811AlT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdk.model.message.battle.BattleUserArmies;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleEffectInfos;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamUserArmies;
import com.bytedance.android.livesdkapi.depend.model.live.match.EnigmaBattleExtraInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.HighScoreControlCfg;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class LinkMicBattleArmiesMessage extends AbstractC1136060ffY {

    @C09CT("armies")
    public Map<Long, BattleUserArmies> armies;

    @C09CT("battle_id")
    public long battleId;

    @C09CT("battle_settings")
    public BattleSetting battleSettings;

    @C09CT("channel_id")
    public long channelId;

    @C09CT("effect_infos")
    public BattleEffectInfos effectInfos;

    @C09CT("enigma_battle_extra_info")
    public EnigmaBattleExtraInfo enigmaBattleExtraInfo;

    @C09CT("from_user_id")
    public long fromUserId;

    @C09CT("fuzzy_display_config_v2")
    public HighScoreControlCfg fuzzyDisplayConfigV2;

    @C09CT("gift_icon_image")
    public ImageModel gifIconImage;

    @C09CT("gift_count")
    public int giftCount;

    @C09CT("gift_id")
    public long giftId;

    @C09CT("send_gift_success_time")
    public long giftSentTime;

    @C09CT("has_team_match_mvp_SFX")
    public boolean hasTeamMatchMvpSfx;

    @C09CT("log_id")
    public String logId = "";

    @C09CT("repeat_count")
    public int repeatCount;

    @C09CT("update_battle_score_time")
    public long scoreUpdateTime;

    @C09CT("team_armies")
    public List<BattleTeamUserArmies> teamArmies;

    @C09CT("total_diamond_count")
    public int totalDiamondCount;

    @C09CT("trigger_critical_strike")
    public boolean triggerCriticalStrike;

    @C09CT("trigger_reason")
    public int triggerReason;

    public LinkMicBattleArmiesMessage() {
        this.type = C001A.LINK_MIC_BATTLE_ARMIES;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LinkMicBattleArmiesMessage{battleId=");
        sbLIZ.append(this.battleId);
        sbLIZ.append(", armies=");
        sbLIZ.append(this.armies);
        sbLIZ.append(", giftSentTime=");
        sbLIZ.append(this.giftSentTime);
        sbLIZ.append(", scoreUpdateTime=");
        sbLIZ.append(this.scoreUpdateTime);
        sbLIZ.append(", triggerReason=");
        sbLIZ.append(this.triggerReason);
        sbLIZ.append(", gifIconImage=");
        sbLIZ.append(this.gifIconImage);
        sbLIZ.append(", giftCount=");
        sbLIZ.append(this.giftCount);
        sbLIZ.append(", totalDiamondCount=");
        sbLIZ.append(this.totalDiamondCount);
        sbLIZ.append(", repeatCount=");
        sbLIZ.append(this.repeatCount);
        sbLIZ.append(", channelId=");
        sbLIZ.append(this.channelId);
        sbLIZ.append(", fromUserId=");
        sbLIZ.append(this.fromUserId);
        sbLIZ.append(", giftId=");
        sbLIZ.append(this.giftId);
        sbLIZ.append(", teamArmies=");
        sbLIZ.append(this.teamArmies);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
