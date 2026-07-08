package com.ss.android.ugc.aweme.iap.component.api;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class PGCImage {

    @C09CT("height")
    public final Integer height;

    @C09CT("uri")
    public final String uri;

    @C09CT("url")
    public final String url;

    @C09CT("width")
    public final Integer width;

    public PGCImage() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PGCImage)) {
            return false;
        }
        PGCImage pGCImage = (PGCImage) obj;
        return Intrinsics.LJFF(this.url, pGCImage.url) && Intrinsics.LJFF(this.uri, pGCImage.uri) && Intrinsics.LJFF(this.width, pGCImage.width) && Intrinsics.LJFF(this.height, pGCImage.height);
    }

    public final int hashCode() {
        String str = this.url;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.uri;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.width;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.height;
        return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PGCImage(url=");
        sbLIZ.append(this.url);
        sbLIZ.append(", uri=");
        sbLIZ.append(this.uri);
        sbLIZ.append(", width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PGCImage(String str, String str2, Integer num, Integer num2) {
        this.url = str;
        this.uri = str2;
        this.width = num;
        this.height = num2;
    }
}
