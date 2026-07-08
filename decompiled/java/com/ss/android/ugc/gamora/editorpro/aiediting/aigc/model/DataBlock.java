package com.ss.android.ugc.gamora.editorpro.aiediting.aigc.model;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class DataBlock {

    @C09CT("afr_data")
    public final List<AfrItem> afrData;

    public DataBlock() {
        this(null, 1, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DataBlock) && Intrinsics.LJFF(this.afrData, ((DataBlock) obj).afrData);
    }

    public final int hashCode() {
        return this.afrData.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DataBlock(afrData=");
        sbLIZ.append(this.afrData);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public DataBlock(List<AfrItem> list) {
        this.afrData = list;
    }

    public DataBlock(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
