package com.bytedance.effectcreatormobile.ckeapi.api.facefusion;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes.dex */
public final class FaceFusionGanMetaData {

    @C09CT("key_resource_from_value")
    public final String resourceFrom;

    @C09CT("tracking_type")
    public String trackingType;

    public final FaceFusionGanMetaData copy(String str, String str2) {
        return new FaceFusionGanMetaData(str, str2);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FaceFusionGanMetaData(resourceFrom=");
        sbLIZ.append(this.resourceFrom);
        sbLIZ.append(", trackingType=");
        sbLIZ.append(this.trackingType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setTrackingType(String str) {
        this.trackingType = str;
    }

    public FaceFusionGanMetaData(String str, String str2) {
        this.resourceFrom = str;
        this.trackingType = str2;
    }
}
