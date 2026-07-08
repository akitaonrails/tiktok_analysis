package com.ss.android.ugc.aweme.requesttask.idle.experment;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes4.dex */
public class LowStorageGeckoUnloadHighSettings$LowStorageGeckoUnloadHighModel {

    @C09CT("enable")
    public boolean enable;

    @C09CT("low_storage_size")
    public long lowStorageSize;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LowStorageGeckoUnloadHighModel{lowStorageSize=");
        sbLIZ.append(this.lowStorageSize);
        sbLIZ.append(", enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
