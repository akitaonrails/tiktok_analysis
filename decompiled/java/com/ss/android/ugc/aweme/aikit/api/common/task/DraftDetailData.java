package com.ss.android.ugc.aweme.aikit.api.common.task;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class DraftDetailData {

    @C09CT("draft_info")
    public final CameoDraft cameoDraft;

    public DraftDetailData() {
        this(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DraftDetailData) && Intrinsics.LJFF(this.cameoDraft, ((DraftDetailData) obj).cameoDraft);
    }

    public int hashCode() {
        CameoDraft cameoDraft = this.cameoDraft;
        if (cameoDraft == null) {
            return 0;
        }
        return cameoDraft.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DraftDetailData(cameoDraft=");
        sbLIZ.append(this.cameoDraft);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public DraftDetailData(CameoDraft cameoDraft) {
        this.cameoDraft = cameoDraft;
    }
}
