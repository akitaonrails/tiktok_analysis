package com.bytedance.sdui.serializedData.common.operations;

import X.C2188811AlT;
import com.bytedance.sdui.serializedData.AbsSerializedData;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public final class NodeOperation extends AbsSerializedData {
    public Long LIZ;
    public String LIZIZ;
    public Properties LIZJ;
    public List<String> LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NodeOperation(id=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", tag=");
        sbLIZ.append((Object) this.LIZIZ);
        sbLIZ.append(", properties=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", eventListeners=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
