package webcast.api.battle;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamResult;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class BattleLeaveLinkmicResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("battle_settings")
        public BattleSetting battleSettings;

        @C09CT("team_battle_result")
        public Map<Long, BattleTeamResult> teamBattleResult = new LinkedHashMap();
    }
}
