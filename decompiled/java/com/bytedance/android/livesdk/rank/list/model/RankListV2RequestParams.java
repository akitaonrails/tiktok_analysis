package com.bytedance.android.livesdk.rank.list.model;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class RankListV2RequestParams {

    @C09CT("anchor_id")
    public Long anchorId;

    @C09CT("gap_interval")
    public long gapInterval;

    @C09CT("league_phase")
    public int leaguePhase;

    @C09CT("rank_type")
    public int rankType;

    @C09CT("room_id")
    public Long roomId;

    @C09CT("use_simple_user")
    public boolean useSimpleUser;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.anchorId != null) {
            sb.append(", anchor_id=");
            sb.append(this.anchorId);
        }
        if (this.roomId != null) {
            sb.append(", room_id=");
            sb.append(this.roomId);
        }
        sb.append(", rank_type=");
        sb.append(this.rankType);
        sb.replace(0, 2, "RankListV2RequestParams{");
        sb.append('}');
        return sb.toString();
    }
}
