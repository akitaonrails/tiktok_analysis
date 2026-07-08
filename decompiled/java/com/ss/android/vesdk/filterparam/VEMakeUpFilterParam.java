package com.ss.android.vesdk.filterparam;

import X.C2188811AlT;
import X.C2325341G0m;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes36.dex */
public class VEMakeUpFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VEMakeUpFilterParam> CREATOR = new C2325341G0m(46);
    public float blusherIntensity;
    public float lipIntensity;
    public boolean maleMakeupState;
    public String resPath;

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public VEMakeUpFilterParam() {
        this.filterName = "makeup filter";
        this.filterType = 26;
        this.filterDurationType = 1;
        this.resPath = "";
        this.lipIntensity = -1.0f;
        this.blusherIntensity = -1.0f;
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VEMakeUpFilterParam{resPath='");
        sbLIZ.append(this.resPath);
        sbLIZ.append('\'');
        sbLIZ.append(", lipIntensity=");
        sbLIZ.append(this.lipIntensity);
        sbLIZ.append(", blusherIntensity=");
        sbLIZ.append(this.blusherIntensity);
        sbLIZ.append(", filterType=");
        sbLIZ.append(this.filterType);
        sbLIZ.append(", filterName='");
        sbLIZ.append(this.filterName);
        sbLIZ.append('\'');
        sbLIZ.append(", filterDurationType=");
        sbLIZ.append(this.filterDurationType);
        sbLIZ.append(", maleMakeupState=");
        sbLIZ.append(this.maleMakeupState);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VEMakeUpFilterParam(Parcel parcel) {
        super(parcel);
        this.resPath = parcel.readString();
        this.lipIntensity = parcel.readFloat();
        this.blusherIntensity = parcel.readFloat();
        this.maleMakeupState = 1 == parcel.readInt();
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.resPath);
        parcel.writeFloat(this.lipIntensity);
        parcel.writeFloat(this.blusherIntensity);
        parcel.writeInt(this.maleMakeupState ? 1 : 0);
    }
}
