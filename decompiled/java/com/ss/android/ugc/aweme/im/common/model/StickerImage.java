package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class StickerImage implements Serializable {

    @C09CT("height")
    public final Integer height;

    @C09CT("image_type")
    public final String imageType;

    @C09CT("uri")
    public final String uri;

    @C09CT("url_list")
    public final List<String> urlList;

    @C09CT("width")
    public final Integer width;

    public StickerImage() {
        this(null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickerImage)) {
            return false;
        }
        StickerImage stickerImage = (StickerImage) obj;
        return Intrinsics.LJFF(this.uri, stickerImage.uri) && Intrinsics.LJFF(this.urlList, stickerImage.urlList) && Intrinsics.LJFF(this.width, stickerImage.width) && Intrinsics.LJFF(this.height, stickerImage.height) && Intrinsics.LJFF(this.imageType, stickerImage.imageType);
    }

    public int hashCode() {
        String str = this.uri;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.urlList;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.width;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.height;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.imageType;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StickerImage(uri=");
        sbLIZ.append(this.uri);
        sbLIZ.append(", urlList=");
        sbLIZ.append(this.urlList);
        sbLIZ.append(", width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", imageType=");
        sbLIZ.append(this.imageType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public StickerImage(String str, List<String> list, Integer num, Integer num2, String str2) {
        this.uri = str;
        this.urlList = list;
        this.width = num;
        this.height = num2;
        this.imageType = str2;
    }
}
