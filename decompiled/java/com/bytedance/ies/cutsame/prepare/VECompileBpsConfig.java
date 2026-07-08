package com.bytedance.ies.cutsame.prepare;

import X.C09CT;
import X.C1779640wPa;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ies.cutsame.prepare.VECompileBpsConfig;

/* JADX INFO: loaded from: classes28.dex */
public final class VECompileBpsConfig implements Parcelable {
    public static final C1779640wPa CREATOR = new Parcelable.Creator<VECompileBpsConfig>() { // from class: X.0wPa
        @Override // android.os.Parcelable.Creator
        public final VECompileBpsConfig createFromParcel(Parcel parcel) {
            return new VECompileBpsConfig(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final VECompileBpsConfig[] newArray(int i) {
            return new VECompileBpsConfig[i];
        }
    };

    @C09CT("bps_for_1080p")
    public final int bpsFor1080p;

    @C09CT("bps_for_720p")
    public final int bpsFor720p;

    @C09CT("use_material_bps")
    public final boolean useMaterialBps;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VECompileBpsConfig)) {
            return false;
        }
        VECompileBpsConfig vECompileBpsConfig = (VECompileBpsConfig) obj;
        return this.bpsFor1080p == vECompileBpsConfig.bpsFor1080p && this.bpsFor720p == vECompileBpsConfig.bpsFor720p && this.useMaterialBps == vECompileBpsConfig.useMaterialBps;
    }

    public final int hashCode() {
        return (((this.bpsFor1080p * 31) + this.bpsFor720p) * 31) + C786410Ut5.Z2(this.useMaterialBps);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VECompileBpsConfig(bpsFor1080p=");
        sbLIZ.append(this.bpsFor1080p);
        sbLIZ.append(", bpsFor720p=");
        sbLIZ.append(this.bpsFor720p);
        sbLIZ.append(", useMaterialBps=");
        sbLIZ.append(this.useMaterialBps);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VECompileBpsConfig() {
        this(16777216, 10485760, false);
    }

    public VECompileBpsConfig(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readByte() == 1);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (parcel != null) {
            parcel.writeInt(this.bpsFor1080p);
            parcel.writeInt(this.bpsFor720p);
            parcel.writeByte(this.useMaterialBps ? (byte) 1 : (byte) 0);
        }
    }

    public VECompileBpsConfig(int i, int i2, boolean z) {
        this.bpsFor1080p = i;
        this.bpsFor720p = i2;
        this.useMaterialBps = z;
    }
}
