package com.ss.android.ugc.aweme.aigc.asynctask.net;

import X.C09CT;
import X.C2188811AlT;

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
