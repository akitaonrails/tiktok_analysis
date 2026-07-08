package com.ss.android.ugc.aweme.shortvideo.edit;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.edit.OptBitrateFromVE;
import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public final class OptBitrateFromVE implements Parcelable, Serializable {
    public static final Parcelable.Creator<OptBitrateFromVE> CREATOR = new Parcelable.Creator<OptBitrateFromVE>() { // from class: X.0mfB
        @Override // android.os.Parcelable.Creator
        public final OptBitrateFromVE createFromParcel(Parcel parcel) {
            return new OptBitrateFromVE(parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final OptBitrateFromVE[] newArray(int i) {
            return new OptBitrateFromVE[i];
        }
    };
    public final float minOptBitrate;
    public final float minOptBitrateHD;
    public final float optBitrate;
    public final float optBitrateHD;

    public OptBitrateFromVE() {
        this(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public final OptBitrateFromVE copy(float f, float f2, float f3, float f4) {
        return new OptBitrateFromVE(f, f2, f3, f4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OptBitrateFromVE)) {
            return false;
        }
        OptBitrateFromVE optBitrateFromVE = (OptBitrateFromVE) obj;
        return Float.compare(this.minOptBitrate, optBitrateFromVE.minOptBitrate) == 0 && Float.compare(this.optBitrate, optBitrateFromVE.optBitrate) == 0 && Float.compare(this.minOptBitrateHD, optBitrateFromVE.minOptBitrateHD) == 0 && Float.compare(this.optBitrateHD, optBitrateFromVE.optBitrateHD) == 0;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OptBitrateFromVE(minOptBitrate=");
        sbLIZ.append(this.minOptBitrate);
        sbLIZ.append(", optBitrate=");
        sbLIZ.append(this.optBitrate);
        sbLIZ.append(", minOptBitrateHD=");
        sbLIZ.append(this.minOptBitrateHD);
        sbLIZ.append(", optBitrateHD=");
        sbLIZ.append(this.optBitrateHD);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.minOptBitrate);
        parcel.writeFloat(this.optBitrate);
        parcel.writeFloat(this.minOptBitrateHD);
        parcel.writeFloat(this.optBitrateHD);
    }

    public int hashCode() {
        return (((((Float.floatToIntBits(this.minOptBitrate) * 31) + Float.floatToIntBits(this.optBitrate)) * 31) + Float.floatToIntBits(this.minOptBitrateHD)) * 31) + Float.floatToIntBits(this.optBitrateHD);
    }

    public final float getMinOptBitrate() {
        return this.minOptBitrate;
    }

    public final float getMinOptBitrateHD() {
        return this.minOptBitrateHD;
    }

    public final float getOptBitrate() {
        return this.optBitrate;
    }

    public final float getOptBitrateHD() {
        return this.optBitrateHD;
    }

    public OptBitrateFromVE(float f, float f2, float f3, float f4) {
        this.minOptBitrate = f;
        this.optBitrate = f2;
        this.minOptBitrateHD = f3;
        this.optBitrateHD = f4;
    }
}
