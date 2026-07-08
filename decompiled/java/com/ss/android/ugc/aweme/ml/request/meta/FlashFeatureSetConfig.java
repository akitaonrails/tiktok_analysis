package com.ss.android.ugc.aweme.ml.request.meta;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes24.dex */
public final class FlashFeatureSetConfig {

    @C09CT("feature_set")
    public final String featureSet;

    @C09CT("params_key")
    public final String paramsKey;

    @C09CT("pb_key")
    public final String pbKey;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FlashFeatureSetConfig(paramsKey=");
        sbLIZ.append(this.paramsKey);
        sbLIZ.append(", featureSet=");
        sbLIZ.append(this.featureSet);
        sbLIZ.append(", pbKey=");
        sbLIZ.append(this.pbKey);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FlashFeatureSetConfig() {
        this("", "", "pitaya_info");
    }

    public FlashFeatureSetConfig(String str, String str2, String str3) {
        this.paramsKey = str;
        this.featureSet = str2;
        this.pbKey = str3;
    }
}
