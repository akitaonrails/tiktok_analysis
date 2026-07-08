package com.bytedance.im.core.message.media.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class IMImageMetaInfo {

    @C09CT("ImageFormat")
    public final String format;

    @C09CT("ImageHeight")
    public final int height;

    @C09CT("ImageUri")
    public final String imageUri;

    @C09CT("ImageWidth")
    public final int width;

    public IMImageMetaInfo() {
        this(null, 0, 0, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IMImageMetaInfo)) {
            return false;
        }
        IMImageMetaInfo iMImageMetaInfo = (IMImageMetaInfo) obj;
        return Intrinsics.LJFF(this.imageUri, iMImageMetaInfo.imageUri) && this.width == iMImageMetaInfo.width && this.height == iMImageMetaInfo.height && Intrinsics.LJFF(this.format, iMImageMetaInfo.format);
    }

    public final int hashCode() {
        String str = this.imageUri;
        int iHashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.width) * 31) + this.height) * 31;
        String str2 = this.format;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMImageMetaInfo(imageUri=");
        sbLIZ.append(this.imageUri);
        sbLIZ.append(", width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", format=");
        sbLIZ.append(this.format);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public IMImageMetaInfo(String str, int i, int i2, String str2) {
        this.imageUri = str;
        this.width = i;
        this.height = i2;
        this.format = str2;
    }
}
