package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class StickerVariantItem implements Serializable {

    @C09CT("image")
    public final StickerImage image;

    @C09CT("sticker_variant")
    public final Integer stickerVariant;

    @C09CT("thumbnail")
    public final StickerImage thumbnail;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickerVariantItem)) {
            return false;
        }
        StickerVariantItem stickerVariantItem = (StickerVariantItem) obj;
        return Intrinsics.LJFF(this.stickerVariant, stickerVariantItem.stickerVariant) && Intrinsics.LJFF(this.image, stickerVariantItem.image) && Intrinsics.LJFF(this.thumbnail, stickerVariantItem.thumbnail);
    }

    public int hashCode() {
        Integer num = this.stickerVariant;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        StickerImage stickerImage = this.image;
        int iHashCode2 = (iHashCode + (stickerImage == null ? 0 : stickerImage.hashCode())) * 31;
        StickerImage stickerImage2 = this.thumbnail;
        return iHashCode2 + (stickerImage2 != null ? stickerImage2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StickerVariantItem(stickerVariant=");
        sbLIZ.append(this.stickerVariant);
        sbLIZ.append(", image=");
        sbLIZ.append(this.image);
        sbLIZ.append(", thumbnail=");
        sbLIZ.append(this.thumbnail);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public StickerVariantItem(@StickerVariant Integer num, StickerImage stickerImage, StickerImage stickerImage2) {
        this.stickerVariant = num;
        this.image = stickerImage;
        this.thumbnail = stickerImage2;
    }
}
