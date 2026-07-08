package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class StandardBizInterest implements Serializable {

    @C09CT("interest_ids")
    public List<Long> interestIds;

    @C09CT("trigger_interest_id")
    public Long triggerInterestId;

    @C09CT("trigger_interest_name")
    public String triggerInterestName;

    public StandardBizInterest() {
        this(null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StandardBizInterest)) {
            return false;
        }
        StandardBizInterest standardBizInterest = (StandardBizInterest) obj;
        return Intrinsics.LJFF(this.interestIds, standardBizInterest.interestIds) && Intrinsics.LJFF(this.triggerInterestId, standardBizInterest.triggerInterestId) && Intrinsics.LJFF(this.triggerInterestName, standardBizInterest.triggerInterestName);
    }

    public int hashCode() {
        List<Long> list = this.interestIds;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Long l = this.triggerInterestId;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.triggerInterestName;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StandardBizInterest(interestIds=");
        sbLIZ.append(this.interestIds);
        sbLIZ.append(", triggerInterestId=");
        sbLIZ.append(this.triggerInterestId);
        sbLIZ.append(", triggerInterestName=");
        sbLIZ.append(this.triggerInterestName);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setInterestIds(List<Long> list) {
        this.interestIds = list;
    }

    public final void setTriggerInterestId(Long l) {
        this.triggerInterestId = l;
    }

    public final void setTriggerInterestName(String str) {
        this.triggerInterestName = str;
    }

    public StandardBizInterest(List<Long> list, Long l, String str) {
        this.interestIds = list;
        this.triggerInterestId = l;
        this.triggerInterestName = str;
    }
}
