package com.ss.android.ugc.aweme.im.streak.impl.pet.exp;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class GroupExperimentResult implements Serializable {

    @C09CT("conversation_id")
    public final String conversationId;

    @C09CT("feature_result")
    public final List<ExpResult> expResult;

    public GroupExperimentResult() {
        this("", null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupExperimentResult)) {
            return false;
        }
        GroupExperimentResult groupExperimentResult = (GroupExperimentResult) obj;
        return Intrinsics.LJFF(this.conversationId, groupExperimentResult.conversationId) && Intrinsics.LJFF(this.expResult, groupExperimentResult.expResult);
    }

    public int hashCode() {
        int iHashCode = this.conversationId.hashCode() * 31;
        List<ExpResult> list = this.expResult;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GroupExperimentResult(conversationId=");
        sbLIZ.append(this.conversationId);
        sbLIZ.append(", expResult=");
        sbLIZ.append(this.expResult);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public GroupExperimentResult(String str, List<ExpResult> list) {
        this.conversationId = str;
        this.expResult = list;
    }
}
