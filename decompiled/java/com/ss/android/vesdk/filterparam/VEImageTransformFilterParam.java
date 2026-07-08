package com.ss.android.vesdk.filterparam;

import X.C2188811AlT;
import X.C2325341G0m;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes36.dex */
public class VEImageTransformFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VEImageTransformFilterParam> CREATOR = new C2325341G0m(41);
    public float beginScale;
    public float endScale;

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public VEImageTransformFilterParam() {
        this.filterName = "image transform filter";
        this.filterType = 20;
        this.beginScale = 1.0f;
        this.endScale = 1.0f;
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VEImageTransformFilterParam{beginScale=");
        sbLIZ.append(this.beginScale);
        sbLIZ.append(", endScale=");
        sbLIZ.append(this.endScale);
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

    public VEImageTransformFilterParam(Parcel parcel) {
        super(parcel);
        this.beginScale = parcel.readFloat();
        this.endScale = parcel.readFloat();
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.beginScale);
        parcel.writeFloat(this.endScale);
    }
}
