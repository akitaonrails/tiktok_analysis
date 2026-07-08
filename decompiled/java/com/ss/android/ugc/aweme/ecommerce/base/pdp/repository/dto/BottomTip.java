package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C02ZT;
import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BottomTip;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class BottomTip implements Parcelable {

    @C09CT("icon")
    public Icon icon;

    @C09CT("link")
    public String link;

    @C09CT("name")
    public String name;

    @C09CT("text")
    public String text;

    @C09CT("type")
    public Integer type;
    public static final C02ZT Companion = new Object() { // from class: X.02ZT
    };
    public static final Parcelable.Creator<BottomTip> CREATOR = new Parcelable.Creator<BottomTip>() { // from class: X.02ZR
        @Override // android.os.Parcelable.Creator
        public final BottomTip createFromParcel(Parcel parcel) {
            Integer numValueOf;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new BottomTip(numValueOf, parcel.readString(), parcel.readString(), parcel.readString(), (Icon) parcel.readParcelable(BottomTip.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final BottomTip[] newArray(int i) {
            return new BottomTip[i];
        }
    };
    public static final int $stable = 8;

    public BottomTip() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BottomTip)) {
            return false;
        }
        BottomTip bottomTip = (BottomTip) obj;
        return Intrinsics.LJFF(this.type, bottomTip.type) && Intrinsics.LJFF(this.name, bottomTip.name) && Intrinsics.LJFF(this.text, bottomTip.text) && Intrinsics.LJFF(this.link, bottomTip.link) && Intrinsics.LJFF(this.icon, bottomTip.icon);
    }

    public final int hashCode() {
        Integer num = this.type;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.text;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.link;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Icon icon = this.icon;
        return iHashCode4 + (icon != null ? icon.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BottomTip(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", link=");
        sbLIZ.append(this.link);
        sbLIZ.append(", icon=");
        sbLIZ.append(this.icon);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        Integer num = this.type;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.name);
        parcel.writeString(this.text);
        parcel.writeString(this.link);
        parcel.writeParcelable(this.icon, i);
    }

    public BottomTip(Integer num, String str, String str2, String str3, Icon icon) {
        this.type = num;
        this.name = str;
        this.text = str2;
        this.link = str3;
        this.icon = icon;
    }
}
