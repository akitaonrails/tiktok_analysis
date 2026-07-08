package com.ss.android.ugc.aweme.profilebanner.data;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class ButtonInfo {

    @C09CT("schema_url")
    public final String schemaUrl;

    @C09CT("title")
    public final String title;

    public ButtonInfo() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ButtonInfo)) {
            return false;
        }
        ButtonInfo buttonInfo = (ButtonInfo) obj;
        return Intrinsics.LJFF(this.title, buttonInfo.title) && Intrinsics.LJFF(this.schemaUrl, buttonInfo.schemaUrl);
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.schemaUrl;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ButtonInfo(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", schemaUrl=");
        sbLIZ.append(this.schemaUrl);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ButtonInfo(String str, String str2) {
        this.title = str;
        this.schemaUrl = str2;
    }
}
