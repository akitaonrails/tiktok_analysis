package com.bytedance.sdui.serializedData.common;

import X.C2188811AlT;
import com.bytedance.sdui.serializedData.AbsSerializedData;
import com.bytedance.sdui.serializedData.common.event.ClientEvent;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public final class EventRequest extends AbsSerializedData {
    public String LIZ = "";
    public final String LIZIZ = "";
    public List<ClientEvent> LIZJ;
    public long LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EventRequest(reqUUID='");
        sbLIZ.append(this.LIZ);
        sbLIZ.append("', hash='");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append("', events=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
