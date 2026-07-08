package com.ss.android.ugc.aweme.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes25.dex */
public final class PaidCollectionEpisode implements Serializable {

    @C09CT("has_purchased")
    public final boolean hasPurchased;

    @C09CT("is_intro")
    public final boolean isIntro;

    @C09CT("is_limited_free")
    public final boolean isLimitedFree;

    @C09CT("is_paid")
    public final boolean isPaid;

    @C09CT("num")
    public final int num;

    @C09CT("seq_id")
    public final int seqId;

    @C09CT("video_id")
    public final String vid;

    public PaidCollectionEpisode() {
        this(0, null, false, false, false, 0, false);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PaidCollectionEpisode(num=");
        sbLIZ.append(this.num);
        sbLIZ.append(", vid=");
        sbLIZ.append(this.vid);
        sbLIZ.append(", isPaid=");
        sbLIZ.append(this.isPaid);
        sbLIZ.append(", hasPurchased=");
        sbLIZ.append(this.hasPurchased);
        sbLIZ.append(", isIntro=");
        sbLIZ.append(this.isIntro);
        sbLIZ.append(", seqId=");
        sbLIZ.append(this.seqId);
        sbLIZ.append(", isLimitedFree=");
        sbLIZ.append(this.isLimitedFree);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean isIntro() {
        return this.isIntro;
    }

    public final boolean isLimitedFree() {
        return this.isLimitedFree;
    }

    public final boolean isPaid() {
        return this.isPaid;
    }

    public PaidCollectionEpisode(int i, String str, boolean z, boolean z2, boolean z3, int i2, boolean z4) {
        this.num = i;
        this.vid = str;
        this.isPaid = z;
        this.hasPurchased = z2;
        this.isIntro = z3;
        this.seqId = i2;
        this.isLimitedFree = z4;
    }
}
