package com.ss.android.ugc.aweme.music.understanding.api;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ExtraParams {

    @C09CT("has_local_content_emb")
    public final Integer hasLocalContentEmb;

    @C09CT("music_server_call_recommend_cost_ms")
    public final Long musicServerCallRecommendCostMs;

    @C09CT("music_server_cost_ms")
    public final Long musicServerCostMs;

    @C09CT("recommend_understanding_cost_ms")
    public final Long recommendUnderstandingCostMs;

    public ExtraParams() {
        this(null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExtraParams)) {
            return false;
        }
        ExtraParams extraParams = (ExtraParams) obj;
        return Intrinsics.LJFF(this.musicServerCostMs, extraParams.musicServerCostMs) && Intrinsics.LJFF(this.musicServerCallRecommendCostMs, extraParams.musicServerCallRecommendCostMs) && Intrinsics.LJFF(this.recommendUnderstandingCostMs, extraParams.recommendUnderstandingCostMs) && Intrinsics.LJFF(this.hasLocalContentEmb, extraParams.hasLocalContentEmb);
    }

    public int hashCode() {
        Long l = this.musicServerCostMs;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.musicServerCallRecommendCostMs;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.recommendUnderstandingCostMs;
        int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Integer num = this.hasLocalContentEmb;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExtraParams(musicServerCostMs=");
        sbLIZ.append(this.musicServerCostMs);
        sbLIZ.append(", musicServerCallRecommendCostMs=");
        sbLIZ.append(this.musicServerCallRecommendCostMs);
        sbLIZ.append(", recommendUnderstandingCostMs=");
        sbLIZ.append(this.recommendUnderstandingCostMs);
        sbLIZ.append(", hasLocalContentEmb=");
        sbLIZ.append(this.hasLocalContentEmb);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ExtraParams(Long l, Long l2, Long l3, Integer num) {
        this.musicServerCostMs = l;
        this.musicServerCallRecommendCostMs = l2;
        this.recommendUnderstandingCostMs = l3;
        this.hasLocalContentEmb = num;
    }
}
