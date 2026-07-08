package com.ss.android.vesdk.filterparam;

import X.C2188811AlT;
import X.C2325341G0m;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes36.dex */
public class VELensHdrFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VELensHdrFilterParam> CREATOR = new C2325341G0m(44);
    public String filterPath;
    public float intensity;

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public VELensHdrFilterParam() {
        this.filterName = "lens hdr filter";
        this.filterType = 33;
        this.filterPath = "";
        this.intensity = 1.0f;
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VELensHdrFilterParam{filterPath='");
        sbLIZ.append(this.filterPath);
        sbLIZ.append('\'');
        sbLIZ.append(", intensity=");
        sbLIZ.append(this.intensity);
        sbLIZ.append(", filterDurationType=");
        sbLIZ.append(this.filterDurationType);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VELensHdrFilterParam(Parcel parcel) {
        super(parcel);
        this.filterPath = parcel.readString();
        this.intensity = parcel.readFloat();
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.filterPath);
        parcel.writeFloat(this.intensity);
    }
}
