package com.ss.android.ugc.aweme.editorpro.toolbanner;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class MAEDraftResponse {

    @C09CT("data")
    public final List<MAEDraftItemData> data;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MAEDraftResponse) && Intrinsics.LJFF(this.data, ((MAEDraftResponse) obj).data);
    }

    public final int hashCode() {
        List<MAEDraftItemData> list = this.data;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MAEDraftResponse(data=");
        sbLIZ.append(this.data);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MAEDraftResponse(List<MAEDraftItemData> list) {
        this.data = list;
    }
}
