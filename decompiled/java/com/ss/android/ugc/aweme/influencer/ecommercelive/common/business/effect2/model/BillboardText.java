package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.BillboardText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class BillboardText implements Parcelable {

    @C09CT("item_color")
    public final String color;

    @C09CT("text")
    public final String text;
    public static final Parcelable.Creator<BillboardText> CREATOR = new Parcelable.Creator<BillboardText>() { // from class: X.0v97
        @Override // android.os.Parcelable.Creator
        public final BillboardText createFromParcel(Parcel parcel) {
            return new BillboardText(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BillboardText[] newArray(int i) {
            return new BillboardText[i];
        }
    };
    public static final int $stable = 8;

    public BillboardText() {
        this(null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BillboardText)) {
            return false;
        }
        BillboardText billboardText = (BillboardText) obj;
        return Intrinsics.LJFF(this.text, billboardText.text) && Intrinsics.LJFF(this.color, billboardText.color);
    }

    public final int hashCode() {
        String str = this.text;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.color;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BillboardText(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", color=");
        sbLIZ.append(this.color);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        parcel.writeString(this.color);
    }

    public BillboardText(String str, String str2) {
        this.text = str;
        this.color = str2;
    }
}
