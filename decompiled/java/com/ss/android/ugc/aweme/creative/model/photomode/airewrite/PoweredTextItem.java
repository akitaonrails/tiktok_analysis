package com.ss.android.ugc.aweme.creative.model.photomode.airewrite;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.photomode.airewrite.PoweredTextItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class PoweredTextItem implements Parcelable {
    public static final Parcelable.Creator<PoweredTextItem> CREATOR = new Parcelable.Creator<PoweredTextItem>() { // from class: X.0mgy
        @Override // android.os.Parcelable.Creator
        public final PoweredTextItem createFromParcel(Parcel parcel) {
            Integer numValueOf;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new PoweredTextItem(numValueOf, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PoweredTextItem[] newArray(int i) {
            return new PoweredTextItem[i];
        }
    };

    @C09CT("style")
    public final String style;

    @C09CT("text")
    public final String text;

    @C09CT("title")
    public final String title;

    @C09CT("version")
    public final Integer version;

    public PoweredTextItem() {
        this(null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoweredTextItem)) {
            return false;
        }
        PoweredTextItem poweredTextItem = (PoweredTextItem) obj;
        return Intrinsics.LJFF(this.version, poweredTextItem.version) && Intrinsics.LJFF(this.style, poweredTextItem.style) && Intrinsics.LJFF(this.title, poweredTextItem.title) && Intrinsics.LJFF(this.text, poweredTextItem.text);
    }

    public final int hashCode() {
        Integer num = this.version;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.style;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.text;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoweredTextItem(version=");
        sbLIZ.append(this.version);
        sbLIZ.append(", style=");
        sbLIZ.append(this.style);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", text=");
        sbLIZ.append(this.text);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        Integer num = this.version;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.style);
        parcel.writeString(this.title);
        parcel.writeString(this.text);
    }

    public PoweredTextItem(Integer num, String str, String str2, String str3) {
        this.version = num;
        this.style = str;
        this.title = str2;
        this.text = str3;
    }
}
