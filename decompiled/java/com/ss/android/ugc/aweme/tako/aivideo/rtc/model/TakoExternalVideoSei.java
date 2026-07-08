package com.ss.android.ugc.aweme.tako.aivideo.rtc.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class TakoExternalVideoSei {

    @C09CT("gid")
    public final String gid;

    @C09CT("position")
    public final long position;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TakoExternalVideoSei)) {
            return false;
        }
        TakoExternalVideoSei takoExternalVideoSei = (TakoExternalVideoSei) obj;
        return Intrinsics.LJFF(this.gid, takoExternalVideoSei.gid) && this.position == takoExternalVideoSei.position;
    }

    public final int hashCode() {
        return (this.gid.hashCode() * 31) + C786410Ut5.Y2(this.position);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoExternalVideoSei(gid=");
        sbLIZ.append(this.gid);
        sbLIZ.append(", position=");
        sbLIZ.append(this.position);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TakoExternalVideoSei() {
        this("", 0L);
    }

    public TakoExternalVideoSei(String str, long j) {
        this.gid = str;
        this.position = j;
    }
}
