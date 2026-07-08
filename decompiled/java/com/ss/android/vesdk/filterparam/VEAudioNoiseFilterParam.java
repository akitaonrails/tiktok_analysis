package com.ss.android.vesdk.filterparam;

import X.C2188811AlT;
import X.C2325341G0m;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes36.dex */
public class VEAudioNoiseFilterParam extends VEBaseAudioFilterParam {
    public static final Parcelable.Creator<VEAudioNoiseFilterParam> CREATOR = new C2325341G0m(26);
    public boolean enable;
    public String modelPath;
    public float noiseMode;

    @Override // com.ss.android.vesdk.filterparam.VEBaseAudioFilterParam, com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public VEAudioNoiseFilterParam() {
        this.filterName = "audio noise";
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseAudioFilterParam, com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VEAudioNoiseFilterParam{filterType=");
        sbLIZ.append(this.filterType);
        sbLIZ.append(", filterName='");
        sbLIZ.append(this.filterName);
        sbLIZ.append(", filterDurationType=");
        sbLIZ.append(this.filterDurationType);
        sbLIZ.append(", noiseMode=");
        sbLIZ.append(this.noiseMode);
        sbLIZ.append(", modelPath=");
        sbLIZ.append(this.modelPath);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VEAudioNoiseFilterParam(Parcel parcel) {
        super(parcel);
        this.noiseMode = parcel.readFloat();
        this.modelPath = parcel.readString();
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseAudioFilterParam, com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.noiseMode);
        parcel.writeString(this.modelPath);
    }
}
