package com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuHeaderTopLabelItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SkuHeaderTopLabelItem implements Parcelable {

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("font_color_token")
    public final String fontColorToken;

    @C09CT("font_token")
    public final String fontToken;

    @C09CT("icon")
    public final Icon icon;

    @C09CT("text")
    public final String text;
    public static final Parcelable.Creator<SkuHeaderTopLabelItem> CREATOR = new Parcelable.Creator<SkuHeaderTopLabelItem>() { // from class: X.045j
        @Override // android.os.Parcelable.Creator
        public final SkuHeaderTopLabelItem createFromParcel(Parcel parcel) {
            return new SkuHeaderTopLabelItem(parcel.readString(), (Icon) parcel.readParcelable(SkuHeaderTopLabelItem.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SkuHeaderTopLabelItem[] newArray(int i) {
            return new SkuHeaderTopLabelItem[i];
        }
    };
    public static final int $stable = 8;

    public SkuHeaderTopLabelItem() {
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
        if (!(obj instanceof SkuHeaderTopLabelItem)) {
            return false;
        }
        SkuHeaderTopLabelItem skuHeaderTopLabelItem = (SkuHeaderTopLabelItem) obj;
        return Intrinsics.LJFF(this.text, skuHeaderTopLabelItem.text) && Intrinsics.LJFF(this.icon, skuHeaderTopLabelItem.icon) && Intrinsics.LJFF(this.fontToken, skuHeaderTopLabelItem.fontToken) && Intrinsics.LJFF(this.fontColorToken, skuHeaderTopLabelItem.fontColorToken) && Intrinsics.LJFF(this.daInfo, skuHeaderTopLabelItem.daInfo);
    }

    public final int hashCode() {
        String str = this.text;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Icon icon = this.icon;
        int iHashCode2 = (iHashCode + (icon == null ? 0 : icon.hashCode())) * 31;
        String str2 = this.fontToken;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fontColorToken;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.daInfo;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SkuHeaderTopLabelItem(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", icon=");
        sbLIZ.append(this.icon);
        sbLIZ.append(", fontToken=");
        sbLIZ.append(this.fontToken);
        sbLIZ.append(", fontColorToken=");
        sbLIZ.append(this.fontColorToken);
        sbLIZ.append(", daInfo=");
        sbLIZ.append(this.daInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        parcel.writeParcelable(this.icon, i);
        parcel.writeString(this.fontToken);
        parcel.writeString(this.fontColorToken);
        parcel.writeString(this.daInfo);
    }

    public SkuHeaderTopLabelItem(String str, Icon icon, String str2, String str3, String str4) {
        this.text = str;
        this.icon = icon;
        this.fontToken = str2;
        this.fontColorToken = str3;
        this.daInfo = str4;
    }
}
