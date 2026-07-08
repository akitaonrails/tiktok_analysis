package com.ss.android.ugc.aweme.ml.ab;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class SmartDataTrackConfig {

    @C09CT("configs")
    public List<OneSmartDataTrackConfig> configList;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SmartDataTrackConfig{configList=");
        sbLIZ.append(this.configList);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<OneSmartDataTrackConfig> getConfigList() {
        return this.configList;
    }

    public final void setConfigList(List<OneSmartDataTrackConfig> list) {
        this.configList = list;
    }
}
