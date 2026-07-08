package com.bytedance.sdui.serializedData.common.operations;

import X.C2188811AlT;
import com.bytedance.sdui.serializedData.AbsSerializedData;

/* JADX INFO: loaded from: classes21.dex */
public final class TreeOperation extends AbsSerializedData {
    public long LIZ;
    public long LIZIZ;
    public long LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("P=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(",C=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(",I=");
        sbLIZ.append(this.LIZJ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
