package com.ss.android.vesdk.filterparam;

import X.C2188811AlT;
import X.C2325341G0m;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes36.dex */
public class VEAudioDspFilterParam extends VEBaseAudioFilterParam {
    public static final Parcelable.Creator<VEAudioDspFilterParam> CREATOR = new C2325341G0m(21);
    public String jsonDir;

    public VEAudioDspFilterParam() {
        this.filterName = "audio dsp filter";
        this.jsonDir = "audio dsp use inbuilt json";
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseAudioFilterParam, com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public int describeContents() {
        return super.describeContents();
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseAudioFilterParam, com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VEAudioDspFilterParam{jsonPath='");
        sbLIZ.append(this.jsonDir);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VEAudioDspFilterParam(Parcel parcel) {
        super(parcel);
        this.jsonDir = parcel.readString();
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseAudioFilterParam, com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.jsonDir);
    }
}
