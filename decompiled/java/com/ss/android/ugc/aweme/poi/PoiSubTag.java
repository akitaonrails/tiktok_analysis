package com.ss.android.ugc.aweme.poi;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PoiSubTag implements Serializable {

    @C09CT("name")
    public String name;

    @C09CT("priority")
    public int priority;

    @C09CT("type")
    public Integer type;

    public PoiSubTag() {
        this(null, null, 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiSubTag)) {
            return false;
        }
        PoiSubTag poiSubTag = (PoiSubTag) obj;
        return Intrinsics.LJFF(this.name, poiSubTag.name) && Intrinsics.LJFF(this.type, poiSubTag.type) && this.priority == poiSubTag.priority;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.type;
        return ((iHashCode + (num != null ? num.hashCode() : 0)) * 31) + this.priority;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiSubTag(name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", priority=");
        sbLIZ.append(this.priority);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PoiSubTag(String str, Integer num, int i) {
        this.name = str;
        this.type = num;
        this.priority = i;
    }
}
