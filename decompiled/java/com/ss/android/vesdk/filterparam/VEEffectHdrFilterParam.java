package com.ss.android.vesdk.filterparam;

import X.C2188811AlT;
import X.C2325341G0m;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes36.dex */
public class VEEffectHdrFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VEEffectHdrFilterParam> CREATOR = new C2325341G0m(38);
    public String filterPath;
    public int hdrType;
    public float intensity;

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public VEEffectHdrFilterParam() {
        this.filterName = "effect hdr filter";
        this.filterType = 16;
        this.filterPath = "";
        this.hdrType = 1;
        this.intensity = 1.0f;
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VEEffectHdrFilterParam{filterPath='");
        sbLIZ.append(this.filterPath);
        sbLIZ.append('\'');
        sbLIZ.append(", hdrType=");
        sbLIZ.append(this.hdrType);
        sbLIZ.append(", intensity=");
        sbLIZ.append(this.intensity);
        sbLIZ.append(", filterDurationType=");
        sbLIZ.append(this.filterDurationType);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VEEffectHdrFilterParam(Parcel parcel) {
        super(parcel);
        this.filterPath = parcel.readString();
        this.hdrType = parcel.readInt();
        this.intensity = parcel.readFloat();
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.filterPath);
        parcel.writeInt(this.hdrType);
        parcel.writeFloat(this.intensity);
    }
}
