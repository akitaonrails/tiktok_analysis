package com.ss.android.ugc.aweme.aigc;

import X.AbstractC2126608Uu;
import X.C09CT;
import X.C1221640hta;
import X.C15438062q;
import X.C2188811AlT;
import X.InterfaceC2126708Uv;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class ResponseQuickGenerate extends AbstractC2126608Uu {

    @C09CT("avatar_urls")
    public final List<String> avatarUrls;

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
        if (!(obj instanceof ResponseQuickGenerate)) {
            return false;
        }
        ResponseQuickGenerate responseQuickGenerate = (ResponseQuickGenerate) obj;
        return this.status_code == responseQuickGenerate.status_code && Intrinsics.LJFF(this.status_msg, responseQuickGenerate.status_msg) && Intrinsics.LJFF(this.avatarUrls, responseQuickGenerate.avatarUrls) && Intrinsics.LJFF(this.taskId, responseQuickGenerate.taskId) && Intrinsics.LJFF(this.remainQuota, responseQuickGenerate.remainQuota);
    }

    public final int hashCode() {
        int i = this.status_code * 31;
        String str = this.status_msg;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.avatarUrls;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.taskId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<Quota> list2 = this.remainQuota;
        return iHashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ResponseQuickGenerate(status_code=");
        sbLIZ.append(this.status_code);
        sbLIZ.append(", status_msg=");
        sbLIZ.append(this.status_msg);
        sbLIZ.append(", avatarUrls=");
        sbLIZ.append(this.avatarUrls);
        sbLIZ.append(", taskId=");
        sbLIZ.append(this.taskId);
        sbLIZ.append(", remainQuota=");
        sbLIZ.append(this.remainQuota);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final C1221640hta LJ() {
        ArrayList arrayList;
        List<String> list = this.avatarUrls;
        List<Quota> list2 = this.remainQuota;
        if (list2 != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
            for (Quota quota : list2) {
                quota.getClass();
                arrayList.add(new AIGCQuota(quota.quotaType, quota.quotaRemain));
            }
        } else {
            arrayList = null;
        }
        return new C1221640hta(list, arrayList, this.taskId);
    }

    public ResponseQuickGenerate(int i, String str, List<String> list, String str2, List<Quota> list2) {
        this.status_code = i;
        this.status_msg = str;
        this.avatarUrls = list;
        this.taskId = str2;
        this.remainQuota = list2;
    }
}
