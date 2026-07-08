package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class MultiBattleFinishResponse {

    @C09CT("battle_combo_v2")
    public Map<Long, BattleComboInfo> battleComboV2;

    @C09CT("battle_settings")
    public BattleSetting battleSettings;

    @C09CT("has_team_match_mvp_SFX")
    public boolean hasTeamMatchMvpSfx;

    @C09CT("match_punish_extra_info")
    public MatchPunishExtraInfo matchPunishExtraInfo;

    @C09CT("team_armies")
    public Map<Long, BattleTeamUserArmies> teamArmies;

    @C09CT("team_battle_result")
    public Map<Long, BattleTeamResult> teamBattleResult;

    public MultiBattleFinishResponse() {
        this(null, null);
    }

    public MultiBattleFinishResponse(Map<Long, BattleTeamResult> map, Map<Long, BattleTeamUserArmies> map2) {
        this.teamBattleResult = map;
        this.teamArmies = map2;
        this.battleComboV2 = new LinkedHashMap();
    }
}
