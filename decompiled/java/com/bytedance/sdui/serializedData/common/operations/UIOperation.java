package com.bytedance.sdui.serializedData.common.operations;

import X.C2188811AlT;
import com.bytedance.sdui.serializedData.AbsSerializedData;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public final class UIOperation extends AbsSerializedData {
    public String LIZ;
    public List<String> LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public Long LJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UiOperation(sign=");
        sbLIZ.append((Object) this.LIZ);
        sbLIZ.append(", nodes=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", method=");
        sbLIZ.append((Object) this.LIZJ);
        sbLIZ.append(", params=");
        sbLIZ.append((Object) this.LIZLLL);
        sbLIZ.append(", callbackId=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
