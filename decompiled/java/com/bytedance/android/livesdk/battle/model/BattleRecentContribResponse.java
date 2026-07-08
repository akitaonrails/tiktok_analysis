package com.bytedance.android.livesdk.battle.model;

import X.C09CT;
import X.C2097608Jq;
import com.bytedance.android.livesdk.model.message.battle.BattleResult;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamResult;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class BattleRecentContribResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("gift_log_ids")
        public List<String> giftLogIds = new ArrayList();

        @C09CT("supported_actions")
        public Map<Long, Boolean> supportedActions = C2097608Jq.LJ();

        @C09CT("battle_score")
        public Map<Long, BattleResult> battleScore = C2097608Jq.LJ();

        @C09CT("team_battle_score")
        public Map<Long, BattleTeamResult> teamBattleScore = C2097608Jq.LJ();
    }
}
