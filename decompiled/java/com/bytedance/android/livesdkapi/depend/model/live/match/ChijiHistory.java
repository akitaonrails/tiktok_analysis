package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ChijiHistory {

    @C09CT("bonus_this_month")
    public Long bonusThisMonth;

    @C09CT("can_participate")
    public Boolean canParticipate;

    @C09CT("max_battle_score")
    public Long maxBattleScore;

    @C09CT("max_bonus")
    public Long maxBonus;

    @C09CT("max_winning_streak")
    public Long maxWinningStreak;

    @C09CT("original_bonus")
    public Long originalBonus;

    @C09CT("participations_this_month")
    public Long participationsThisMonth;

    @C09CT("result_list")
    public List<ChijiResult> resultList;

    @C09CT("total_bonus")
    public Long totalBonus;

    @C09CT("total_participations")
    public Long totalParticipations;

    @C09CT("user_id")
    public Long userId;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.userId != null) {
            sb.append(", user_id=");
            sb.append(this.userId);
        }
        if (this.canParticipate != null) {
            sb.append(", can_participate=");
            sb.append(this.canParticipate);
        }
        if (this.originalBonus != null) {
            sb.append(", original_bonus=");
            sb.append(this.originalBonus);
        }
        if (this.totalParticipations != null) {
            sb.append(", total_participations=");
            sb.append(this.totalParticipations);
        }
        if (this.participationsThisMonth != null) {
            sb.append(", participations_this_month=");
            sb.append(this.participationsThisMonth);
        }
        if (this.maxWinningStreak != null) {
            sb.append(", max_winning_streak=");
            sb.append(this.maxWinningStreak);
        }
        if (this.maxBattleScore != null) {
            sb.append(", max_battle_score=");
            sb.append(this.maxBattleScore);
        }
        if (this.totalBonus != null) {
            sb.append(", total_bonus=");
            sb.append(this.totalBonus);
        }
        if (this.bonusThisMonth != null) {
            sb.append(", bonus_this_month=");
            sb.append(this.bonusThisMonth);
        }
        if (this.maxBonus != null) {
            sb.append(", max_bonus=");
            sb.append(this.maxBonus);
        }
        List<ChijiResult> list = this.resultList;
        if (list != null && !list.isEmpty()) {
            sb.append(", result_list=");
            sb.append(this.resultList);
        }
        sb.replace(0, 2, "ChijiHistory{");
        sb.append('}');
        return sb.toString();
    }
}
