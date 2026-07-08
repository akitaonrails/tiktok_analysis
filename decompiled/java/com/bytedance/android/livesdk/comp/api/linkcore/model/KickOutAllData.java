package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C2188811AlT;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class KickOutAllData {
    public final Map<String, String> customData;
    public final int kickOutAllReason;
    public final int kickOutReason;

    public KickOutAllData() {
        this(null, 0, 2);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("KickOutAllData(customData=");
        sbLIZ.append(this.customData);
        sbLIZ.append(", kickOutAllReason=");
        sbLIZ.append(this.kickOutAllReason);
        sbLIZ.append(", kickOutReason=");
        sbLIZ.append(this.kickOutReason);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public KickOutAllData(Map<String, String> map, int i, int i2) {
        this.customData = map;
        this.kickOutAllReason = i;
        this.kickOutReason = i2;
    }
}
