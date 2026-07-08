package com.bytedance.effectcreatormobile.ckeapi.api.facefusion;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class FaceFusionGanData {

    @C09CT("meta_data")
    public FaceFusionGanMetaData metaData;

    @C09CT("path")
    public final String path;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FaceFusionGanData)) {
            return false;
        }
        FaceFusionGanData faceFusionGanData = (FaceFusionGanData) obj;
        return Intrinsics.LJFF(this.path, faceFusionGanData.path) && Intrinsics.LJFF(this.metaData, faceFusionGanData.metaData);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FaceFusionGanData(path=");
        sbLIZ.append(this.path);
        sbLIZ.append(", metaData=");
        sbLIZ.append(this.metaData);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setMetaData(FaceFusionGanMetaData faceFusionGanMetaData) {
        this.metaData = faceFusionGanMetaData;
    }

    public FaceFusionGanData(String str, FaceFusionGanMetaData faceFusionGanMetaData) {
        this.path = str;
        this.metaData = faceFusionGanMetaData;
    }
}
