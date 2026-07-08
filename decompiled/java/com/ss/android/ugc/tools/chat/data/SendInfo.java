package com.ss.android.ugc.tools.chat.data;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SendInfo {

    @C09CT("cameo_task_id")
    public final String cameoTaskId;

    @C09CT("scenario")
    public final String scenario;

    public SendInfo() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SendInfo)) {
            return false;
        }
        SendInfo sendInfo = (SendInfo) obj;
        return Intrinsics.LJFF(this.scenario, sendInfo.scenario) && Intrinsics.LJFF(this.cameoTaskId, sendInfo.cameoTaskId);
    }

    public final int hashCode() {
        String str = this.scenario;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.cameoTaskId;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SendInfo(scenario=");
        sbLIZ.append(this.scenario);
        sbLIZ.append(", cameoTaskId=");
        sbLIZ.append(this.cameoTaskId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SendInfo(String str, String str2) {
        this.scenario = str;
        this.cameoTaskId = str2;
    }
}
