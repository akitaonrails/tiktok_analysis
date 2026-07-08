package com.ss.android.ugc.aweme.ml.feature.flash;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes14.dex */
public final class FlashCommonFreeRideApiConfig {
    public final String changeType;
    public final String paramsKey;
    public final int positionType;
    public final boolean reWriteField;
    public final String url;

    public FlashCommonFreeRideApiConfig() {
        this("", "", null, 0, false);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FlashCommonFreeRideApiConfig(url=");
        sbLIZ.append(this.url);
        sbLIZ.append(", paramsKey=");
        sbLIZ.append(this.paramsKey);
        sbLIZ.append(", changeType=");
        sbLIZ.append(this.changeType);
        sbLIZ.append(", positionType=");
        sbLIZ.append(this.positionType);
        sbLIZ.append(", reWriteField=");
        sbLIZ.append(this.reWriteField);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FlashCommonFreeRideApiConfig(String str, String str2, String str3, int i, boolean z) {
        this.url = str;
        this.paramsKey = str2;
        this.changeType = str3;
        this.positionType = i;
        this.reWriteField = z;
    }
}
