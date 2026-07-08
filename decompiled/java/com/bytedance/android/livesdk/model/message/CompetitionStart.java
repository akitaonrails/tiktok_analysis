package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionInitiateInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleComboInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleEffectInfos;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class CompetitionStart {

    @C09CT("actual_end_timestamp")
    public long actualEndTimestamp;

    @C09CT("beans_biz")
    public BeansBiz beansBiz;

    @C09CT("combo_info_map")
    public Map<String, BattleComboInfo> comboInfoMap = new LinkedHashMap();

    @C09CT("competition_start_time")
    public long competitionStartTime;

    @C09CT("effect_infos")
    public BattleEffectInfos effectInfos;

    @C09CT("end_timestamp")
    public long endTimestamp;

    @C09CT("gameplay_option")
    public int gameplayOption;

    @C09CT("initiate_info")
    public CompetitionInitiateInfo initiateInfo;

    @C09CT("take_the_stage_biz")
    public TakeTheStageBiz takeTheStageBiz;

    public static final class BeansBiz {

        @C09CT("system_bomb_intervals")
        public List<Long> systemBombIntervals = new ArrayList();
    }

    public static final class TakeTheStageBiz {

        @C09CT("planned_performance_end_time")
        public long plannedPerformanceEndTime;
    }
}
