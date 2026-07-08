package com.ss.android.ugc.aweme.favorite;

import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC2753014t;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class NearbyFavoriteMobParams implements Serializable, InterfaceC2753014t {

    @C09CT("enter_from")
    public final String enterFrom;

    public final NearbyFavoriteMobParams copy(String str) {
        return new NearbyFavoriteMobParams(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NearbyFavoriteMobParams) && Intrinsics.LJFF(this.enterFrom, ((NearbyFavoriteMobParams) obj).enterFrom);
    }

    public String getSourceId() {
        return "NearbyFavoriteMobParams";
    }

    public int hashCode() {
        return this.enterFrom.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NearbyFavoriteMobParams(enterFrom=");
        sbLIZ.append(this.enterFrom);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public NearbyFavoriteMobParams() {
        this("");
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public NearbyFavoriteMobParams(String str) {
        this.enterFrom = str;
    }
}
