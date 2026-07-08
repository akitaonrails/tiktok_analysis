package com.bytedance.sdui.serializedData.common.event;

import X.C2188811AlT;
import com.bytedance.sdui.serializedData.AbsSerializedData;

/* JADX INFO: loaded from: classes21.dex */
public final class GlobalEvent extends AbsSerializedData {
    public String LIZ = "";
    public String LIZIZ = "";

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GlobalEvent(eventName='");
        sbLIZ.append(this.LIZ);
        sbLIZ.append("', paramsJson='");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append("')");
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
