package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.core.ab.PDPImageConfig;

/* JADX INFO: loaded from: classes28.dex */
public final class PDPImageConfig implements Parcelable {

    @C09CT("pdp_header_progressive_switch")
    public final int progressiveSwitch;
    public static final Parcelable.Creator<PDPImageConfig> CREATOR = new Parcelable.Creator<PDPImageConfig>() { // from class: X.0wPg
        @Override // android.os.Parcelable.Creator
        public final PDPImageConfig createFromParcel(Parcel parcel) {
            return new PDPImageConfig(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final PDPImageConfig[] newArray(int i) {
            return new PDPImageConfig[i];
        }
    };
    public static final int $stable = 8;

    public PDPImageConfig() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PDPImageConfig) && this.progressiveSwitch == ((PDPImageConfig) obj).progressiveSwitch;
    }

    public final int hashCode() {
        return this.progressiveSwitch;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PDPImageConfig(progressiveSwitch=");
        sbLIZ.append(this.progressiveSwitch);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.progressiveSwitch);
    }

    public PDPImageConfig(int i) {
        this.progressiveSwitch = i;
    }
}
