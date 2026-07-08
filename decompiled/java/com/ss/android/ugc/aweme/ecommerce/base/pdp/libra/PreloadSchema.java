package com.ss.android.ugc.aweme.ecommerce.base.pdp.libra;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PreloadSchema {

    @C09CT("gecko_channel")
    public final String geckoChannel;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("preload")
    public final PreloadPhases preload;

    @C09CT("url")
    public final String url;

    public PreloadSchema() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreloadSchema)) {
            return false;
        }
        PreloadSchema preloadSchema = (PreloadSchema) obj;
        return Intrinsics.LJFF(this.id, preloadSchema.id) && Intrinsics.LJFF(this.url, preloadSchema.url) && Intrinsics.LJFF(this.geckoChannel, preloadSchema.geckoChannel) && Intrinsics.LJFF(this.preload, preloadSchema.preload);
    }

    public final int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.url;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.geckoChannel;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        PreloadPhases preloadPhases = this.preload;
        return iHashCode3 + (preloadPhases != null ? preloadPhases.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreloadSchema(id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", url=");
        sbLIZ.append(this.url);
        sbLIZ.append(", geckoChannel=");
        sbLIZ.append(this.geckoChannel);
        sbLIZ.append(", preload=");
        sbLIZ.append(this.preload);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PreloadSchema(String str, String str2, String str3, PreloadPhases preloadPhases) {
        this.id = str;
        this.url = str2;
        this.geckoChannel = str3;
        this.preload = preloadPhases;
    }
}
