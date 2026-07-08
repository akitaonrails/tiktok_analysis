package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import X.C699902oH;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SizeGuide;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SizeGuide implements Parcelable {

    @C09CT("is_out_standing")
    public Boolean isOutstanding;

    @C09CT("origin_size_guide_image")
    public Image originSizeGuideImage;

    @C09CT("pdp_size_guide_button")
    public String pdpSizeGuideButtonText;

    @C09CT("show_sale_prop_id")
    public String showSalePropId;

    @C09CT("size_guide_image")
    public Image sizeGuideImage;

    @C09CT("sku_size_guide_button_icon")
    public Icon skuSizeGuideButtonIcon;

    @C09CT("sku_size_guide_button")
    public String skuSizeGuideButtonText;

    @C09CT("sku_size_guide_location")
    public Integer skuSizeGuideLoc;

    @C09CT("sku_size_page_schema")
    public String skuSizeGuideSchema;

    @C09CT("sku_size_guide_title")
    public String skuSizeGuideTitle;
    public static final C699902oH Companion = new Object() { // from class: X.02oH
    };
    public static final Parcelable.Creator<SizeGuide> CREATOR = new Parcelable.Creator<SizeGuide>() { // from class: X.02oG
        @Override // android.os.Parcelable.Creator
        public final SizeGuide createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            Image image = (Image) parcel.readParcelable(SizeGuide.class.getClassLoader());
            Image image2 = (Image) parcel.readParcelable(SizeGuide.class.getClassLoader());
            Integer numValueOf = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Icon icon = (Icon) parcel.readParcelable(SizeGuide.class.getClassLoader());
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new SizeGuide(image, image2, boolValueOf, string, string2, string3, icon, numValueOf, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SizeGuide[] newArray(int i) {
            return new SizeGuide[i];
        }
    };
    public static final int $stable = 8;
    public static final int SIZE_GUIDE_LOC_TOP = 1;
    public static final int SIZE_GUIDE_LOC_SIZE = 2;

    public SizeGuide() {
        this(null, null, null, null, null, null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeGuide)) {
            return false;
        }
        SizeGuide sizeGuide = (SizeGuide) obj;
        return Intrinsics.LJFF(this.sizeGuideImage, sizeGuide.sizeGuideImage) && Intrinsics.LJFF(this.originSizeGuideImage, sizeGuide.originSizeGuideImage) && Intrinsics.LJFF(this.isOutstanding, sizeGuide.isOutstanding) && Intrinsics.LJFF(this.pdpSizeGuideButtonText, sizeGuide.pdpSizeGuideButtonText) && Intrinsics.LJFF(this.skuSizeGuideButtonText, sizeGuide.skuSizeGuideButtonText) && Intrinsics.LJFF(this.skuSizeGuideTitle, sizeGuide.skuSizeGuideTitle) && Intrinsics.LJFF(this.skuSizeGuideButtonIcon, sizeGuide.skuSizeGuideButtonIcon) && Intrinsics.LJFF(this.skuSizeGuideLoc, sizeGuide.skuSizeGuideLoc) && Intrinsics.LJFF(this.skuSizeGuideSchema, sizeGuide.skuSizeGuideSchema) && Intrinsics.LJFF(this.showSalePropId, sizeGuide.showSalePropId);
    }

    public final int hashCode() {
        Image image = this.sizeGuideImage;
        int iHashCode = (image == null ? 0 : image.hashCode()) * 31;
        Image image2 = this.originSizeGuideImage;
        int iHashCode2 = (iHashCode + (image2 == null ? 0 : image2.hashCode())) * 31;
        Boolean bool = this.isOutstanding;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.pdpSizeGuideButtonText;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.skuSizeGuideButtonText;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.skuSizeGuideTitle;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Icon icon = this.skuSizeGuideButtonIcon;
        int iHashCode7 = (iHashCode6 + (icon == null ? 0 : icon.hashCode())) * 31;
        Integer num = this.skuSizeGuideLoc;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.skuSizeGuideSchema;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.showSalePropId;
        return iHashCode9 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SizeGuide(sizeGuideImage=");
        sbLIZ.append(this.sizeGuideImage);
        sbLIZ.append(", originSizeGuideImage=");
        sbLIZ.append(this.originSizeGuideImage);
        sbLIZ.append(", isOutstanding=");
        sbLIZ.append(this.isOutstanding);
        sbLIZ.append(", pdpSizeGuideButtonText=");
        sbLIZ.append(this.pdpSizeGuideButtonText);
        sbLIZ.append(", skuSizeGuideButtonText=");
        sbLIZ.append(this.skuSizeGuideButtonText);
        sbLIZ.append(", skuSizeGuideTitle=");
        sbLIZ.append(this.skuSizeGuideTitle);
        sbLIZ.append(", skuSizeGuideButtonIcon=");
        sbLIZ.append(this.skuSizeGuideButtonIcon);
        sbLIZ.append(", skuSizeGuideLoc=");
        sbLIZ.append(this.skuSizeGuideLoc);
        sbLIZ.append(", skuSizeGuideSchema=");
        sbLIZ.append(this.skuSizeGuideSchema);
        sbLIZ.append(", showSalePropId=");
        sbLIZ.append(this.showSalePropId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.sizeGuideImage, i);
        parcel.writeParcelable(this.originSizeGuideImage, i);
        Boolean bool = this.isOutstanding;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.pdpSizeGuideButtonText);
        parcel.writeString(this.skuSizeGuideButtonText);
        parcel.writeString(this.skuSizeGuideTitle);
        parcel.writeParcelable(this.skuSizeGuideButtonIcon, i);
        Integer num = this.skuSizeGuideLoc;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.skuSizeGuideSchema);
        parcel.writeString(this.showSalePropId);
    }

    public SizeGuide(Image image, Image image2, Boolean bool, String str, String str2, String str3, Icon icon, Integer num, String str4, String str5) {
        this.sizeGuideImage = image;
        this.originSizeGuideImage = image2;
        this.isOutstanding = bool;
        this.pdpSizeGuideButtonText = str;
        this.skuSizeGuideButtonText = str2;
        this.skuSizeGuideTitle = str3;
        this.skuSizeGuideButtonIcon = icon;
        this.skuSizeGuideLoc = num;
        this.skuSizeGuideSchema = str4;
        this.showSalePropId = str5;
    }
}
