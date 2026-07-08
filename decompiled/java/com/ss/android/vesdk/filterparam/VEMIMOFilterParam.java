package com.ss.android.vesdk.filterparam;

import X.C2188811AlT;
import X.C2325341G0m;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes36.dex */
public class VEMIMOFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VEMIMOFilterParam> CREATOR = new C2325341G0m(45);
    public int camOutHeight;
    public int camOutWidth;
    public int layoutHeight;
    public int layoutWidth;

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public VEMIMOFilterParam() {
        this.filterName = "ve_mimo";
        this.filterType = 37;
        this.filterDurationType = 1;
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VEMIMOFilterParam{layoutWidth=");
        sbLIZ.append(this.layoutWidth);
        sbLIZ.append(", layoutHeight=");
        sbLIZ.append(this.layoutHeight);
        sbLIZ.append(", camOutWidth=");
        sbLIZ.append(this.camOutWidth);
        sbLIZ.append(", camOutHeight=");
        sbLIZ.append(this.camOutHeight);
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

    public VEMIMOFilterParam(Parcel parcel) {
        super(parcel);
        this.layoutWidth = parcel.readInt();
        this.layoutHeight = parcel.readInt();
        this.camOutWidth = parcel.readInt();
        this.camOutHeight = parcel.readInt();
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.layoutWidth);
        parcel.writeInt(this.layoutHeight);
        parcel.writeInt(this.camOutWidth);
        parcel.writeInt(this.camOutHeight);
    }
}
