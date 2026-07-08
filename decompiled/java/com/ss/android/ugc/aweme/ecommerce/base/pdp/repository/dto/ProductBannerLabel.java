package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBannerLabel;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ProductBannerLabel implements Parcelable {

    @C09CT("event_tracking_name")
    public final String eventTrackingName;

    @C09CT("image")
    public final Image image;

    @C09CT("left_retract")
    public final Integer leftRetract;
    public static final Parcelable.Creator<ProductBannerLabel> CREATOR = new Parcelable.Creator<ProductBannerLabel>() { // from class: X.0mgF
        @Override // android.os.Parcelable.Creator
        public final ProductBannerLabel createFromParcel(Parcel parcel) {
            Integer numValueOf;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new ProductBannerLabel(string, numValueOf, (Image) parcel.readParcelable(ProductBannerLabel.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ProductBannerLabel[] newArray(int i) {
            return new ProductBannerLabel[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductBannerLabel)) {
            return false;
        }
        ProductBannerLabel productBannerLabel = (ProductBannerLabel) obj;
        return Intrinsics.LJFF(this.eventTrackingName, productBannerLabel.eventTrackingName) && Intrinsics.LJFF(this.leftRetract, productBannerLabel.leftRetract) && Intrinsics.LJFF(this.image, productBannerLabel.image);
    }

    public final int hashCode() {
        String str = this.eventTrackingName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.leftRetract;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Image image = this.image;
        return iHashCode2 + (image != null ? image.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProductBannerLabel(eventTrackingName=");
        sbLIZ.append(this.eventTrackingName);
        sbLIZ.append(", leftRetract=");
        sbLIZ.append(this.leftRetract);
        sbLIZ.append(", image=");
        sbLIZ.append(this.image);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        parcel.writeString(this.eventTrackingName);
        Integer num = this.leftRetract;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeParcelable(this.image, i);
    }

    public ProductBannerLabel(String str, Integer num, Image image) {
        this.eventTrackingName = str;
        this.leftRetract = num;
        this.image = image;
    }
}
