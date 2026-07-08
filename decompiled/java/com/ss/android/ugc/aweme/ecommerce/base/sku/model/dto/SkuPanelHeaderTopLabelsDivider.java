package com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuPanelHeaderTopLabelsDivider;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SkuPanelHeaderTopLabelsDivider implements Parcelable {

    @C09CT("font_color_token")
    public final String fontColorToken;

    @C09CT("font_token")
    public final String fontToken;

    @C09CT("text")
    public final String text;
    public static final Parcelable.Creator<SkuPanelHeaderTopLabelsDivider> CREATOR = new Parcelable.Creator<SkuPanelHeaderTopLabelsDivider>() { // from class: X.045o
        @Override // android.os.Parcelable.Creator
        public final SkuPanelHeaderTopLabelsDivider createFromParcel(Parcel parcel) {
            return new SkuPanelHeaderTopLabelsDivider(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SkuPanelHeaderTopLabelsDivider[] newArray(int i) {
            return new SkuPanelHeaderTopLabelsDivider[i];
        }
    };
    public static final int $stable = 8;

    public SkuPanelHeaderTopLabelsDivider() {
        this(null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkuPanelHeaderTopLabelsDivider)) {
            return false;
        }
        SkuPanelHeaderTopLabelsDivider skuPanelHeaderTopLabelsDivider = (SkuPanelHeaderTopLabelsDivider) obj;
        return Intrinsics.LJFF(this.text, skuPanelHeaderTopLabelsDivider.text) && Intrinsics.LJFF(this.fontToken, skuPanelHeaderTopLabelsDivider.fontToken) && Intrinsics.LJFF(this.fontColorToken, skuPanelHeaderTopLabelsDivider.fontColorToken);
    }

    public final int hashCode() {
        String str = this.text;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.fontToken;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fontColorToken;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SkuPanelHeaderTopLabelsDivider(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", fontToken=");
        sbLIZ.append(this.fontToken);
        sbLIZ.append(", fontColorToken=");
        sbLIZ.append(this.fontColorToken);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        parcel.writeString(this.fontToken);
        parcel.writeString(this.fontColorToken);
    }

    public SkuPanelHeaderTopLabelsDivider(String str, String str2, String str3) {
        this.text = str;
        this.fontToken = str2;
        this.fontColorToken = str3;
    }
}
