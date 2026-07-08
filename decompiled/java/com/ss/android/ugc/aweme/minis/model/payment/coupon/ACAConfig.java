package com.ss.android.ugc.aweme.minis.model.payment.coupon;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.minis.model.payment.coupon.ACAConfig;

/* JADX INFO: loaded from: classes35.dex */
public final class ACAConfig implements Parcelable {

    @C09CT("enabled")
    public final boolean enabled;
    public static final Parcelable.Creator<ACAConfig> CREATOR = new Parcelable.Creator<ACAConfig>() { // from class: X.1Ctz
        @Override // android.os.Parcelable.Creator
        public final ACAConfig createFromParcel(Parcel parcel) {
            boolean z;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new ACAConfig(z);
        }

        @Override // android.os.Parcelable.Creator
        public final ACAConfig[] newArray(int i) {
            return new ACAConfig[i];
        }
    };
    public static final int $stable = 8;

    public ACAConfig() {
        this(false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ACAConfig) && this.enabled == ((ACAConfig) obj).enabled;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.enabled);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ACAConfig(enabled=");
        sbLIZ.append(this.enabled);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.enabled ? 1 : 0);
    }

    public ACAConfig(boolean z) {
        this.enabled = z;
    }
}
