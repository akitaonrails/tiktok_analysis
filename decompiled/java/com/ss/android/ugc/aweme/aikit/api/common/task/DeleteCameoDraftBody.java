package com.ss.android.ugc.aweme.aikit.api.common.task;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class DeleteCameoDraftBody {

    @C09CT("draft_id")
    public final String draftId;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DeleteCameoDraftBody) && Intrinsics.LJFF(this.draftId, ((DeleteCameoDraftBody) obj).draftId);
    }

    public final int hashCode() {
        String str = this.draftId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DeleteCameoDraftBody(draftId=");
        sbLIZ.append(this.draftId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public DeleteCameoDraftBody(String str) {
        this.draftId = str;
    }
}
