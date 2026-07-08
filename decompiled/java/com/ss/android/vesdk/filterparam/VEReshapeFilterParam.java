package com.ss.android.vesdk.filterparam;

import X.C2188811AlT;
import X.C2325341G0m;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes36.dex */
public class VEReshapeFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VEReshapeFilterParam> CREATOR = new C2325341G0m(48);
    public float cheekIntensity;
    public float eyeIntensity;
    public String resPath;

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public VEReshapeFilterParam() {
        this.filterName = "reshape filter";
        this.filterType = 13;
        this.filterDurationType = 1;
        this.resPath = "";
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VEReshapeFilterParam{resPath='");
        sbLIZ.append(this.resPath);
        sbLIZ.append('\'');
        sbLIZ.append(", eyeIntensity=");
        sbLIZ.append(this.eyeIntensity);
        sbLIZ.append(", cheekIntensity=");
        sbLIZ.append(this.cheekIntensity);
        sbLIZ.append(", filterType=");
        sbLIZ.append(this.filterType);
        sbLIZ.append(", filterName='");
        sbLIZ.append(this.filterName);
        sbLIZ.append('\'');
        sbLIZ.append(", filterDurationType=");
        sbLIZ.append(this.filterDurationType);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VEReshapeFilterParam(Parcel parcel) {
        super(parcel);
        this.resPath = parcel.readString();
        this.eyeIntensity = parcel.readFloat();
        this.cheekIntensity = parcel.readFloat();
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.resPath);
        parcel.writeFloat(this.eyeIntensity);
        parcel.writeFloat(this.cheekIntensity);
    }
}
