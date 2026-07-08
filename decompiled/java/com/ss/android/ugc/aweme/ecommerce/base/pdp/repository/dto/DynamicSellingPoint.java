package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.CommonColor;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.DynamicSellingPoint;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class DynamicSellingPoint implements Parcelable {

    @C09CT("background_color")
    public CommonColor backgroundColor;

    @C09CT("bubble_text_type")
    public String bubbleTextType;

    @C09CT("description")
    public String description;

    @C09CT("num_in_selling_point")
    public Integer numInSellingPoint;

    @C09CT("rich_text")
    public LinkRichText richText;

    @C09CT("rich_text_ec_richtext")
    public ECRichText richTextECRichText;
    public static final Parcelable.Creator<DynamicSellingPoint> CREATOR = new Parcelable.Creator<DynamicSellingPoint>() { // from class: X.02Ye
        @Override // android.os.Parcelable.Creator
        public final DynamicSellingPoint createFromParcel(Parcel parcel) {
            LinkRichText linkRichTextCreateFromParcel;
            CommonColor commonColorCreateFromParcel;
            Integer numValueOf = null;
            if (parcel.readInt() == 0) {
                linkRichTextCreateFromParcel = null;
            } else {
                linkRichTextCreateFromParcel = LinkRichText.CREATOR.createFromParcel(parcel);
            }
            LinkRichText linkRichText = linkRichTextCreateFromParcel;
            ECRichText eCRichText = (ECRichText) parcel.readParcelable(DynamicSellingPoint.class.getClassLoader());
            if (parcel.readInt() == 0) {
                commonColorCreateFromParcel = null;
            } else {
                commonColorCreateFromParcel = CommonColor.CREATOR.createFromParcel(parcel);
            }
            CommonColor commonColor = commonColorCreateFromParcel;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new DynamicSellingPoint(linkRichText, eCRichText, commonColor, string, string2, numValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final DynamicSellingPoint[] newArray(int i) {
            return new DynamicSellingPoint[i];
        }
    };
    public static final int $stable = 8;

    public DynamicSellingPoint() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DynamicSellingPoint)) {
            return false;
        }
        DynamicSellingPoint dynamicSellingPoint = (DynamicSellingPoint) obj;
        return Intrinsics.LJFF(this.richText, dynamicSellingPoint.richText) && Intrinsics.LJFF(this.richTextECRichText, dynamicSellingPoint.richTextECRichText) && Intrinsics.LJFF(this.backgroundColor, dynamicSellingPoint.backgroundColor) && Intrinsics.LJFF(this.description, dynamicSellingPoint.description) && Intrinsics.LJFF(this.bubbleTextType, dynamicSellingPoint.bubbleTextType) && Intrinsics.LJFF(this.numInSellingPoint, dynamicSellingPoint.numInSellingPoint);
    }

    public final int hashCode() {
        LinkRichText linkRichText = this.richText;
        int iHashCode = (linkRichText == null ? 0 : linkRichText.hashCode()) * 31;
        ECRichText eCRichText = this.richTextECRichText;
        int iHashCode2 = (iHashCode + (eCRichText == null ? 0 : eCRichText.hashCode())) * 31;
        CommonColor commonColor = this.backgroundColor;
        int iHashCode3 = (iHashCode2 + (commonColor == null ? 0 : commonColor.hashCode())) * 31;
        String str = this.description;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.bubbleTextType;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.numInSellingPoint;
        return iHashCode5 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DynamicSellingPoint(richText=");
        sbLIZ.append(this.richText);
        sbLIZ.append(", richTextECRichText=");
        sbLIZ.append(this.richTextECRichText);
        sbLIZ.append(", backgroundColor=");
        sbLIZ.append(this.backgroundColor);
        sbLIZ.append(", description=");
        sbLIZ.append(this.description);
        sbLIZ.append(", bubbleTextType=");
        sbLIZ.append(this.bubbleTextType);
        sbLIZ.append(", numInSellingPoint=");
        sbLIZ.append(this.numInSellingPoint);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        LinkRichText linkRichText = this.richText;
        if (linkRichText == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            linkRichText.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.richTextECRichText, i);
        CommonColor commonColor = this.backgroundColor;
        if (commonColor == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            commonColor.writeToParcel(parcel, i);
        }
        parcel.writeString(this.description);
        parcel.writeString(this.bubbleTextType);
        Integer num = this.numInSellingPoint;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
    }

    public DynamicSellingPoint(LinkRichText linkRichText, ECRichText eCRichText, CommonColor commonColor, String str, String str2, Integer num) {
        this.richText = linkRichText;
        this.richTextECRichText = eCRichText;
        this.backgroundColor = commonColor;
        this.description = str;
        this.bubbleTextType = str2;
        this.numInSellingPoint = num;
    }
}
