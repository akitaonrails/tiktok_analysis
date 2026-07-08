package com.ss.android.ugc.aweme.cktemplate.resource.impl;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class MaterialResourceListRespone {

    @C09CT("message")
    public final String message;

    @C09CT("resources")
    public final List<ResourceItem> resources;

    @C09CT("status_code")
    public final int statusCode;

    public MaterialResourceListRespone() {
        this(0, null, null, 7, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MaterialResourceListRespone)) {
            return false;
        }
        MaterialResourceListRespone materialResourceListRespone = (MaterialResourceListRespone) obj;
        return this.statusCode == materialResourceListRespone.statusCode && Intrinsics.LJFF(this.message, materialResourceListRespone.message) && Intrinsics.LJFF(this.resources, materialResourceListRespone.resources);
    }

    public int hashCode() {
        int i = this.statusCode * 31;
        String str = this.message;
        return ((i + (str == null ? 0 : str.hashCode())) * 31) + this.resources.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MaterialResourceListRespone(statusCode=");
        sbLIZ.append(this.statusCode);
        sbLIZ.append(", message=");
        sbLIZ.append(this.message);
        sbLIZ.append(", resources=");
        sbLIZ.append(this.resources);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MaterialResourceListRespone(int i, String str, List<ResourceItem> list) {
        this.statusCode = i;
        this.message = str;
        this.resources = list;
    }

    public MaterialResourceListRespone(int i, String str, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? C13BV.INSTANCE : list);
    }
}
