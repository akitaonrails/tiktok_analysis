package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.components.thumbnail;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class ThumbnailComponentData {

    @C09CT("image_list")
    public final List<Image> imageList;

    @C09CT("overlay")
    public final Overlay overlay;

    public ThumbnailComponentData() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThumbnailComponentData)) {
            return false;
        }
        ThumbnailComponentData thumbnailComponentData = (ThumbnailComponentData) obj;
        return Intrinsics.LJFF(this.imageList, thumbnailComponentData.imageList) && Intrinsics.LJFF(this.overlay, thumbnailComponentData.overlay);
    }

    public final int hashCode() {
        List<Image> list = this.imageList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Overlay overlay = this.overlay;
        return iHashCode + (overlay != null ? overlay.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ThumbnailComponentData(imageList=");
        sbLIZ.append(this.imageList);
        sbLIZ.append(", overlay=");
        sbLIZ.append(this.overlay);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ThumbnailComponentData(List<Image> list, Overlay overlay) {
        this.imageList = list;
        this.overlay = overlay;
    }
}
