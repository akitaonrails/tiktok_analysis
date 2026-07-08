package com.ss.android.vesdk.filterparam;

import X.C2188811AlT;
import X.C2325341G0m;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes36.dex */
public class VEVideoAjustmentFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VEVideoAjustmentFilterParam> CREATOR = new C2325341G0m(52);
    public float[] ajustmentIntensity;
    public String[] ajustmentName;
    public int[] ajustmentType;

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public VEVideoAjustmentFilterParam() {
        this.filterName = "quality filter";
        this.filterType = 17;
        this.filterDurationType = 1;
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VEVideoAjustmentFilterParam{ajustmentName=");
        sbLIZ.append(Arrays.toString(this.ajustmentName));
        sbLIZ.append(", ajustmentType=");
        sbLIZ.append(Arrays.toString(this.ajustmentType));
        sbLIZ.append(", ajustmentIntensity=");
        sbLIZ.append(Arrays.toString(this.ajustmentIntensity));
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

    public VEVideoAjustmentFilterParam(Parcel parcel) {
        super(parcel);
        this.ajustmentName = parcel.createStringArray();
        this.ajustmentType = parcel.createIntArray();
        this.ajustmentIntensity = parcel.createFloatArray();
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeStringArray(this.ajustmentName);
        parcel.writeIntArray(this.ajustmentType);
        parcel.writeFloatArray(this.ajustmentIntensity);
    }
}
