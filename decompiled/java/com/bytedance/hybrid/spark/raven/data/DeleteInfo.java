package com.bytedance.hybrid.spark.raven.data;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class DeleteInfo implements Serializable {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final List<String> id;

    public DeleteInfo() {
        this(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DeleteInfo) && Intrinsics.LJFF(this.id, ((DeleteInfo) obj).id);
    }

    public int hashCode() {
        List<String> list = this.id;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DeleteInfo(id=");
        sbLIZ.append(this.id);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public DeleteInfo(List<String> list) {
        this.id = list;
    }
}
