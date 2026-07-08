package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.footer.bottombar.vo;

import X.C09CT;
import X.C2188811AlT;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class SeaPdpBottomBarBffButtonActionChain {

    @C09CT("name")
    public final String name;

    @C09CT("params")
    public final Map<String, Object> params;

    public SeaPdpBottomBarBffButtonActionChain() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeaPdpBottomBarBffButtonActionChain)) {
            return false;
        }
        SeaPdpBottomBarBffButtonActionChain seaPdpBottomBarBffButtonActionChain = (SeaPdpBottomBarBffButtonActionChain) obj;
        return Intrinsics.LJFF(this.name, seaPdpBottomBarBffButtonActionChain.name) && Intrinsics.LJFF(this.params, seaPdpBottomBarBffButtonActionChain.params);
    }

    public final int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map<String, Object> map = this.params;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaPdpBottomBarBffButtonActionChain(name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", params=");
        sbLIZ.append(this.params);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SeaPdpBottomBarBffButtonActionChain(String str, Map<String, ? extends Object> map) {
        this.name = str;
        this.params = map;
    }
}
