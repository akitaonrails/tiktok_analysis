package com.ss.android.ugc.aweme.poi.detail.container.model;

import X.C09CT;
import X.C1185000gwU;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.poi.detail.gallery.PoiPicture;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PictureAlbum implements Serializable {

    @C09CT("album_mode")
    public final int albumMode;

    @C09CT("has_more")
    public final boolean hasMore;

    @C09CT("image_count_label_show_threshold")
    public final Integer imageCountLabelShowThreshold;

    @C09CT("offset")
    public final int offset;

    @C09CT("pictures")
    public final List<UrlModel> pictures;

    @C09CT("pictures_v2")
    public final List<PoiPicture> poiPictures;

    @C09CT("route_to_gallery")
    public final boolean routeToGallery;

    @C09CT("total_count")
    public final int totalPictureNum;

    @C09CT("ui_type")
    public final Integer uiType;

    public PictureAlbum() {
        this(null, 0, false, 0, 0, false, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PictureAlbum)) {
            return false;
        }
        PictureAlbum pictureAlbum = (PictureAlbum) obj;
        return Intrinsics.LJFF(this.pictures, pictureAlbum.pictures) && this.totalPictureNum == pictureAlbum.totalPictureNum && this.hasMore == pictureAlbum.hasMore && this.offset == pictureAlbum.offset && this.albumMode == pictureAlbum.albumMode && this.routeToGallery == pictureAlbum.routeToGallery && Intrinsics.LJFF(this.poiPictures, pictureAlbum.poiPictures) && Intrinsics.LJFF(this.imageCountLabelShowThreshold, pictureAlbum.imageCountLabelShowThreshold) && Intrinsics.LJFF(this.uiType, pictureAlbum.uiType);
    }

    public int hashCode() {
        List<UrlModel> list = this.pictures;
        int iHashCode = (((((((((((list == null ? 0 : list.hashCode()) * 31) + this.totalPictureNum) * 31) + C786410Ut5.Z2(this.hasMore)) * 31) + this.offset) * 31) + this.albumMode) * 31) + C786410Ut5.Z2(this.routeToGallery)) * 31;
        List<PoiPicture> list2 = this.poiPictures;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.imageCountLabelShowThreshold;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.uiType;
        return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PictureAlbum(pictures=");
        sbLIZ.append(this.pictures);
        sbLIZ.append(", totalPictureNum=");
        sbLIZ.append(this.totalPictureNum);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(", offset=");
        sbLIZ.append(this.offset);
        sbLIZ.append(", albumMode=");
        sbLIZ.append(this.albumMode);
        sbLIZ.append(", routeToGallery=");
        sbLIZ.append(this.routeToGallery);
        sbLIZ.append(", poiPictures=");
        sbLIZ.append(this.poiPictures);
        sbLIZ.append(", imageCountLabelShowThreshold=");
        sbLIZ.append(this.imageCountLabelShowThreshold);
        sbLIZ.append(", uiType=");
        sbLIZ.append(this.uiType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x0074 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x006e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x002a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x002a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Pair<java.util.ArrayList<java.lang.String>, java.util.ArrayList<java.lang.String>> getGalleryImageData() {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.container.model.PictureAlbum.getGalleryImageData():kotlin.Pair");
    }

    public final List<UrlModel> getPicturesByExperiment() {
        if (!C1185000gwU.LIZ()) {
            return this.pictures;
        }
        ArrayList arrayList = new ArrayList();
        List<PoiPicture> list = this.poiPictures;
        if (list == null) {
            return arrayList;
        }
        Iterator<PoiPicture> it2 = list.iterator();
        while (it2.hasNext()) {
            UrlModel urlModel = it2.next().urlModel;
            if (urlModel != null) {
                arrayList.add(urlModel);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PictureAlbum(List<? extends UrlModel> list, int i, boolean z, int i2, int i3, boolean z2, List<PoiPicture> list2, Integer num, Integer num2) {
        this.pictures = list;
        this.totalPictureNum = i;
        this.hasMore = z;
        this.offset = i2;
        this.albumMode = i3;
        this.routeToGallery = z2;
        this.poiPictures = list2;
        this.imageCountLabelShowThreshold = num;
        this.uiType = num2;
    }
}
