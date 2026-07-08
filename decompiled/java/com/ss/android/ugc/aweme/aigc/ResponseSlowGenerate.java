package com.ss.android.ugc.aweme.aigc;

import X.AbstractC2126608Uu;
import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC2126708Uv;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class ResponseSlowGenerate extends AbstractC2126608Uu {

    @C09CT("remain_quotas")
    public final List<Quota> remainQuota;

    @C09CT("status_code")
    @InterfaceC2126708Uv
    public final int status_code;

    @C09CT("status_msg")
    public final String status_msg;

    @C09CT("task_id")
    public final String taskId;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResponseSlowGenerate)) {
            return false;
        }
        ResponseSlowGenerate responseSlowGenerate = (ResponseSlowGenerate) obj;
        return this.status_code == responseSlowGenerate.status_code && Intrinsics.LJFF(this.status_msg, responseSlowGenerate.status_msg) && Intrinsics.LJFF(this.taskId, responseSlowGenerate.taskId) && Intrinsics.LJFF(this.remainQuota, responseSlowGenerate.remainQuota);
    }

    public final int hashCode() {
        int i = this.status_code * 31;
        String str = this.status_msg;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.taskId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<Quota> list = this.remainQuota;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ResponseSlowGenerate(status_code=");
        sbLIZ.append(this.status_code);
        sbLIZ.append(", status_msg=");
        sbLIZ.append(this.status_msg);
        sbLIZ.append(", taskId=");
        sbLIZ.append(this.taskId);
        sbLIZ.append(", remainQuota=");
        sbLIZ.append(this.remainQuota);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ResponseSlowGenerate(int i, String str, String str2, List<Quota> list) {
        this.status_code = i;
        this.status_msg = str;
        this.taskId = str2;
        this.remainQuota = list;
    }
}
