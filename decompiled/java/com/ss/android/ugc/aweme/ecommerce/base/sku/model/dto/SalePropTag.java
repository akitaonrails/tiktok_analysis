package com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.CommonColor;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropTag;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SalePropTag implements Parcelable {

    @C09CT("background_color")
    public CommonColor backgroundColor;

    @C09CT("da_info")
    public String daInfo;

    @C09CT("description_text")
    public ECRichText description;

    @C09CT("description_schema")
    public String descriptionSchema;

    @C09CT("description_text_plain")
    public String descriptionTextPlain;

    @C09CT("style")
    public Integer style;

    @C09CT("tag_name")
    public String tagName;

    @C09CT("tag_value")
    public String tagValue;

    @C09CT("text")
    public ECRichText text;
    public static final Parcelable.Creator<SalePropTag> CREATOR = new Parcelable.Creator<SalePropTag>() { // from class: X.02Xd
        @Override // android.os.Parcelable.Creator
        public final SalePropTag createFromParcel(Parcel parcel) {
            CommonColor commonColorCreateFromParcel;
            ECRichText eCRichText = (ECRichText) parcel.readParcelable(SalePropTag.class.getClassLoader());
            Integer numValueOf = null;
            if (parcel.readInt() == 0) {
                commonColorCreateFromParcel = null;
            } else {
                commonColorCreateFromParcel = CommonColor.CREATOR.createFromParcel(parcel);
            }
            CommonColor commonColor = commonColorCreateFromParcel;
            String string = parcel.readString();
            ECRichText eCRichText2 = (ECRichText) parcel.readParcelable(SalePropTag.class.getClassLoader());
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new SalePropTag(eCRichText, commonColor, string, eCRichText2, string2, string3, numValueOf, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SalePropTag[] newArray(int i) {
            return new SalePropTag[i];
        }
    };
    public static final int $stable = 8;

    public SalePropTag() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SalePropTag)) {
            return false;
        }
        SalePropTag salePropTag = (SalePropTag) obj;
        return Intrinsics.LJFF(this.text, salePropTag.text) && Intrinsics.LJFF(this.backgroundColor, salePropTag.backgroundColor) && Intrinsics.LJFF(this.daInfo, salePropTag.daInfo) && Intrinsics.LJFF(this.description, salePropTag.description) && Intrinsics.LJFF(this.descriptionTextPlain, salePropTag.descriptionTextPlain) && Intrinsics.LJFF(this.descriptionSchema, salePropTag.descriptionSchema) && Intrinsics.LJFF(this.style, salePropTag.style) && Intrinsics.LJFF(this.tagName, salePropTag.tagName) && Intrinsics.LJFF(this.tagValue, salePropTag.tagValue);
    }

    public final int hashCode() {
        ECRichText eCRichText = this.text;
        int iHashCode = (eCRichText == null ? 0 : eCRichText.hashCode()) * 31;
        CommonColor commonColor = this.backgroundColor;
        int iHashCode2 = (iHashCode + (commonColor == null ? 0 : commonColor.hashCode())) * 31;
        String str = this.daInfo;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        ECRichText eCRichText2 = this.description;
        int iHashCode4 = (iHashCode3 + (eCRichText2 == null ? 0 : eCRichText2.hashCode())) * 31;
        String str2 = this.descriptionTextPlain;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.descriptionSchema;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.style;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.tagName;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.tagValue;
        return iHashCode8 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SalePropTag(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", backgroundColor=");
        sbLIZ.append(this.backgroundColor);
        sbLIZ.append(", daInfo=");
        sbLIZ.append(this.daInfo);
        sbLIZ.append(", description=");
        sbLIZ.append(this.description);
        sbLIZ.append(", descriptionTextPlain=");
        sbLIZ.append(this.descriptionTextPlain);
        sbLIZ.append(", descriptionSchema=");
        sbLIZ.append(this.descriptionSchema);
        sbLIZ.append(", style=");
        sbLIZ.append(this.style);
        sbLIZ.append(", tagName=");
        sbLIZ.append(this.tagName);
        sbLIZ.append(", tagValue=");
        sbLIZ.append(this.tagValue);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.text, i);
        CommonColor commonColor = this.backgroundColor;
        if (commonColor == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            commonColor.writeToParcel(parcel, i);
        }
        parcel.writeString(this.daInfo);
        parcel.writeParcelable(this.description, i);
        parcel.writeString(this.descriptionTextPlain);
        parcel.writeString(this.descriptionSchema);
        Integer num = this.style;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.tagName);
        parcel.writeString(this.tagValue);
    }

    public SalePropTag(ECRichText eCRichText, CommonColor commonColor, String str, ECRichText eCRichText2, String str2, String str3, Integer num, String str4, String str5) {
        this.text = eCRichText;
        this.backgroundColor = commonColor;
        this.daInfo = str;
        this.description = eCRichText2;
        this.descriptionTextPlain = str2;
        this.descriptionSchema = str3;
        this.style = num;
        this.tagName = str4;
        this.tagValue = str5;
    }
}
