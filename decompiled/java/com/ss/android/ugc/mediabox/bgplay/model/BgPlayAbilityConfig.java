package com.ss.android.ugc.mediabox.bgplay.model;

import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.mediabox.bgplay.model.BgPlayAbilityConfig;

/* JADX INFO: loaded from: classes24.dex */
public final class BgPlayAbilityConfig implements Parcelable {
    public static final Parcelable.Creator<BgPlayAbilityConfig> CREATOR = new Parcelable.Creator<BgPlayAbilityConfig>() { // from class: X.0pTX
        @Override // android.os.Parcelable.Creator
        public final BgPlayAbilityConfig createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4 = true;
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
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (parcel.readInt() == 0) {
                z4 = false;
            }
            return new BgPlayAbilityConfig(z, z2, z3, z4);
        }

        @Override // android.os.Parcelable.Creator
        public final BgPlayAbilityConfig[] newArray(int i) {
            return new BgPlayAbilityConfig[i];
        }
    };
    public boolean canPlayFastBackWard;
    public boolean canPlayFastForward;
    public boolean canPlayNext;
    public boolean canPlayPrevious;

    public BgPlayAbilityConfig() {
        this(false, false, false, false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BgPlayAbilityConfig)) {
            return false;
        }
        BgPlayAbilityConfig bgPlayAbilityConfig = (BgPlayAbilityConfig) obj;
        return this.canPlayFastBackWard == bgPlayAbilityConfig.canPlayFastBackWard && this.canPlayFastForward == bgPlayAbilityConfig.canPlayFastForward && this.canPlayPrevious == bgPlayAbilityConfig.canPlayPrevious && this.canPlayNext == bgPlayAbilityConfig.canPlayNext;
    }

    public final int hashCode() {
        return (((((C786410Ut5.Z2(this.canPlayFastBackWard) * 31) + C786410Ut5.Z2(this.canPlayFastForward)) * 31) + C786410Ut5.Z2(this.canPlayPrevious)) * 31) + C786410Ut5.Z2(this.canPlayNext);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BgPlayAbilityConfig(canPlayFastBackWard=");
        sbLIZ.append(this.canPlayFastBackWard);
        sbLIZ.append(", canPlayFastForward=");
        sbLIZ.append(this.canPlayFastForward);
        sbLIZ.append(", canPlayPrevious=");
        sbLIZ.append(this.canPlayPrevious);
        sbLIZ.append(", canPlayNext=");
        sbLIZ.append(this.canPlayNext);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.canPlayFastBackWard ? 1 : 0);
        parcel.writeInt(this.canPlayFastForward ? 1 : 0);
        parcel.writeInt(this.canPlayPrevious ? 1 : 0);
        parcel.writeInt(this.canPlayNext ? 1 : 0);
    }

    public BgPlayAbilityConfig(boolean z, boolean z2, boolean z3, boolean z4) {
        this.canPlayFastBackWard = z;
        this.canPlayFastForward = z2;
        this.canPlayPrevious = z3;
        this.canPlayNext = z4;
    }
}
