package com.ss.android.vesdk.filterparam;

import X.C2188811AlT;
import X.C2325341G0m;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes36.dex */
public class VEAudioLoudnessBalanceFilter extends VEBaseAudioFilterParam {
    public static final Parcelable.Creator<VEAudioLoudnessBalanceFilter> CREATOR = new C2325341G0m(24);
    public double avgLoudness;
    public boolean enable;
    public boolean isBGM;
    public boolean isOnLine;
    public double peakLoudness;
    public double targetLoudness;

    @Override // com.ss.android.vesdk.filterparam.VEBaseAudioFilterParam, com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public VEAudioLoudnessBalanceFilter() {
        this.isOnLine = true;
        this.filterName = "loudness balance";
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseAudioFilterParam, com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VEAudioLoudnessBalanceFilter{avgLoudness: ");
        sbLIZ.append(this.avgLoudness);
        sbLIZ.append(", peakLoudness: ");
        sbLIZ.append(this.peakLoudness);
        sbLIZ.append(", targetLoudness: '");
        sbLIZ.append(this.targetLoudness);
        sbLIZ.append(", filterName: '");
        sbLIZ.append(this.filterName);
        sbLIZ.append(", filterType: '");
        sbLIZ.append(this.filterType);
        sbLIZ.append(", filterDurationType=");
        sbLIZ.append(this.filterDurationType);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VEAudioLoudnessBalanceFilter(Parcel parcel) {
        super(parcel);
        this.isOnLine = true;
        this.avgLoudness = parcel.readDouble();
        this.peakLoudness = parcel.readDouble();
        this.targetLoudness = parcel.readDouble();
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseAudioFilterParam, com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeDouble(this.avgLoudness);
        parcel.writeDouble(this.peakLoudness);
        parcel.writeDouble(this.targetLoudness);
    }
}
