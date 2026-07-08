package com.bytedance.sdui.serializedData.common;

import X.C2188811AlT;
import com.bytedance.sdui.serializedData.AbsSerializedData;

/* JADX INFO: loaded from: classes21.dex */
public final class CommonResponse extends AbsSerializedData {
    public int LIZ;
    public String LIZIZ = "";

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommonResponse(code=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", msg='");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append("')");
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
