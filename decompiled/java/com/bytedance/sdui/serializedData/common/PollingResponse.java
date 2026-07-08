package com.bytedance.sdui.serializedData.common;

import X.C2188811AlT;
import com.bytedance.sdui.serializedData.AbsSerializedData;

/* JADX INFO: loaded from: classes21.dex */
public final class PollingResponse extends AbsSerializedData {
    public String LIZ;
    public Frame LIZIZ;
    public AbsSerializedData LIZJ;
    public AbsSerializedData LIZLLL;
    public CommonResponse LJ;
    public String LJFF = "";
    public String LJI = "";
    public ACKResponse LJII;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PollingResponse(sessionId=");
        sbLIZ.append((Object) this.LIZ);
        sbLIZ.append(", frame=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", heartbeat=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", end=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", error=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", reqUUID='");
        sbLIZ.append(this.LJFF);
        sbLIZ.append("', logId='");
        sbLIZ.append(this.LJI);
        sbLIZ.append("')");
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
