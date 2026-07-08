package com.ss.android.ugc.aweme.cktemplate.resource.impl;

import X.C13BV;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class MaterialResourceResult {
    public final List<String> cdnList;
    public final String ext;
    public final String resourceKey;
    public final String uri;

    public MaterialResourceResult() {
        this(null, null, null, null, 15, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MaterialResourceResult)) {
            return false;
        }
        MaterialResourceResult materialResourceResult = (MaterialResourceResult) obj;
        return Intrinsics.LJFF(this.resourceKey, materialResourceResult.resourceKey) && Intrinsics.LJFF(this.cdnList, materialResourceResult.cdnList) && Intrinsics.LJFF(this.ext, materialResourceResult.ext) && Intrinsics.LJFF(this.uri, materialResourceResult.uri);
    }

    public int hashCode() {
        return (((((this.resourceKey.hashCode() * 31) + this.cdnList.hashCode()) * 31) + this.ext.hashCode()) * 31) + this.uri.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MaterialResourceResult(resourceKey=");
        sbLIZ.append(this.resourceKey);
        sbLIZ.append(", cdnList=");
        sbLIZ.append(this.cdnList);
        sbLIZ.append(", ext=");
        sbLIZ.append(this.ext);
        sbLIZ.append(", uri=");
        sbLIZ.append(this.uri);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MaterialResourceResult(String str, List<String> list, String str2, String str3) {
        this.resourceKey = str;
        this.cdnList = list;
        this.ext = str2;
        this.uri = str3;
    }

    public MaterialResourceResult(String str, List list, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? C13BV.INSTANCE : list, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3);
    }
}
