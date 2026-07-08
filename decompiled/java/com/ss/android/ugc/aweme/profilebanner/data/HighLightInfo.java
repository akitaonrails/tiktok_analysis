package com.ss.android.ugc.aweme.profilebanner.data;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class HighLightInfo {

    @C09CT("content")
    public final String content;

    @C09CT("schema")
    public final String schemaUrl;

    public HighLightInfo() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HighLightInfo)) {
            return false;
        }
        HighLightInfo highLightInfo = (HighLightInfo) obj;
        return Intrinsics.LJFF(this.content, highLightInfo.content) && Intrinsics.LJFF(this.schemaUrl, highLightInfo.schemaUrl);
    }

    public final int hashCode() {
        String str = this.content;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.schemaUrl;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HighLightInfo(content=");
        sbLIZ.append(this.content);
        sbLIZ.append(", schemaUrl=");
        sbLIZ.append(this.schemaUrl);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public HighLightInfo(String str, String str2) {
        this.content = str;
        this.schemaUrl = str2;
    }
}
