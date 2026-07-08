package com.ss.android.ugc.aweme.tako.aivideo.rtc.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class TakoVideoSummaryRequest {

    @C09CT("gid")
    public final String gid;

    @C09CT("uuid")
    public final String uuid;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TakoVideoSummaryRequest)) {
            return false;
        }
        TakoVideoSummaryRequest takoVideoSummaryRequest = (TakoVideoSummaryRequest) obj;
        return Intrinsics.LJFF(this.gid, takoVideoSummaryRequest.gid) && Intrinsics.LJFF(this.uuid, takoVideoSummaryRequest.uuid);
    }

    public final int hashCode() {
        return (this.gid.hashCode() * 31) + this.uuid.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoVideoSummaryRequest(gid=");
        sbLIZ.append(this.gid);
        sbLIZ.append(", uuid=");
        sbLIZ.append(this.uuid);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TakoVideoSummaryRequest() {
        this("", "");
    }

    public TakoVideoSummaryRequest(String str, String str2) {
        this.gid = str;
        this.uuid = str2;
    }
}
