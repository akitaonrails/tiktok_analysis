package com.ss.android.ugc.aweme.shortvideo.jsbopenrecord;

import X.C040H;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.OptionalComponents;

/* JADX INFO: loaded from: classes9.dex */
public final class OptionalComponents implements Parcelable {
    public static final Parcelable.Creator<OptionalComponents> CREATOR = new Parcelable.Creator<OptionalComponents>() { // from class: X.0LEn
        @Override // android.os.Parcelable.Creator
        public final OptionalComponents createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3 = true;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (parcel.readInt() == 0) {
                z3 = false;
            }
            return new OptionalComponents(z, z2, z3);
        }

        @Override // android.os.Parcelable.Creator
        public final OptionalComponents[] newArray(int i) {
            return new OptionalComponents[i];
        }
    };

    @C040H
    public final boolean albumEntrance;

    @C040H
    public final boolean chooseMusicEntrance;

    @C040H
    public final boolean effectPanelEntrance;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OptionalComponents)) {
            return false;
        }
        OptionalComponents optionalComponents = (OptionalComponents) obj;
        return this.chooseMusicEntrance == optionalComponents.chooseMusicEntrance && this.effectPanelEntrance == optionalComponents.effectPanelEntrance && this.albumEntrance == optionalComponents.albumEntrance;
    }

    public final int hashCode() {
        return (((C786410Ut5.Z2(this.chooseMusicEntrance) * 31) + C786410Ut5.Z2(this.effectPanelEntrance)) * 31) + C786410Ut5.Z2(this.albumEntrance);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OptionalComponents(chooseMusicEntrance=");
        sbLIZ.append(this.chooseMusicEntrance);
        sbLIZ.append(", effectPanelEntrance=");
        sbLIZ.append(this.effectPanelEntrance);
        sbLIZ.append(", albumEntrance=");
        sbLIZ.append(this.albumEntrance);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.chooseMusicEntrance ? 1 : 0);
        parcel.writeInt(this.effectPanelEntrance ? 1 : 0);
        parcel.writeInt(this.albumEntrance ? 1 : 0);
    }

    public OptionalComponents(boolean z, boolean z2, boolean z3) {
        this.chooseMusicEntrance = z;
        this.effectPanelEntrance = z2;
        this.albumEntrance = z3;
    }
}
