package com.ss.android.ugc.tools.chat.data;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class DynamicDisplayData {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("name")
    public final String name;

    public DynamicDisplayData() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DynamicDisplayData)) {
            return false;
        }
        DynamicDisplayData dynamicDisplayData = (DynamicDisplayData) obj;
        return Intrinsics.LJFF(this.id, dynamicDisplayData.id) && Intrinsics.LJFF(this.name, dynamicDisplayData.name);
    }

    public final int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DynamicDisplayData(id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", name=");
        sbLIZ.append(this.name);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public DynamicDisplayData(String str, String str2) {
        this.id = str;
        this.name = str2;
    }
}
