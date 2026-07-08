package com.ss.android.vesdk.filterparam;

import X.C2188811AlT;
import X.C2325341G0m;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes36.dex */
public class VEExposureFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VEExposureFilterParam> CREATOR = new C2325341G0m(39);
    public float exposure;

    public VEExposureFilterParam() {
        this.filterName = "exposure filter";
        this.filterType = 39;
        this.filterDurationType = 1;
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public final int describeContents() {
        return super.describeContents();
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VEExposureFilterParam{exposure=");
        sbLIZ.append(this.exposure);
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

    public VEExposureFilterParam(Parcel parcel) {
        super(parcel);
        this.exposure = parcel.readFloat();
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}
