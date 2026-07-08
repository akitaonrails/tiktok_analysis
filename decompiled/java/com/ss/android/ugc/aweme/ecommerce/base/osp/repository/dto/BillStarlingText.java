package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillStarlingText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class BillStarlingText implements Parcelable {

    @C09CT("key")
    public String key;

    @C09CT("text")
    public String text;

    @C09CT("text_color")
    public Integer textColor;
    public static final Parcelable.Creator<BillStarlingText> CREATOR = new Parcelable.Creator<BillStarlingText>() { // from class: X.02Hq
        @Override // android.os.Parcelable.Creator
        public final BillStarlingText createFromParcel(Parcel parcel) {
            Integer numValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new BillStarlingText(string, string2, numValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final BillStarlingText[] newArray(int i) {
            return new BillStarlingText[i];
        }
    };
    public static final int $stable = 8;

    public BillStarlingText() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BillStarlingText)) {
            return false;
        }
        BillStarlingText billStarlingText = (BillStarlingText) obj;
        return Intrinsics.LJFF(this.key, billStarlingText.key) && Intrinsics.LJFF(this.text, billStarlingText.text) && Intrinsics.LJFF(this.textColor, billStarlingText.textColor);
    }

    public final int hashCode() {
        String str = this.key;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.text;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.textColor;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BillStarlingText(key=");
        sbLIZ.append(this.key);
        sbLIZ.append(", text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", textColor=");
        sbLIZ.append(this.textColor);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        parcel.writeString(this.key);
        parcel.writeString(this.text);
        Integer num = this.textColor;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
    }

    public BillStarlingText(String str, String str2, Integer num) {
        this.key = str;
        this.text = str2;
        this.textColor = num;
    }
}
