package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class EcPdpStoreRecommendColorPair {

    @C09CT("dark")
    public final String dark;

    @C09CT("light")
    public final String light;

    public EcPdpStoreRecommendColorPair() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EcPdpStoreRecommendColorPair)) {
            return false;
        }
        EcPdpStoreRecommendColorPair ecPdpStoreRecommendColorPair = (EcPdpStoreRecommendColorPair) obj;
        return Intrinsics.LJFF(this.dark, ecPdpStoreRecommendColorPair.dark) && Intrinsics.LJFF(this.light, ecPdpStoreRecommendColorPair.light);
    }

    public final int hashCode() {
        String str = this.dark;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.light;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EcPdpStoreRecommendColorPair(dark=");
        sbLIZ.append(this.dark);
        sbLIZ.append(", light=");
        sbLIZ.append(this.light);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public EcPdpStoreRecommendColorPair(String str, String str2) {
        this.dark = str;
        this.light = str2;
    }
}
