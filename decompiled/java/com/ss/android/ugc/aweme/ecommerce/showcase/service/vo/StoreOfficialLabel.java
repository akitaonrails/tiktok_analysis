package com.ss.android.ugc.aweme.ecommerce.showcase.service.vo;

import X.C09CT;
import X.C2188811AlT;
import X.C960203pA;
import X.EnumC951803no;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StarShopSeeMoreWindow;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreOfficialLabel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class StoreOfficialLabel implements Parcelable {
    public static final Parcelable.Creator<StoreOfficialLabel> CREATOR = new Parcelable.Creator<StoreOfficialLabel>() { // from class: X.02aD
        @Override // android.os.Parcelable.Creator
        public final StoreOfficialLabel createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Integer numValueOf2;
            Image image = (Image) parcel.readParcelable(StoreOfficialLabel.class.getClassLoader());
            Image image2 = (Image) parcel.readParcelable(StoreOfficialLabel.class.getClassLoader());
            StarShopSeeMoreWindow starShopSeeMoreWindowCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                starShopSeeMoreWindowCreateFromParcel = StarShopSeeMoreWindow.CREATOR.createFromParcel(parcel);
            }
            return new StoreOfficialLabel(image, image2, numValueOf, string, numValueOf2, starShopSeeMoreWindowCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final StoreOfficialLabel[] newArray(int i) {
            return new StoreOfficialLabel[i];
        }
    };

    @C09CT("label_image_dark")
    public Image darkImage;

    @C09CT("label_type")
    public Integer labelType;

    @C09CT("label_type_str")
    public String labelTypeStr;

    @C09CT("label_image_light")
    public Image lightImage;

    @C09CT("position")
    public Integer position;

    @C09CT("see_more")
    public StarShopSeeMoreWindow seeMore;

    public StoreOfficialLabel() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreOfficialLabel)) {
            return false;
        }
        StoreOfficialLabel storeOfficialLabel = (StoreOfficialLabel) obj;
        return Intrinsics.LJFF(this.lightImage, storeOfficialLabel.lightImage) && Intrinsics.LJFF(this.darkImage, storeOfficialLabel.darkImage) && Intrinsics.LJFF(this.labelType, storeOfficialLabel.labelType) && Intrinsics.LJFF(this.labelTypeStr, storeOfficialLabel.labelTypeStr) && Intrinsics.LJFF(this.position, storeOfficialLabel.position) && Intrinsics.LJFF(this.seeMore, storeOfficialLabel.seeMore);
    }

    public final int hashCode() {
        Image image = this.lightImage;
        int iHashCode = (image == null ? 0 : image.hashCode()) * 31;
        Image image2 = this.darkImage;
        int iHashCode2 = (iHashCode + (image2 == null ? 0 : image2.hashCode())) * 31;
        Integer num = this.labelType;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.labelTypeStr;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.position;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        StarShopSeeMoreWindow starShopSeeMoreWindow = this.seeMore;
        return iHashCode5 + (starShopSeeMoreWindow != null ? starShopSeeMoreWindow.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoreOfficialLabel(lightImage=");
        sbLIZ.append(this.lightImage);
        sbLIZ.append(", darkImage=");
        sbLIZ.append(this.darkImage);
        sbLIZ.append(", labelType=");
        sbLIZ.append(this.labelType);
        sbLIZ.append(", labelTypeStr=");
        sbLIZ.append(this.labelTypeStr);
        sbLIZ.append(", position=");
        sbLIZ.append(this.position);
        sbLIZ.append(", seeMore=");
        sbLIZ.append(this.seeMore);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.lightImage, i);
        parcel.writeParcelable(this.darkImage, i);
        Integer num = this.labelType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.labelTypeStr);
        Integer num2 = this.position;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        StarShopSeeMoreWindow starShopSeeMoreWindow = this.seeMore;
        if (starShopSeeMoreWindow == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            starShopSeeMoreWindow.writeToParcel(parcel, i);
        }
    }

    public final Image LIZ(Context context) {
        Image image;
        if (C960203pA.LIZIZ(context) && (image = this.darkImage) != null) {
            return image;
        }
        return this.lightImage;
    }

    public final int LIZIZ(EnumC951803no enumC951803no, EnumC951803no enumC951803no2) {
        Integer num = this.position;
        if (num != null && num.intValue() == enumC951803no.getValue()) {
            return num.intValue();
        }
        return enumC951803no2.getValue();
    }

    public StoreOfficialLabel(Image image, Image image2, Integer num, String str, Integer num2, StarShopSeeMoreWindow starShopSeeMoreWindow) {
        this.lightImage = image;
        this.darkImage = image2;
        this.labelType = num;
        this.labelTypeStr = str;
        this.position = num2;
        this.seeMore = starShopSeeMoreWindow;
    }
}
