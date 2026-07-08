package com.ss.android.ugc.aweme.ecommercelive.common.infra.data;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class PlaceholderInfo {

    @C09CT("placeholder")
    public final String placeholder;

    @C09CT("value")
    public final String value;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceholderInfo)) {
            return false;
        }
        PlaceholderInfo placeholderInfo = (PlaceholderInfo) obj;
        return Intrinsics.LJFF(this.placeholder, placeholderInfo.placeholder) && Intrinsics.LJFF(this.value, placeholderInfo.value);
    }

    public final int hashCode() {
        return (this.placeholder.hashCode() * 31) + this.value.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlaceholderInfo(placeholder=");
        sbLIZ.append(this.placeholder);
        sbLIZ.append(", value=");
        sbLIZ.append(this.value);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PlaceholderInfo() {
        this("", "");
    }

    public PlaceholderInfo(String str, String str2) {
        this.placeholder = str;
        this.value = str2;
    }
}
