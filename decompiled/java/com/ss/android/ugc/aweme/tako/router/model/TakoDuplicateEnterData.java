package com.ss.android.ugc.aweme.tako.router.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class TakoDuplicateEnterData implements Serializable {
    public static final int $stable = 8;

    @C09CT("duplicate_enter_id")
    public String duplicateEnterId;

    @C09CT("duplicate_policy_token")
    public String duplicatePolicyToken;

    @C09CT("force_auto_send")
    public boolean forceAutoSend;

    public TakoDuplicateEnterData() {
        this(null, null, false);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TakoDuplicateEnterData)) {
            return false;
        }
        TakoDuplicateEnterData takoDuplicateEnterData = (TakoDuplicateEnterData) obj;
        return Intrinsics.LJFF(this.duplicatePolicyToken, takoDuplicateEnterData.duplicatePolicyToken) && Intrinsics.LJFF(this.duplicateEnterId, takoDuplicateEnterData.duplicateEnterId) && this.forceAutoSend == takoDuplicateEnterData.forceAutoSend;
    }

    public int hashCode() {
        String str = this.duplicatePolicyToken;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.duplicateEnterId;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.forceAutoSend);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoDuplicateEnterData(duplicatePolicyToken=");
        sbLIZ.append(this.duplicatePolicyToken);
        sbLIZ.append(", duplicateEnterId=");
        sbLIZ.append(this.duplicateEnterId);
        sbLIZ.append(", forceAutoSend=");
        sbLIZ.append(this.forceAutoSend);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setDuplicateEnterId(String str) {
        this.duplicateEnterId = str;
    }

    public final void setDuplicatePolicyToken(String str) {
        this.duplicatePolicyToken = str;
    }

    public final void setForceAutoSend(boolean z) {
        this.forceAutoSend = z;
    }

    public TakoDuplicateEnterData(String str, String str2, boolean z) {
        this.duplicatePolicyToken = str;
        this.duplicateEnterId = str2;
        this.forceAutoSend = z;
    }
}
