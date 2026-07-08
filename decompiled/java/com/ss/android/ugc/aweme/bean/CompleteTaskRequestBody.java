package com.ss.android.ugc.aweme.bean;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class CompleteTaskRequestBody implements Serializable {

    @C09CT("campaign_id")
    public final Long campaignId;

    @C09CT("task_name")
    public final String taskName;

    public CompleteTaskRequestBody() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompleteTaskRequestBody)) {
            return false;
        }
        CompleteTaskRequestBody completeTaskRequestBody = (CompleteTaskRequestBody) obj;
        return Intrinsics.LJFF(this.campaignId, completeTaskRequestBody.campaignId) && Intrinsics.LJFF(this.taskName, completeTaskRequestBody.taskName);
    }

    public int hashCode() {
        Long l = this.campaignId;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.taskName;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CompleteTaskRequestBody(campaignId=");
        sbLIZ.append(this.campaignId);
        sbLIZ.append(", taskName=");
        sbLIZ.append(this.taskName);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CompleteTaskRequestBody(Long l, String str) {
        this.campaignId = l;
        this.taskName = str;
    }
}
