package com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AIGCImageData implements Serializable {

    @C09CT("height")
    public final Integer height;

    @C09CT("thumbnail_url")
    public final String thumbnailUrl;

    @C09CT("url")
    public final String url;

    @C09CT("width")
    public final Integer width;

    public AIGCImageData() {
        this(null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIGCImageData)) {
            return false;
        }
        AIGCImageData aIGCImageData = (AIGCImageData) obj;
        return Intrinsics.LJFF(this.url, aIGCImageData.url) && Intrinsics.LJFF(this.width, aIGCImageData.width) && Intrinsics.LJFF(this.height, aIGCImageData.height) && Intrinsics.LJFF(this.thumbnailUrl, aIGCImageData.thumbnailUrl);
    }

    public int hashCode() {
        String str = this.url;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.width;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.height;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.thumbnailUrl;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGCImageData(url=");
        sbLIZ.append(this.url);
        sbLIZ.append(", width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", thumbnailUrl=");
        sbLIZ.append(this.thumbnailUrl);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AIGCImageData(String str, Integer num, Integer num2, String str2) {
        this.url = str;
        this.width = num;
        this.height = num2;
        this.thumbnailUrl = str2;
    }
}
