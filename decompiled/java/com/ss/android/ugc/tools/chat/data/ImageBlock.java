package com.ss.android.ugc.tools.chat.data;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ImageBlock {

    @C09CT("author")
    public final Author author;

    @C09CT("display_name")
    public final String displayName;

    @C09CT("fallback_icon_type")
    public final Integer fallbackIconType;

    @C09CT("features")
    public final ImageFeatures features;

    @C09CT("image_id")
    public final String imageId;

    @C09CT("index")
    public final Integer index;

    @C09CT("resolution")
    public final Resolution resolution;

    @C09CT("url_list")
    public final List<String> urlList;

    public ImageBlock() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageBlock)) {
            return false;
        }
        ImageBlock imageBlock = (ImageBlock) obj;
        return Intrinsics.LJFF(this.imageId, imageBlock.imageId) && Intrinsics.LJFF(this.urlList, imageBlock.urlList) && Intrinsics.LJFF(this.displayName, imageBlock.displayName) && Intrinsics.LJFF(this.resolution, imageBlock.resolution) && Intrinsics.LJFF(this.fallbackIconType, imageBlock.fallbackIconType) && Intrinsics.LJFF(this.author, imageBlock.author) && Intrinsics.LJFF(this.index, imageBlock.index) && Intrinsics.LJFF(this.features, imageBlock.features);
    }

    public final int hashCode() {
        String str = this.imageId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.urlList;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.displayName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Resolution resolution = this.resolution;
        int iHashCode4 = (iHashCode3 + (resolution == null ? 0 : resolution.hashCode())) * 31;
        Integer num = this.fallbackIconType;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Author author = this.author;
        int iHashCode6 = (iHashCode5 + (author == null ? 0 : author.hashCode())) * 31;
        Integer num2 = this.index;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        ImageFeatures imageFeatures = this.features;
        return iHashCode7 + (imageFeatures != null ? imageFeatures.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImageBlock(imageId=");
        sbLIZ.append(this.imageId);
        sbLIZ.append(", urlList=");
        sbLIZ.append(this.urlList);
        sbLIZ.append(", displayName=");
        sbLIZ.append(this.displayName);
        sbLIZ.append(", resolution=");
        sbLIZ.append(this.resolution);
        sbLIZ.append(", fallbackIconType=");
        sbLIZ.append(this.fallbackIconType);
        sbLIZ.append(", author=");
        sbLIZ.append(this.author);
        sbLIZ.append(", index=");
        sbLIZ.append(this.index);
        sbLIZ.append(", features=");
        sbLIZ.append(this.features);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ImageBlock(String str, List<String> list, String str2, Resolution resolution, Integer num, Author author, Integer num2, ImageFeatures imageFeatures) {
        this.imageId = str;
        this.urlList = list;
        this.displayName = str2;
        this.resolution = resolution;
        this.fallbackIconType = num;
        this.author = author;
        this.index = num2;
        this.features = imageFeatures;
    }

    public ImageBlock(String str, List list, String str2, Resolution resolution, Integer num, Author author, Integer num2, ImageFeatures imageFeatures, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? C13BV.INSTANCE : list, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : resolution, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : author, (i & 64) != 0 ? null : num2, (i & 128) == 0 ? imageFeatures : null);
    }
}
