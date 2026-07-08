package com.bytedance.android.livesdk.rank.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class LeagueMatchScoreDetail {

    @C09CT("bonus_types")
    public List<Integer> bonusTypes = new ArrayList();

    @C09CT("manual_ice_bonus_score")
    public long manualIceBonusScore;

    @C09CT("rule_type")
    public int ruleType;

    @C09CT("underdog_victory_bonus_multiple")
    public long underdogVictoryBonusMultiple;
}
