package com.ss.android.ugc.aweme.friendstab.experiment;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes3.dex */
public final class FriendsV3PerformanceOptConfigV2 {

    @C09CT("enable_async_inflate_assem")
    public final boolean enableAsyncInflateAssem;

    @C09CT("enable_native_async_inflate_fragment")
    public final boolean enableNativeAsyncInflateFragment;

    @C09CT("enable_preload_layout_xml")
    public final boolean enablePreloadLayoutXml;

    @C09CT("enable_x2c_with_async_inflater")
    public final boolean enableX2CWithAsyncInflater;

    public FriendsV3PerformanceOptConfigV2() {
        this(false, false, false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendsV3PerformanceOptConfigV2)) {
            return false;
        }
        FriendsV3PerformanceOptConfigV2 friendsV3PerformanceOptConfigV2 = (FriendsV3PerformanceOptConfigV2) obj;
        return this.enablePreloadLayoutXml == friendsV3PerformanceOptConfigV2.enablePreloadLayoutXml && this.enableAsyncInflateAssem == friendsV3PerformanceOptConfigV2.enableAsyncInflateAssem && this.enableX2CWithAsyncInflater == friendsV3PerformanceOptConfigV2.enableX2CWithAsyncInflater && this.enableNativeAsyncInflateFragment == friendsV3PerformanceOptConfigV2.enableNativeAsyncInflateFragment;
    }

    public final int hashCode() {
        return (((((C786410Ut5.Z2(this.enablePreloadLayoutXml) * 31) + C786410Ut5.Z2(this.enableAsyncInflateAssem)) * 31) + C786410Ut5.Z2(this.enableX2CWithAsyncInflater)) * 31) + C786410Ut5.Z2(this.enableNativeAsyncInflateFragment);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FriendsV3PerformanceOptConfigV2(enablePreloadLayoutXml=");
        sbLIZ.append(this.enablePreloadLayoutXml);
        sbLIZ.append(", enableAsyncInflateAssem=");
        sbLIZ.append(this.enableAsyncInflateAssem);
        sbLIZ.append(", enableX2CWithAsyncInflater=");
        sbLIZ.append(this.enableX2CWithAsyncInflater);
        sbLIZ.append(", enableNativeAsyncInflateFragment=");
        sbLIZ.append(this.enableNativeAsyncInflateFragment);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FriendsV3PerformanceOptConfigV2(boolean z, boolean z2, boolean z3, boolean z4) {
        this.enablePreloadLayoutXml = z;
        this.enableAsyncInflateAssem = z2;
        this.enableX2CWithAsyncInflater = z3;
        this.enableNativeAsyncInflateFragment = z4;
    }
}
