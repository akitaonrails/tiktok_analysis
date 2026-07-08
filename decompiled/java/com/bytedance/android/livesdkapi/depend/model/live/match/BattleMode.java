package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class BattleMode {

    @C09CT("mode")
    public Integer mode;

    @C09CT("steal_tower_data")
    public StealTowerData stealTowerData;

    public static final class StealTowerData {

        @C09CT("attacker_id")
        public Long attackerId;

        @C09CT("count")
        public Long count;

        @C09CT("duration")
        public Long duration;

        @C09CT("finish")
        public Boolean finish;

        @C09CT("finish_time")
        public Long finishTime;

        @C09CT("open_score")
        public Long openScore;

        @C09CT("start_time")
        public Long startTime;

        @C09CT("target_score")
        public Long targetScore;

        @C09CT("trigger_time")
        public Long triggerTime;

        @C09CT("win")
        public Long win;

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.triggerTime != null) {
                sb.append(", trigger_time=");
                sb.append(this.triggerTime);
            }
            if (this.duration != null) {
                sb.append(", duration=");
                sb.append(this.duration);
            }
            if (this.targetScore != null) {
                sb.append(", target_score=");
                sb.append(this.targetScore);
            }
            if (this.startTime != null) {
                sb.append(", start_time=");
                sb.append(this.startTime);
            }
            if (this.attackerId != null) {
                sb.append(", attacker_id=");
                sb.append(this.attackerId);
            }
            if (this.finishTime != null) {
                sb.append(", finish_time=");
                sb.append(this.finishTime);
            }
            if (this.win != null) {
                sb.append(", win=");
                sb.append(this.win);
            }
            if (this.count != null) {
                sb.append(", count=");
                sb.append(this.count);
            }
            if (this.openScore != null) {
                sb.append(", open_score=");
                sb.append(this.openScore);
            }
            if (this.finish != null) {
                sb.append(", finish=");
                sb.append(this.finish);
            }
            sb.replace(0, 2, "StealTowerData{");
            sb.append('}');
            return sb.toString();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mode != null) {
            sb.append(", mode=");
            sb.append(this.mode);
        }
        if (this.stealTowerData != null) {
            sb.append(", steal_tower_data=");
            sb.append(this.stealTowerData);
        }
        sb.replace(0, 2, "BattleMode{");
        sb.append('}');
        return sb.toString();
    }
}
