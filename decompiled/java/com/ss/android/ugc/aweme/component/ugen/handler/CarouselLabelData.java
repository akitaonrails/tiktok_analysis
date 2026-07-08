package com.ss.android.ugc.aweme.component.ugen.handler;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class CarouselLabelData {

    @C09CT("common_data")
    public final LabelCommonData commonData;

    @C09CT("frontend_params")
    public final String frontendParams;

    @C09CT("photo_carousel_info")
    public final LabelPhotoCarouselInfo photoCarouselInfo;

    public CarouselLabelData() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarouselLabelData)) {
            return false;
        }
        CarouselLabelData carouselLabelData = (CarouselLabelData) obj;
        return Intrinsics.LJFF(this.commonData, carouselLabelData.commonData) && Intrinsics.LJFF(this.photoCarouselInfo, carouselLabelData.photoCarouselInfo) && Intrinsics.LJFF(this.frontendParams, carouselLabelData.frontendParams);
    }

    public final int hashCode() {
        LabelCommonData labelCommonData = this.commonData;
        int iHashCode = (labelCommonData == null ? 0 : labelCommonData.hashCode()) * 31;
        LabelPhotoCarouselInfo labelPhotoCarouselInfo = this.photoCarouselInfo;
        int iHashCode2 = (iHashCode + (labelPhotoCarouselInfo == null ? 0 : labelPhotoCarouselInfo.hashCode())) * 31;
        String str = this.frontendParams;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CarouselLabelData(commonData=");
        sbLIZ.append(this.commonData);
        sbLIZ.append(", photoCarouselInfo=");
        sbLIZ.append(this.photoCarouselInfo);
        sbLIZ.append(", frontendParams=");
        sbLIZ.append(this.frontendParams);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CarouselLabelData(LabelCommonData labelCommonData, LabelPhotoCarouselInfo labelPhotoCarouselInfo, String str) {
        this.commonData = labelCommonData;
        this.photoCarouselInfo = labelPhotoCarouselInfo;
        this.frontendParams = str;
    }
}
