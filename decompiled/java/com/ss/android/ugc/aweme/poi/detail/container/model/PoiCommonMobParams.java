package com.ss.android.ugc.aweme.poi.detail.container.model;

import X.C1175210ggh;
import X.C2188811AlT;
import X.InterfaceC2753014t;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiCommonMobParams implements Serializable, InterfaceC2753014t {
    public static final C1175210ggh Companion = new Object() { // from class: X.0ggh
    };
    public final PoiGeneralCommonParams poiGeneralCommonParams;
    public final PoiModuleMobCommonParams poiModuleMobCommonParams;
    public final PoiPageMobCommonParams poiPageMobCommonParams;
    public final String sourceId;

    public PoiCommonMobParams() {
        this(null, null, null, "PoiCommonMobParams");
    }

    public final PoiCommonMobParams copy(PoiGeneralCommonParams poiGeneralCommonParams, PoiPageMobCommonParams poiPageMobCommonParams, PoiModuleMobCommonParams poiModuleMobCommonParams, String str) {
        return new PoiCommonMobParams(poiGeneralCommonParams, poiPageMobCommonParams, poiModuleMobCommonParams, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiCommonMobParams)) {
            return false;
        }
        PoiCommonMobParams poiCommonMobParams = (PoiCommonMobParams) obj;
        return Intrinsics.LJFF(this.poiGeneralCommonParams, poiCommonMobParams.poiGeneralCommonParams) && Intrinsics.LJFF(this.poiPageMobCommonParams, poiCommonMobParams.poiPageMobCommonParams) && Intrinsics.LJFF(this.poiModuleMobCommonParams, poiCommonMobParams.poiModuleMobCommonParams) && Intrinsics.LJFF(this.sourceId, poiCommonMobParams.sourceId);
    }

    public int hashCode() {
        PoiGeneralCommonParams poiGeneralCommonParams = this.poiGeneralCommonParams;
        int iHashCode = (poiGeneralCommonParams == null ? 0 : poiGeneralCommonParams.hashCode()) * 31;
        PoiPageMobCommonParams poiPageMobCommonParams = this.poiPageMobCommonParams;
        int iHashCode2 = (iHashCode + (poiPageMobCommonParams == null ? 0 : poiPageMobCommonParams.hashCode())) * 31;
        PoiModuleMobCommonParams poiModuleMobCommonParams = this.poiModuleMobCommonParams;
        return ((iHashCode2 + (poiModuleMobCommonParams != null ? poiModuleMobCommonParams.hashCode() : 0)) * 31) + this.sourceId.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiCommonMobParams(poiGeneralCommonParams=");
        sbLIZ.append(this.poiGeneralCommonParams);
        sbLIZ.append(", poiPageMobCommonParams=");
        sbLIZ.append(this.poiPageMobCommonParams);
        sbLIZ.append(", poiModuleMobCommonParams=");
        sbLIZ.append(this.poiModuleMobCommonParams);
        sbLIZ.append(", sourceId=");
        sbLIZ.append(this.sourceId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final PoiGeneralCommonParams getPoiGeneralCommonParams() {
        return this.poiGeneralCommonParams;
    }

    public final PoiModuleMobCommonParams getPoiModuleMobCommonParams() {
        return this.poiModuleMobCommonParams;
    }

    public final PoiPageMobCommonParams getPoiPageMobCommonParams() {
        return this.poiPageMobCommonParams;
    }

    public String getSourceId() {
        return this.sourceId;
    }

    public PoiCommonMobParams(PoiGeneralCommonParams poiGeneralCommonParams, PoiPageMobCommonParams poiPageMobCommonParams, PoiModuleMobCommonParams poiModuleMobCommonParams, String str) {
        this.poiGeneralCommonParams = poiGeneralCommonParams;
        this.poiPageMobCommonParams = poiPageMobCommonParams;
        this.poiModuleMobCommonParams = poiModuleMobCommonParams;
        this.sourceId = str;
    }
}
