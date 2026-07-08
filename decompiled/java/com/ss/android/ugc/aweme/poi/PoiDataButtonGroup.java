package com.ss.android.ugc.aweme.poi;

import X.C09CT;
import X.C2188811AlT;
import com.google.gson.n;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PoiDataButtonGroup implements Serializable {

    @C09CT("button_list")
    public final List<n> buttonList;

    public PoiDataButtonGroup() {
        this(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PoiDataButtonGroup) && Intrinsics.LJFF(this.buttonList, ((PoiDataButtonGroup) obj).buttonList);
    }

    public int hashCode() {
        List<n> list = this.buttonList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiDataButtonGroup(buttonList=");
        sbLIZ.append(this.buttonList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PoiDataButtonGroup(List<n> list) {
        this.buttonList = list;
    }
}
