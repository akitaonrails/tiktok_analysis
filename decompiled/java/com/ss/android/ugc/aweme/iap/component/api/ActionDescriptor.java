package com.ss.android.ugc.aweme.iap.component.api;

import X.C09CT;
import X.C2097608Jq;
import X.C2188811AlT;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ActionDescriptor {

    @C09CT("options")
    public final Map<String, String> options;

    @C09CT("type")
    public final String type;

    public ActionDescriptor() {
        this(null, C2097608Jq.LJ());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionDescriptor)) {
            return false;
        }
        ActionDescriptor actionDescriptor = (ActionDescriptor) obj;
        return Intrinsics.LJFF(this.type, actionDescriptor.type) && Intrinsics.LJFF(this.options, actionDescriptor.options);
    }

    public final int hashCode() {
        String str = this.type;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.options.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ActionDescriptor(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", options=");
        sbLIZ.append(this.options);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ActionDescriptor(String str, Map<String, String> map) {
        this.type = str;
        this.options = map;
    }
}
