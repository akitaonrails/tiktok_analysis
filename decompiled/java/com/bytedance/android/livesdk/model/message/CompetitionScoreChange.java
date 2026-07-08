package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionResultsTeamInfo;
import com.bytedance.android.live.liveinteract.competition.model.TakeTheStageOrderInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleEffectInfos;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class CompetitionScoreChange {

    @C09CT("effect_infos")
    public BattleEffectInfos effectInfos;

    @C09CT("take_the_stage_biz")
    public TakeTheStageBiz takeTheStageBiz;

    @C09CT("team_infos")
    public List<CompetitionResultsTeamInfo> teamInfos = new ArrayList();

    @C09CT("trigger_reason")
    public int triggerReason;

    public static final class TakeTheStageBiz {

        @C09CT("order_info")
        public TakeTheStageOrderInfo orderInfo;

        @C09CT("performance_start_time")
        public long performanceStartTime;

        @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
        public int status;
    }
}
