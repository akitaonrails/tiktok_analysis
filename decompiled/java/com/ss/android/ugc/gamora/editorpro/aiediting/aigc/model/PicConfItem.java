package com.ss.android.ugc.gamora.editorpro.aiediting.aigc.model;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class PicConfItem {

    @C09CT("binary_data")
    public final List<String> binaryData;

    public PicConfItem() {
        this(null, 1, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PicConfItem) && Intrinsics.LJFF(this.binaryData, ((PicConfItem) obj).binaryData);
    }

    public final int hashCode() {
        return this.binaryData.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PicConfItem(binaryData=");
        sbLIZ.append(this.binaryData);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PicConfItem(List<String> list) {
        this.binaryData = list;
    }

    public PicConfItem(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
