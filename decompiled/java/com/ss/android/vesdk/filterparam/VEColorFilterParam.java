package com.ss.android.vesdk.filterparam;

import X.C2188811AlT;
import X.C2325341G0m;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes36.dex */
public class VEColorFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VEColorFilterParam> CREATOR = new C2325341G0m(34);
    public float intensity;
    public String leftFilterPath;
    public float position;
    public String rightFilterPath;
    public float rightIntensity;
    public boolean useFilterResIntensity;
    public boolean useFilterV3;

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public VEColorFilterParam() {
        this.filterName = "color filter";
        this.filterType = 7;
        this.filterDurationType = 1;
        this.leftFilterPath = "";
        this.rightFilterPath = "";
        this.position = 1.0f;
        this.intensity = 1.0f;
        this.rightIntensity = 1.0f;
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VEColorFilterParam{leftFilterPath='");
        sbLIZ.append(this.leftFilterPath);
        sbLIZ.append('\'');
        sbLIZ.append(", rightFilterPath='");
        sbLIZ.append(this.rightFilterPath);
        sbLIZ.append('\'');
        sbLIZ.append(", position=");
        sbLIZ.append(this.position);
        sbLIZ.append(", intensity=");
        sbLIZ.append(this.intensity);
        sbLIZ.append(", rightIntensity=");
        sbLIZ.append(this.rightIntensity);
        sbLIZ.append(", useFilterResIntensity=");
        sbLIZ.append(this.useFilterResIntensity);
        sbLIZ.append(", useFilterV3=");
        sbLIZ.append(this.useFilterV3);
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

    public VEColorFilterParam(Parcel parcel) {
        boolean z;
        super(parcel);
        this.leftFilterPath = parcel.readString();
        this.rightFilterPath = parcel.readString();
        this.position = parcel.readFloat();
        this.intensity = parcel.readFloat();
        this.rightIntensity = parcel.readFloat();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.useFilterResIntensity = z;
        this.useFilterV3 = parcel.readByte() != 0;
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.leftFilterPath);
        parcel.writeString(this.rightFilterPath);
        parcel.writeFloat(this.position);
        parcel.writeFloat(this.intensity);
        parcel.writeFloat(this.rightIntensity);
        parcel.writeByte(this.useFilterResIntensity ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.useFilterV3 ? (byte) 1 : (byte) 0);
    }
}
