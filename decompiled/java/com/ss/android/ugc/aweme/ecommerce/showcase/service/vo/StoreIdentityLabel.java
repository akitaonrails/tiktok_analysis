package com.ss.android.ugc.aweme.ecommerce.showcase.service.vo;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreIdentityAuthorizedData;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreIdentityBannerStyle;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreIdentityDTCData;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreIdentityLabel;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreIdentityLabelData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class StoreIdentityLabel implements Parcelable {
    public static final Parcelable.Creator<StoreIdentityLabel> CREATOR = new Parcelable.Creator<StoreIdentityLabel>() { // from class: X.02UJ
        @Override // android.os.Parcelable.Creator
        public final StoreIdentityLabel createFromParcel(Parcel parcel) {
            Integer numValueOf;
            StoreIdentityLabelData storeIdentityLabelDataCreateFromParcel;
            StoreIdentityBannerStyle storeIdentityBannerStyleCreateFromParcel;
            StoreIdentityAuthorizedData storeIdentityAuthorizedDataCreateFromParcel;
            StoreIdentityDTCData storeIdentityDTCDataCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                storeIdentityLabelDataCreateFromParcel = null;
            } else {
                storeIdentityLabelDataCreateFromParcel = StoreIdentityLabelData.CREATOR.createFromParcel(parcel);
            }
            StoreIdentityLabelData storeIdentityLabelData = storeIdentityLabelDataCreateFromParcel;
            String string = parcel.readString();
            Image image = (Image) parcel.readParcelable(StoreIdentityLabel.class.getClassLoader());
            if (parcel.readInt() == 0) {
                storeIdentityBannerStyleCreateFromParcel = null;
            } else {
                storeIdentityBannerStyleCreateFromParcel = StoreIdentityBannerStyle.CREATOR.createFromParcel(parcel);
            }
            StoreIdentityBannerStyle storeIdentityBannerStyle = storeIdentityBannerStyleCreateFromParcel;
            if (parcel.readInt() == 0) {
                storeIdentityAuthorizedDataCreateFromParcel = null;
            } else {
                storeIdentityAuthorizedDataCreateFromParcel = StoreIdentityAuthorizedData.CREATOR.createFromParcel(parcel);
            }
            StoreIdentityAuthorizedData storeIdentityAuthorizedData = storeIdentityAuthorizedDataCreateFromParcel;
            if (parcel.readInt() != 0) {
                storeIdentityDTCDataCreateFromParcel = StoreIdentityDTCData.CREATOR.createFromParcel(parcel);
            }
            return new StoreIdentityLabel(numValueOf, storeIdentityLabelData, string, image, storeIdentityBannerStyle, storeIdentityAuthorizedData, storeIdentityDTCDataCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final StoreIdentityLabel[] newArray(int i) {
            return new StoreIdentityLabel[i];
        }
    };

    @C09CT("authorized_data")
    public StoreIdentityAuthorizedData authorizedData;

    @C09CT("banner_style")
    public StoreIdentityBannerStyle bannerStyle;

    @C09CT("brand_logo")
    public Image brandLogo;

    @C09CT("identity_label_data")
    public StoreIdentityLabelData identityLabelData;

    @C09CT("shop_identity_key")
    public String shopIdentityKey;

    @C09CT("dtc_data")
    public StoreIdentityDTCData storeDtcData;

    @C09CT("store_identity_label")
    public Integer storeIdentityLabel;

    public StoreIdentityLabel() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreIdentityLabel)) {
            return false;
        }
        StoreIdentityLabel storeIdentityLabel = (StoreIdentityLabel) obj;
        return Intrinsics.LJFF(this.storeIdentityLabel, storeIdentityLabel.storeIdentityLabel) && Intrinsics.LJFF(this.identityLabelData, storeIdentityLabel.identityLabelData) && Intrinsics.LJFF(this.shopIdentityKey, storeIdentityLabel.shopIdentityKey) && Intrinsics.LJFF(this.brandLogo, storeIdentityLabel.brandLogo) && Intrinsics.LJFF(this.bannerStyle, storeIdentityLabel.bannerStyle) && Intrinsics.LJFF(this.authorizedData, storeIdentityLabel.authorizedData) && Intrinsics.LJFF(this.storeDtcData, storeIdentityLabel.storeDtcData);
    }

    public final int hashCode() {
        Integer num = this.storeIdentityLabel;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        StoreIdentityLabelData storeIdentityLabelData = this.identityLabelData;
        int iHashCode2 = (iHashCode + (storeIdentityLabelData == null ? 0 : storeIdentityLabelData.hashCode())) * 31;
        String str = this.shopIdentityKey;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Image image = this.brandLogo;
        int iHashCode4 = (iHashCode3 + (image == null ? 0 : image.hashCode())) * 31;
        StoreIdentityBannerStyle storeIdentityBannerStyle = this.bannerStyle;
        int iHashCode5 = (iHashCode4 + (storeIdentityBannerStyle == null ? 0 : storeIdentityBannerStyle.hashCode())) * 31;
        StoreIdentityAuthorizedData storeIdentityAuthorizedData = this.authorizedData;
        int iHashCode6 = (iHashCode5 + (storeIdentityAuthorizedData == null ? 0 : storeIdentityAuthorizedData.hashCode())) * 31;
        StoreIdentityDTCData storeIdentityDTCData = this.storeDtcData;
        return iHashCode6 + (storeIdentityDTCData != null ? storeIdentityDTCData.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoreIdentityLabel(storeIdentityLabel=");
        sbLIZ.append(this.storeIdentityLabel);
        sbLIZ.append(", identityLabelData=");
        sbLIZ.append(this.identityLabelData);
        sbLIZ.append(", shopIdentityKey=");
        sbLIZ.append(this.shopIdentityKey);
        sbLIZ.append(", brandLogo=");
        sbLIZ.append(this.brandLogo);
        sbLIZ.append(", bannerStyle=");
        sbLIZ.append(this.bannerStyle);
        sbLIZ.append(", authorizedData=");
        sbLIZ.append(this.authorizedData);
        sbLIZ.append(", storeDtcData=");
        sbLIZ.append(this.storeDtcData);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.storeIdentityLabel;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        StoreIdentityLabelData storeIdentityLabelData = this.identityLabelData;
        if (storeIdentityLabelData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            storeIdentityLabelData.writeToParcel(parcel, i);
        }
        parcel.writeString(this.shopIdentityKey);
        parcel.writeParcelable(this.brandLogo, i);
        StoreIdentityBannerStyle storeIdentityBannerStyle = this.bannerStyle;
        if (storeIdentityBannerStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            storeIdentityBannerStyle.writeToParcel(parcel, i);
        }
        StoreIdentityAuthorizedData storeIdentityAuthorizedData = this.authorizedData;
        if (storeIdentityAuthorizedData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            storeIdentityAuthorizedData.writeToParcel(parcel, i);
        }
        StoreIdentityDTCData storeIdentityDTCData = this.storeDtcData;
        if (storeIdentityDTCData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            storeIdentityDTCData.writeToParcel(parcel, i);
        }
    }

    public StoreIdentityLabel(Integer num, StoreIdentityLabelData storeIdentityLabelData, String str, Image image, StoreIdentityBannerStyle storeIdentityBannerStyle, StoreIdentityAuthorizedData storeIdentityAuthorizedData, StoreIdentityDTCData storeIdentityDTCData) {
        this.storeIdentityLabel = num;
        this.identityLabelData = storeIdentityLabelData;
        this.shopIdentityKey = str;
        this.brandLogo = image;
        this.bannerStyle = storeIdentityBannerStyle;
        this.authorizedData = storeIdentityAuthorizedData;
        this.storeDtcData = storeIdentityDTCData;
    }
}
