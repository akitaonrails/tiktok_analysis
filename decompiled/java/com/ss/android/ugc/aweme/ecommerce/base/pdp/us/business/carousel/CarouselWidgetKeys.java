package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.CarouselWidgetKeys;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class CarouselWidgetKeys implements Parcelable {

    @C09CT("gallery_carousel_widget_keys")
    public final List<String> galleryCarouselWidgetKeys;

    @C09CT("half_pdp_carousel_widget_keys")
    public final List<String> halfPdpCarouselHeaderKeys;

    @C09CT("pdp_carousel_widget_keys")
    public final List<String> pdpCarouselWidgetKeys;
    public static final Parcelable.Creator<CarouselWidgetKeys> CREATOR = new Parcelable.Creator<CarouselWidgetKeys>() { // from class: X.0vx3
        @Override // android.os.Parcelable.Creator
        public final CarouselWidgetKeys createFromParcel(Parcel parcel) {
            return new CarouselWidgetKeys(parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final CarouselWidgetKeys[] newArray(int i) {
            return new CarouselWidgetKeys[i];
        }
    };
    public static final int $stable = 8;

    public CarouselWidgetKeys() {
        this(null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarouselWidgetKeys)) {
            return false;
        }
        CarouselWidgetKeys carouselWidgetKeys = (CarouselWidgetKeys) obj;
        return Intrinsics.LJFF(this.pdpCarouselWidgetKeys, carouselWidgetKeys.pdpCarouselWidgetKeys) && Intrinsics.LJFF(this.galleryCarouselWidgetKeys, carouselWidgetKeys.galleryCarouselWidgetKeys) && Intrinsics.LJFF(this.halfPdpCarouselHeaderKeys, carouselWidgetKeys.halfPdpCarouselHeaderKeys);
    }

    public final int hashCode() {
        List<String> list = this.pdpCarouselWidgetKeys;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.galleryCarouselWidgetKeys;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.halfPdpCarouselHeaderKeys;
        return iHashCode2 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CarouselWidgetKeys(pdpCarouselWidgetKeys=");
        sbLIZ.append(this.pdpCarouselWidgetKeys);
        sbLIZ.append(", galleryCarouselWidgetKeys=");
        sbLIZ.append(this.galleryCarouselWidgetKeys);
        sbLIZ.append(", halfPdpCarouselHeaderKeys=");
        sbLIZ.append(this.halfPdpCarouselHeaderKeys);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.pdpCarouselWidgetKeys);
        parcel.writeStringList(this.galleryCarouselWidgetKeys);
        parcel.writeStringList(this.halfPdpCarouselHeaderKeys);
    }

    public CarouselWidgetKeys(List<String> list, List<String> list2, List<String> list3) {
        this.pdpCarouselWidgetKeys = list;
        this.galleryCarouselWidgetKeys = list2;
        this.halfPdpCarouselHeaderKeys = list3;
    }
}
