package com.bytedance.hybrid.spark.raven.data;

import X.C09CT;
import X.C1161270gKD;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class InsertInfo implements Serializable {
    public static final C1161270gKD Companion = new Object() { // from class: X.0gKD
    };

    @C09CT("action")
    public final String action;

    @C09CT("group")
    public final String group;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final List<String> id;

    @C09CT("position")
    public final String position;

    public InsertInfo() {
        this(null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InsertInfo)) {
            return false;
        }
        InsertInfo insertInfo = (InsertInfo) obj;
        return Intrinsics.LJFF(this.id, insertInfo.id) && Intrinsics.LJFF(this.group, insertInfo.group) && Intrinsics.LJFF(this.action, insertInfo.action) && Intrinsics.LJFF(this.position, insertInfo.position);
    }

    public int hashCode() {
        List<String> list = this.id;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.group;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.action;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.position;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InsertInfo(id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", group=");
        sbLIZ.append(this.group);
        sbLIZ.append(", action=");
        sbLIZ.append(this.action);
        sbLIZ.append(", position=");
        sbLIZ.append(this.position);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public InsertInfo(List<String> list, String str, String str2, String str3) {
        this.id = list;
        this.group = str;
        this.action = str2;
        this.position = str3;
    }
}
