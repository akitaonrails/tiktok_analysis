package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.page.sellingpoints.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.page.sellingpoints.model.Padding;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.page.sellingpoints.model.SeaPdpSellingPointsItem;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.CustomColor;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SeaPdpSellingPointsItem implements Parcelable {

    @C09CT("background_color")
    public CustomColor backgroundColor;

    @C09CT("border_color")
    public CustomColor borderColor;

    @C09CT("da_info")
    public String daInfo;

    @C09CT("padding")
    public Padding padding;

    @C09CT("text")
    public ECRichText text;
    public transient SpannableStringBuilder textSpan;
    public static final Parcelable.Creator<SeaPdpSellingPointsItem> CREATOR = new Parcelable.Creator<SeaPdpSellingPointsItem>() { // from class: X.02iP
        @Override // android.os.Parcelable.Creator
        public final SeaPdpSellingPointsItem createFromParcel(Parcel parcel) {
            Padding paddingCreateFromParcel;
            ECRichText eCRichText = (ECRichText) parcel.readParcelable(SeaPdpSellingPointsItem.class.getClassLoader());
            CustomColor customColor = (CustomColor) parcel.readParcelable(SeaPdpSellingPointsItem.class.getClassLoader());
            CustomColor customColor2 = (CustomColor) parcel.readParcelable(SeaPdpSellingPointsItem.class.getClassLoader());
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                paddingCreateFromParcel = null;
            } else {
                paddingCreateFromParcel = Padding.CREATOR.createFromParcel(parcel);
            }
            return new SeaPdpSellingPointsItem(eCRichText, customColor, customColor2, string, paddingCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SeaPdpSellingPointsItem[] newArray(int i) {
            return new SeaPdpSellingPointsItem[i];
        }
    };
    public static final int $stable = 8;

    public SeaPdpSellingPointsItem() {
        this(null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeaPdpSellingPointsItem)) {
            return false;
        }
        SeaPdpSellingPointsItem seaPdpSellingPointsItem = (SeaPdpSellingPointsItem) obj;
        return Intrinsics.LJFF(this.text, seaPdpSellingPointsItem.text) && Intrinsics.LJFF(this.backgroundColor, seaPdpSellingPointsItem.backgroundColor) && Intrinsics.LJFF(this.borderColor, seaPdpSellingPointsItem.borderColor) && Intrinsics.LJFF(this.daInfo, seaPdpSellingPointsItem.daInfo) && Intrinsics.LJFF(this.padding, seaPdpSellingPointsItem.padding);
    }

    public final int hashCode() {
        ECRichText eCRichText = this.text;
        int iHashCode = (eCRichText == null ? 0 : eCRichText.hashCode()) * 31;
        CustomColor customColor = this.backgroundColor;
        int iHashCode2 = (iHashCode + (customColor == null ? 0 : customColor.hashCode())) * 31;
        CustomColor customColor2 = this.borderColor;
        int iHashCode3 = (iHashCode2 + (customColor2 == null ? 0 : customColor2.hashCode())) * 31;
        String str = this.daInfo;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Padding padding = this.padding;
        return iHashCode4 + (padding != null ? padding.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaPdpSellingPointsItem(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", backgroundColor=");
        sbLIZ.append(this.backgroundColor);
        sbLIZ.append(", borderColor=");
        sbLIZ.append(this.borderColor);
        sbLIZ.append(", daInfo=");
        sbLIZ.append(this.daInfo);
        sbLIZ.append(", padding=");
        sbLIZ.append(this.padding);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.text, i);
        parcel.writeParcelable(this.backgroundColor, i);
        parcel.writeParcelable(this.borderColor, i);
        parcel.writeString(this.daInfo);
        Padding padding = this.padding;
        if (padding == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            padding.writeToParcel(parcel, i);
        }
    }

    public SeaPdpSellingPointsItem(ECRichText eCRichText, CustomColor customColor, CustomColor customColor2, String str, Padding padding) {
        this.text = eCRichText;
        this.backgroundColor = customColor;
        this.borderColor = customColor2;
        this.daInfo = str;
        this.padding = padding;
    }
}
