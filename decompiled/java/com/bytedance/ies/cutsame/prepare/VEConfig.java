package com.bytedance.ies.cutsame.prepare;

import X.C09CT;
import X.C1779680wPe;
import X.C2188811AlT;
import X.C786410Ut5;
import Y.AObjectS370S0100000_27;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ies.cutsame.prepare.VEConfig;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class VEConfig implements Parcelable {
    public static final C1779680wPe CREATOR = new Parcelable.Creator<VEConfig>() { // from class: X.0wPe
        @Override // android.os.Parcelable.Creator
        public final VEConfig createFromParcel(Parcel parcel) {
            return new VEConfig(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final VEConfig[] newArray(int i) {
            return new VEConfig[i];
        }
    };

    @C09CT("bps_config")
    public final VECompileBpsConfig bpsConfig;
    public final Function1<Integer, Integer> bpsGenerator;

    @C09CT("bps")
    public final int defaultBps;

    @C09CT("encodeProfile")
    public final String encodeProfile;

    @C09CT("feature_switch")
    public final FeatureConfig featureConfig;

    @C09CT("fps")
    public final int fps;

    @C09CT("gopSize")
    public final int gopSize;

    @C09CT("hw")
    public final boolean hardware;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VEConfig)) {
            return false;
        }
        VEConfig vEConfig = (VEConfig) obj;
        return this.hardware == vEConfig.hardware && this.fps == vEConfig.fps && this.gopSize == vEConfig.gopSize && Intrinsics.LJFF(this.bpsConfig, vEConfig.bpsConfig) && this.defaultBps == vEConfig.defaultBps && Intrinsics.LJFF(this.encodeProfile, vEConfig.encodeProfile) && Intrinsics.LJFF(this.featureConfig, vEConfig.featureConfig);
    }

    public final int hashCode() {
        return (((((((((((C786410Ut5.Z2(this.hardware) * 31) + this.fps) * 31) + this.gopSize) * 31) + this.bpsConfig.hashCode()) * 31) + this.defaultBps) * 31) + this.encodeProfile.hashCode()) * 31) + this.featureConfig.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VEConfig(hardware=");
        sbLIZ.append(this.hardware);
        sbLIZ.append(", fps=");
        sbLIZ.append(this.fps);
        sbLIZ.append(", gopSize=");
        sbLIZ.append(this.gopSize);
        sbLIZ.append(", bpsConfig=");
        sbLIZ.append(this.bpsConfig);
        sbLIZ.append(", defaultBps=");
        sbLIZ.append(this.defaultBps);
        sbLIZ.append(", encodeProfile=");
        sbLIZ.append(this.encodeProfile);
        sbLIZ.append(", featureConfig=");
        sbLIZ.append(this.featureConfig);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VEConfig() {
        this(true, 30, 35, new VECompileBpsConfig(16777216, 10485760, false), 10000000, "high", new FeatureConfig(40, 3686400));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public VEConfig(Parcel parcel) {
        boolean z;
        if (parcel.readByte() == 1) {
            z = true;
        } else {
            z = false;
        }
        int i = parcel.readInt();
        int i2 = parcel.readInt();
        VECompileBpsConfig vECompileBpsConfig = (VECompileBpsConfig) parcel.readParcelable(VECompileBpsConfig.CREATOR.getClass().getClassLoader());
        vECompileBpsConfig = vECompileBpsConfig == null ? new VECompileBpsConfig(16777216, 10485760, false) : vECompileBpsConfig;
        int i3 = parcel.readInt();
        String string = parcel.readString();
        string = string == null ? "high" : string;
        FeatureConfig featureConfig = (FeatureConfig) parcel.readParcelable(FeatureConfig.CREATOR.getClass().getClassLoader());
        this(z, i, i2, vECompileBpsConfig, i3, string, featureConfig == null ? new FeatureConfig(40, 3686400) : featureConfig);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (parcel != null) {
            parcel.writeByte(this.hardware ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.fps);
            parcel.writeInt(this.gopSize);
            parcel.writeParcelable(this.bpsConfig, i);
            parcel.writeInt(this.defaultBps);
            parcel.writeString(this.encodeProfile);
            parcel.writeParcelable(this.featureConfig, i);
        }
    }

    public VEConfig(boolean z, int i, int i2, VECompileBpsConfig vECompileBpsConfig, int i3, String str, FeatureConfig featureConfig) {
        this.hardware = z;
        this.fps = i;
        this.gopSize = i2;
        this.bpsConfig = vECompileBpsConfig;
        this.defaultBps = i3;
        this.encodeProfile = str;
        this.featureConfig = featureConfig;
        this.bpsGenerator = new AObjectS370S0100000_27(this, 3);
    }
}
