package com.bytedance.i18n.region.network.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AppStoreInfo {

    @C09CT("country_code")
    public final String countryCode;

    @C09CT("has_gms")
    public final boolean hasGms;

    @C09CT("is_cache")
    public final boolean isCache;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppStoreInfo)) {
            return false;
        }
        AppStoreInfo appStoreInfo = (AppStoreInfo) obj;
        return Intrinsics.LJFF(this.countryCode, appStoreInfo.countryCode) && this.isCache == appStoreInfo.isCache && this.hasGms == appStoreInfo.hasGms;
    }

    public final int hashCode() {
        return (((this.countryCode.hashCode() * 31) + C786410Ut5.Z2(this.isCache)) * 31) + C786410Ut5.Z2(this.hasGms);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AppStoreInfo(countryCode=");
        sbLIZ.append(this.countryCode);
        sbLIZ.append(", isCache=");
        sbLIZ.append(this.isCache);
        sbLIZ.append(", hasGms=");
        sbLIZ.append(this.hasGms);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AppStoreInfo(String str, boolean z, boolean z2) {
        this.countryCode = str;
        this.isCache = z;
        this.hasGms = z2;
    }
}
