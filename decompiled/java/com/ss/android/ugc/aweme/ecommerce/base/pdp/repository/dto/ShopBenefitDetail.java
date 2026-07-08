package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopBenefitDetail;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ShopBenefitDetail implements Parcelable {

    @C09CT("content")
    public String content;

    @C09CT("count_show_content")
    public String countShowContent;

    @C09CT("benefit_image_dark")
    public Image imageDark;

    @C09CT("benefit_image_light")
    public Image imageLight;

    @C09CT("benefit_text_color_dark")
    public String textColorDark;

    @C09CT("benefit_text_color_light")
    public String textColorLight;
    public static final Parcelable.Creator<ShopBenefitDetail> CREATOR = new Parcelable.Creator<ShopBenefitDetail>() { // from class: X.02Hn
        @Override // android.os.Parcelable.Creator
        public final ShopBenefitDetail createFromParcel(Parcel parcel) {
            return new ShopBenefitDetail(parcel.readString(), parcel.readString(), (Image) parcel.readParcelable(ShopBenefitDetail.class.getClassLoader()), (Image) parcel.readParcelable(ShopBenefitDetail.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ShopBenefitDetail[] newArray(int i) {
            return new ShopBenefitDetail[i];
        }
    };
    public static final int $stable = 8;

    public ShopBenefitDetail() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopBenefitDetail)) {
            return false;
        }
        ShopBenefitDetail shopBenefitDetail = (ShopBenefitDetail) obj;
        return Intrinsics.LJFF(this.content, shopBenefitDetail.content) && Intrinsics.LJFF(this.countShowContent, shopBenefitDetail.countShowContent) && Intrinsics.LJFF(this.imageLight, shopBenefitDetail.imageLight) && Intrinsics.LJFF(this.imageDark, shopBenefitDetail.imageDark) && Intrinsics.LJFF(this.textColorLight, shopBenefitDetail.textColorLight) && Intrinsics.LJFF(this.textColorDark, shopBenefitDetail.textColorDark);
    }

    public final int hashCode() {
        String str = this.content;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.countShowContent;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Image image = this.imageLight;
        int iHashCode3 = (iHashCode2 + (image == null ? 0 : image.hashCode())) * 31;
        Image image2 = this.imageDark;
        int iHashCode4 = (iHashCode3 + (image2 == null ? 0 : image2.hashCode())) * 31;
        String str3 = this.textColorLight;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.textColorDark;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShopBenefitDetail(content=");
        sbLIZ.append(this.content);
        sbLIZ.append(", countShowContent=");
        sbLIZ.append(this.countShowContent);
        sbLIZ.append(", imageLight=");
        sbLIZ.append(this.imageLight);
        sbLIZ.append(", imageDark=");
        sbLIZ.append(this.imageDark);
        sbLIZ.append(", textColorLight=");
        sbLIZ.append(this.textColorLight);
        sbLIZ.append(", textColorDark=");
        sbLIZ.append(this.textColorDark);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.content);
        parcel.writeString(this.countShowContent);
        parcel.writeParcelable(this.imageLight, i);
        parcel.writeParcelable(this.imageDark, i);
        parcel.writeString(this.textColorLight);
        parcel.writeString(this.textColorDark);
    }

    public ShopBenefitDetail(String str, String str2, Image image, Image image2, String str3, String str4) {
        this.content = str;
        this.countShowContent = str2;
        this.imageLight = image;
        this.imageDark = image2;
        this.textColorLight = str3;
        this.textColorDark = str4;
    }
}
