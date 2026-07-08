package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.vo;

import X.C09CT;
import X.C2188811AlT;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class SeaPdpAction {

    @C09CT("action_name")
    public final String actionName;

    @C09CT("params")
    public final Map<String, Object> params;

    public SeaPdpAction() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeaPdpAction)) {
            return false;
        }
        SeaPdpAction seaPdpAction = (SeaPdpAction) obj;
        return Intrinsics.LJFF(this.actionName, seaPdpAction.actionName) && Intrinsics.LJFF(this.params, seaPdpAction.params);
    }

    public final int hashCode() {
        String str = this.actionName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map<String, Object> map = this.params;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaPdpAction(actionName=");
        sbLIZ.append(this.actionName);
        sbLIZ.append(", params=");
        sbLIZ.append(this.params);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SeaPdpAction(String str, Map<String, ? extends Object> map) {
        this.actionName = str;
        this.params = map;
    }
}
