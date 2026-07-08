package com.ss.android.vesdk.filterparam;

import X.C2188811AlT;
import X.C2325341G0m;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes36.dex */
public class VEBlurFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VEBlurFilterParam> CREATOR = new C2325341G0m(32);
    public int height;
    public float intensity;
    public int lastFacing;
    public int width;

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public VEBlurFilterParam() {
        this.lastFacing = -1;
        this.height = -1;
        this.width = -1;
        this.filterName = "ve_blur";
        this.filterType = 31;
        this.filterDurationType = 1;
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VEBlurFilterParam{intensity=");
        sbLIZ.append(this.intensity);
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

    public VEBlurFilterParam(Parcel parcel) {
        super(parcel);
        this.lastFacing = -1;
        this.height = -1;
        this.width = -1;
        this.intensity = parcel.readFloat();
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.intensity);
    }
}
