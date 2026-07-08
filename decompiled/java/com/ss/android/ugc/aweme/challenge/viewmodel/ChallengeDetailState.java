package com.ss.android.ugc.aweme.challenge.viewmodel;

import X.AbstractC1252750ihl;
import X.C004I;
import X.C1252530ihP;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class ChallengeDetailState implements C004I {
    public final AbstractC1252750ihl<ChallengeDetail> challengeDetail;

    public final ChallengeDetailState copy(AbstractC1252750ihl<? extends ChallengeDetail> abstractC1252750ihl) {
        return new ChallengeDetailState(abstractC1252750ihl);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChallengeDetailState) && Intrinsics.LJFF(this.challengeDetail, ((ChallengeDetailState) obj).challengeDetail);
    }

    public int hashCode() {
        return this.challengeDetail.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ChallengeDetailState(challengeDetail=");
        sbLIZ.append(this.challengeDetail);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ChallengeDetailState() {
        this(C1252530ihP.LIZ);
    }

    public final AbstractC1252750ihl<ChallengeDetail> getChallengeDetail() {
        return this.challengeDetail;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChallengeDetailState(AbstractC1252750ihl<? extends ChallengeDetail> abstractC1252750ihl) {
        this.challengeDetail = abstractC1252750ihl;
    }
}
