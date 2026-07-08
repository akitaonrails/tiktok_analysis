package com.ss.android.ugc.aweme.ecommerce.showcase.service.vo;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreIdentityLabelData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class StoreIdentityLabelData implements Parcelable {
    public static final Parcelable.Creator<StoreIdentityLabelData> CREATOR = new Parcelable.Creator<StoreIdentityLabelData>() { // from class: X.02UK
        @Override // android.os.Parcelable.Creator
        public final StoreIdentityLabelData createFromParcel(Parcel parcel) {
            return new StoreIdentityLabelData((Image) parcel.readParcelable(StoreIdentityLabelData.class.getClassLoader()), (Image) parcel.readParcelable(StoreIdentityLabelData.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (ECRichText) parcel.readParcelable(StoreIdentityLabelData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final StoreIdentityLabelData[] newArray(int i) {
            return new StoreIdentityLabelData[i];
        }
    };

    @C09CT("da_info")
    public String daInfo;

    @C09CT("explanation_schema")
    public String explanationSchema;

    @C09CT("identity_label_bg_color")
    public String identityLabelBgColor;

    @C09CT("identity_label_bg_color_dark")
    public String identityLabelBgColorDark;

    @C09CT("identity_label_text")
    public String identityLabelText;

    @C09CT("identity_label_text_color")
    public String identityLabelTextColor;

    @C09CT("identity_label_text_color_dark")
    public String identityLabelTextColorDark;

    @C09CT("identity_logo")
    public Image identityLogo;

    @C09CT("identity_logo_dark")
    public Image identityLogoDark;

    @C09CT("identity_label_name")
    public ECRichText labelName;

    public StoreIdentityLabelData() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreIdentityLabelData)) {
            return false;
        }
        StoreIdentityLabelData storeIdentityLabelData = (StoreIdentityLabelData) obj;
        return Intrinsics.LJFF(this.identityLogo, storeIdentityLabelData.identityLogo) && Intrinsics.LJFF(this.identityLogoDark, storeIdentityLabelData.identityLogoDark) && Intrinsics.LJFF(this.identityLabelBgColor, storeIdentityLabelData.identityLabelBgColor) && Intrinsics.LJFF(this.identityLabelBgColorDark, storeIdentityLabelData.identityLabelBgColorDark) && Intrinsics.LJFF(this.identityLabelText, storeIdentityLabelData.identityLabelText) && Intrinsics.LJFF(this.identityLabelTextColor, storeIdentityLabelData.identityLabelTextColor) && Intrinsics.LJFF(this.identityLabelTextColorDark, storeIdentityLabelData.identityLabelTextColorDark) && Intrinsics.LJFF(this.explanationSchema, storeIdentityLabelData.explanationSchema) && Intrinsics.LJFF(this.daInfo, storeIdentityLabelData.daInfo) && Intrinsics.LJFF(this.labelName, storeIdentityLabelData.labelName);
    }

    public final int hashCode() {
        Image image = this.identityLogo;
        int iHashCode = (image == null ? 0 : image.hashCode()) * 31;
        Image image2 = this.identityLogoDark;
        int iHashCode2 = (iHashCode + (image2 == null ? 0 : image2.hashCode())) * 31;
        String str = this.identityLabelBgColor;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.identityLabelBgColorDark;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.identityLabelText;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.identityLabelTextColor;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.identityLabelTextColorDark;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.explanationSchema;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.daInfo;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        ECRichText eCRichText = this.labelName;
        return iHashCode9 + (eCRichText != null ? eCRichText.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoreIdentityLabelData(identityLogo=");
        sbLIZ.append(this.identityLogo);
        sbLIZ.append(", identityLogoDark=");
        sbLIZ.append(this.identityLogoDark);
        sbLIZ.append(", identityLabelBgColor=");
        sbLIZ.append(this.identityLabelBgColor);
        sbLIZ.append(", identityLabelBgColorDark=");
        sbLIZ.append(this.identityLabelBgColorDark);
        sbLIZ.append(", identityLabelText=");
        sbLIZ.append(this.identityLabelText);
        sbLIZ.append(", identityLabelTextColor=");
        sbLIZ.append(this.identityLabelTextColor);
        sbLIZ.append(", identityLabelTextColorDark=");
        sbLIZ.append(this.identityLabelTextColorDark);
        sbLIZ.append(", explanationSchema=");
        sbLIZ.append(this.explanationSchema);
        sbLIZ.append(", daInfo=");
        sbLIZ.append(this.daInfo);
        sbLIZ.append(", labelName=");
        sbLIZ.append(this.labelName);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.identityLogo, i);
        parcel.writeParcelable(this.identityLogoDark, i);
        parcel.writeString(this.identityLabelBgColor);
        parcel.writeString(this.identityLabelBgColorDark);
        parcel.writeString(this.identityLabelText);
        parcel.writeString(this.identityLabelTextColor);
        parcel.writeString(this.identityLabelTextColorDark);
        parcel.writeString(this.explanationSchema);
        parcel.writeString(this.daInfo);
        parcel.writeParcelable(this.labelName, i);
    }

    public StoreIdentityLabelData(Image image, Image image2, String str, String str2, String str3, String str4, String str5, String str6, String str7, ECRichText eCRichText) {
        this.identityLogo = image;
        this.identityLogoDark = image2;
        this.identityLabelBgColor = str;
        this.identityLabelBgColorDark = str2;
        this.identityLabelText = str3;
        this.identityLabelTextColor = str4;
        this.identityLabelTextColorDark = str5;
        this.explanationSchema = str6;
        this.daInfo = str7;
        this.labelName = eCRichText;
    }
}
