package com.ss.android.ugc.aweme.ecommercelive.common.infra.data;

import X.C09CT;
import X.C184F;
import X.C2188811AlT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public final class StaticAtmosphereInfo extends C184F {

    @C09CT("atmosphere_type")
    public final int atmosphereType;

    @C09CT("daInfo")
    public final String daInfo;

    @C09CT("duration_ms")
    public final long durationMs;

    @C09CT("icon_info")
    public final IconInfo iconInfo;

    @C09CT("text_info")
    public final AtmosphereTextInfo textInfo;

    public StaticAtmosphereInfo() {
        this(0, null, null, 0L, null);
    }

    @Override // X.C184F
    public final long LIZ() {
        return 0L;
    }

    @Override // X.C184F
    public final int LIZJ() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StaticAtmosphereInfo)) {
            return false;
        }
        StaticAtmosphereInfo staticAtmosphereInfo = (StaticAtmosphereInfo) obj;
        return this.atmosphereType == staticAtmosphereInfo.atmosphereType && Intrinsics.LJFF(this.textInfo, staticAtmosphereInfo.textInfo) && Intrinsics.LJFF(this.iconInfo, staticAtmosphereInfo.iconInfo) && this.durationMs == staticAtmosphereInfo.durationMs && Intrinsics.LJFF(this.daInfo, staticAtmosphereInfo.daInfo);
    }

    public final int hashCode() {
        int i = this.atmosphereType * 31;
        AtmosphereTextInfo atmosphereTextInfo = this.textInfo;
        int iHashCode = (i + (atmosphereTextInfo == null ? 0 : atmosphereTextInfo.hashCode())) * 31;
        IconInfo iconInfo = this.iconInfo;
        int iHashCode2 = (((iHashCode + (iconInfo == null ? 0 : iconInfo.hashCode())) * 31) + C786410Ut5.Y2(this.durationMs)) * 31;
        String str = this.daInfo;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StaticAtmosphereInfo(atmosphereType=");
        sbLIZ.append(this.atmosphereType);
        sbLIZ.append(", textInfo=");
        sbLIZ.append(this.textInfo);
        sbLIZ.append(", iconInfo=");
        sbLIZ.append(this.iconInfo);
        sbLIZ.append(", durationMs=");
        sbLIZ.append(this.durationMs);
        sbLIZ.append(", daInfo=");
        sbLIZ.append(this.daInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C184F
    public final String LIZIZ() {
        return this.daInfo;
    }

    @Override // X.C184F
    public final int LIZLLL() {
        return this.atmosphereType;
    }

    public StaticAtmosphereInfo(int i, AtmosphereTextInfo atmosphereTextInfo, IconInfo iconInfo, long j, String str) {
        this.atmosphereType = i;
        this.textInfo = atmosphereTextInfo;
        this.iconInfo = iconInfo;
        this.durationMs = j;
        this.daInfo = str;
    }
}
