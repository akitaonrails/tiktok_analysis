package com.bytedance.sdui.serializedData.common.event;

import X.C2188811AlT;
import com.bytedance.sdui.serializedData.AbsSerializedData;

/* JADX INFO: loaded from: classes21.dex */
public final class CustomEvent extends AbsSerializedData {
    public long LIZIZ;
    public String LIZ = "";
    public String LIZJ = "";
    public String LIZLLL = "";
    public long LJ = -1;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CustomEvent(eventName='");
        sbLIZ.append(this.LIZ);
        sbLIZ.append("', id=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", paramsName='");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append("', paramsJson='");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append("', timeStamp=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
