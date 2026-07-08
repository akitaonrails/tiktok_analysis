package com.ss.android.ugc.tools.data;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.tools.data.RawIcon;

/* JADX INFO: loaded from: classes33.dex */
public final class RawIcon implements Parcelable {
    public static final Parcelable.Creator<RawIcon> CREATOR = new Parcelable.Creator<RawIcon>() { // from class: X.18Wo
        @Override // android.os.Parcelable.Creator
        public final RawIcon createFromParcel(Parcel parcel) {
            return new RawIcon(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final RawIcon[] newArray(int i) {
            return new RawIcon[i];
        }
    };
    public final int dark;
    public final int light;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RawIcon)) {
            return false;
        }
        RawIcon rawIcon = (RawIcon) obj;
        return this.light == rawIcon.light && this.dark == rawIcon.dark;
    }

    public final int hashCode() {
        return (this.light * 31) + this.dark;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RawIcon(light=");
        sbLIZ.append(this.light);
        sbLIZ.append(", dark=");
        sbLIZ.append(this.dark);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.light);
        parcel.writeInt(this.dark);
    }

    public RawIcon(int i, int i2) {
        this.light = i;
        this.dark = i2;
    }
}
