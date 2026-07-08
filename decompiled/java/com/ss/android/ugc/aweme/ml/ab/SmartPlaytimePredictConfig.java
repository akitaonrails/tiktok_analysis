package com.ss.android.ugc.aweme.ml.ab;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class SmartPlaytimePredictConfig {

    @C09CT("services")
    public List<OnePlaytimePredictConfig> serviceList;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("{serviceList=");
        sbLIZ.append(this.serviceList);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<OnePlaytimePredictConfig> getServiceList() {
        return this.serviceList;
    }

    public final void setServiceList(List<OnePlaytimePredictConfig> list) {
        this.serviceList = list;
    }
}
