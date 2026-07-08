package com.ss.android.vesdk.filterparam;

import X.C2188811AlT;
import X.C2325341G0m;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes36.dex */
public class VEAudioMetricsFilterParam extends VEBaseAudioFilterParam {
    public static final Parcelable.Creator<VEAudioMetricsFilterParam> CREATOR = new C2325341G0m(25);
    public String samiModelPath;
    public String samiParam;

    @Override // com.ss.android.vesdk.filterparam.VEBaseAudioFilterParam, com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public VEAudioMetricsFilterParam() {
        this.filterName = "audio metrics filter";
        this.samiModelPath = "";
        this.samiParam = "";
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseAudioFilterParam, com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VEAudioSamiFilterParam{filterType=");
        sbLIZ.append(this.filterType);
        sbLIZ.append(", filterName='");
        sbLIZ.append(this.filterName);
        sbLIZ.append(", filterDurationType=");
        sbLIZ.append(this.filterDurationType);
        sbLIZ.append(", samiModelPath=");
        sbLIZ.append(this.samiModelPath);
        sbLIZ.append(", samiParam=");
        sbLIZ.append(this.samiParam);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VEAudioMetricsFilterParam(Parcel parcel) {
        super(parcel);
        this.samiModelPath = parcel.readString();
        this.samiParam = parcel.readString();
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseAudioFilterParam, com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.samiModelPath);
        parcel.writeString(this.samiParam);
    }
}
