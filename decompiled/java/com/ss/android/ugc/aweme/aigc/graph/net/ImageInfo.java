package com.ss.android.ugc.aweme.aigc.graph.net;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class ImageInfo {

    @C09CT("extra")
    public final String extra;

    @C09CT("gender")
    public final Float gender;

    @C09CT("image_type")
    public final Integer imageType;

    @C09CT("skin_color")
    public final String skinColor;

    @C09CT("uri")
    public final String uri;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageInfo)) {
            return false;
        }
        ImageInfo imageInfo = (ImageInfo) obj;
        return Intrinsics.LJFF(this.uri, imageInfo.uri) && Intrinsics.LJFF(this.gender, imageInfo.gender) && Intrinsics.LJFF(this.skinColor, imageInfo.skinColor) && Intrinsics.LJFF(this.extra, imageInfo.extra) && Intrinsics.LJFF(this.imageType, imageInfo.imageType);
    }

    public final int hashCode() {
        String str = this.uri;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Float f = this.gender;
        int iHashCode2 = (iHashCode + (f == null ? 0 : f.hashCode())) * 31;
        String str2 = this.skinColor;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.extra;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.imageType;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImageInfo(uri=");
        sbLIZ.append(this.uri);
        sbLIZ.append(", gender=");
        sbLIZ.append(this.gender);
        sbLIZ.append(", skinColor=");
        sbLIZ.append(this.skinColor);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.extra);
        sbLIZ.append(", imageType=");
        sbLIZ.append(this.imageType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ImageInfo(String str, Float f, String str2, String str3, Integer num) {
        this.uri = str;
        this.gender = f;
        this.skinColor = str2;
        this.extra = str3;
        this.imageType = num;
    }
}
