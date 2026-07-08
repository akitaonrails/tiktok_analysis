package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.DetailsInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionAdditionInfo;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PromotionAdditionInfo implements Parcelable {

    @C09CT("details_info")
    public final DetailsInfo detailInfo;

    @C09CT("addition_info_image")
    public final Image image;
    public static final Parcelable.Creator<PromotionAdditionInfo> CREATOR = new Parcelable.Creator<PromotionAdditionInfo>() { // from class: X.02sh
        @Override // android.os.Parcelable.Creator
        public final PromotionAdditionInfo createFromParcel(Parcel parcel) {
            DetailsInfo detailsInfoCreateFromParcel;
            Image image = (Image) parcel.readParcelable(PromotionAdditionInfo.class.getClassLoader());
            if (parcel.readInt() == 0) {
                detailsInfoCreateFromParcel = null;
            } else {
                detailsInfoCreateFromParcel = DetailsInfo.CREATOR.createFromParcel(parcel);
            }
            return new PromotionAdditionInfo(image, detailsInfoCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PromotionAdditionInfo[] newArray(int i) {
            return new PromotionAdditionInfo[i];
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
        if (!(obj instanceof PromotionAdditionInfo)) {
            return false;
        }
        PromotionAdditionInfo promotionAdditionInfo = (PromotionAdditionInfo) obj;
        return Intrinsics.LJFF(this.image, promotionAdditionInfo.image) && Intrinsics.LJFF(this.detailInfo, promotionAdditionInfo.detailInfo);
    }

    public final int hashCode() {
        Image image = this.image;
        int iHashCode = (image == null ? 0 : image.hashCode()) * 31;
        DetailsInfo detailsInfo = this.detailInfo;
        return iHashCode + (detailsInfo != null ? detailsInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PromotionAdditionInfo(image=");
        sbLIZ.append(this.image);
        sbLIZ.append(", detailInfo=");
        sbLIZ.append(this.detailInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.image, i);
        DetailsInfo detailsInfo = this.detailInfo;
        if (detailsInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            detailsInfo.writeToParcel(parcel, i);
        }
    }

    public PromotionAdditionInfo(Image image, DetailsInfo detailsInfo) {
        this.image = image;
        this.detailInfo = detailsInfo;
    }
}
